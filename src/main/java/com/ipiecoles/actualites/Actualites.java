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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;


public class Actualites implements Runnable {

    public ArrayList<String> actualites;

    private Integer NB_ELEMENTS  = 10;

    public void run()
    {
        try {
            getActualites(null);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[])
    {
        Actualites r1=new Actualites();
        Thread t1 =new Thread(r1);
        t1.start();
    }

    public Document getXmlData(){
        Document doc = null;
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(new InputSource(new StringReader("https://www.lemonde.fr/rss/une.xml")));
            doc.getDocumentElement().normalize();
        } catch (Exception e){
            e.printStackTrace();
        }

        return doc;
    }

    public String replaceDoubleQuote(String input){
        return input.replaceAll("\"", "\\\\\"");
    }
    //Ajouter la fonction getXmlData
    public List<ActualitesData> getActualites(String dataXml) throws IOException, ParserConfigurationException, SAXException {
        try {

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            URLConnection urlConnection = new URL("https://www.lemonde.fr/rss/une.xml").openConnection();
            urlConnection.addRequestProperty("Accept", "application/xml");
            Document doc = dBuilder.parse(urlConnection.getInputStream());
            doc.getDocumentElement().normalize();


            NodeList nList = doc.getElementsByTagName("item");

            for (int temp = 0; temp < NB_ELEMENTS; temp++) {
                ActualitesData actualitesData = new ActualitesData();
                String json = "{";

                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    json += "\"link\": \"" + eElement.getElementsByTagName("link").item(0).getTextContent() + "\"," +
                            "";
                    json += "\"title\": \"" + eElement.getElementsByTagName("title").item(0).getTextContent()+ "\"," +
                            "";
                    json += "\"description\": \"" + eElement.getElementsByTagName("description").item(0).getTextContent()+ "\"," +
                            "";
                    json += "\"pubDate\": \"" + eElement.getElementsByTagName("pubDate").item(0).getTextContent()+ "\"" +
                            "";


                }
                json += "}";
                //actualites.add(actualitesData);
                System.out.println(json);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Return la list
        return null;
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
