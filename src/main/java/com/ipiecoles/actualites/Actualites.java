package com.ipiecoles.actualites;

import com.owlike.genson.Genson;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;


public class Actualites implements Runnable {

    public ArrayList<ActualitesData> actualites = new ArrayList<>();

    private Integer NB_ELEMENTS  = 10;

    public void run()
    {
        System.out.println(getJson());
    }

    public static void main(String args[])
    {
        Actualites r1=new Actualites();
        Thread t1 =new Thread(r1);
        t1.start();
    }

    public String getJson(){
        List<ActualitesData> datas;
        String json = null;
        try {
            System.out.println(getPageContents("https://www.lemonde.fr/rss/une.xml"));
            datas = getActualites(getPageContents("https://www.lemonde.fr/rss/une.xml"));
            json = createJson(datas);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return json;
    }

    public List<ActualitesData> getActualites(String input) throws IOException, ParserConfigurationException, SAXException {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new InputSource(new StringReader(input)));
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("item");

            for (int temp = 0; temp < NB_ELEMENTS; temp++) {
                ActualitesData actualitesData = new ActualitesData();

                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    actualitesData.setLink(eElement.getElementsByTagName("link").item(0).getTextContent());
                    actualitesData.setTitle(eElement.getElementsByTagName("title").item(0).getTextContent());
                    actualitesData.setDescription(eElement.getElementsByTagName("description").item(0).getTextContent());
                    actualitesData.setPubDate(eElement.getElementsByTagName("pubDate").item(0).getTextContent());
                }
                actualites.add(actualitesData);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return actualites;
    }

    public String createJson(List<ActualitesData> actualites){
        Genson genson = new Genson();
        String json = genson.serialize(actualites);
        return json;
    }

    private String getPageContents(String address) throws IOException {
        BufferedReader br = null;
        StringJoiner lines = new StringJoiner(System.lineSeparator());
        try {
            URL url = new URL(address);
            br = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } finally {
            if (br != null) {
                br.close();
            }
        }
        return lines.toString();

    }

}
