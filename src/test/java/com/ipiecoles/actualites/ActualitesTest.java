package com.ipiecoles.actualites;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class ActualitesTest {

    @Test
    public void testActualites() throws ParserConfigurationException, SAXException, IOException {
        // Given
        Actualites actualites = new Actualites();
        String input = "<rss version=\"2.0\" xmlns:atom=\"http://www.w3.org/2005/Atom\" xmlns:media=\"http://search.yahoo.com/mrss/\"><channel><title>Le Monde.fr - Actualités et Infos en France et dans le monde</title><description>Le Monde.fr - 1er site d’information. Les articles du journal et toute l’actualité en continu : International, France, Société, Economie, Culture, Environnement, Blogs ...</description><copyright>Le Monde - L’utilisation des flux RSS du Monde.fr est réservée à un usage strictement personnel, non professionnel et non collectif. Toute autre exploitation doit faire l’objet d’une autorisation et donner lieu au versement d’une rémunération. Contact : droitsdauteur@lemonde.fr</copyright><link>https://www.lemonde.fr/rss/une.xml</link><pubDate>Fri, 12 Feb 2021 08:42:32 +0000</pubDate><language>fr</language><atom:link href=\"https://www.lemonde.fr/rss/une.xml\" rel=\"self\" type=\"application/rss+xml\"/><item><title><![CDATA[Covid-19 : les variants de plus en plus présents, la situation sanitaire en France est en sursis]]></title><pubDate>Fri, 12 Feb 2021 03:50:16 +0100</pubDate><description><![CDATA[« Les prochaines semaines nous diront si les mesures actuelles suffisent », a reconnu Olivier Véran, alors que le variant britannique est responsable à lui seul de près d’un quart des contaminations au Covid-19.]]></description><guid isPermaLink=\"true\">https://www.lemonde.fr/planete/article/2021/02/12/covid-19-face-aux-variants-la-situation-sanitaire-en-france-est-en-sursis_6069668_3244.html</guid><link>https://www.lemonde.fr/planete/article/2021/02/12/covid-19-face-aux-variants-la-situation-sanitaire-en-france-est-en-sursis_6069668_3244.html</link><media:content url=\"https://img.lemde.fr/2021/02/12/415/0/4988/2494/644/322/60/0/b0dd899_358330499-000-92292t.jpg\" width=\"644\" height=\"322\"><media:credit scheme=\"urn:ebu\">NICOLAS TUCAT / AFP</media:credit></media:content></item><item><title><![CDATA[OpenLux : un petit parfum de ’Ndrangheta au Luxembourg]]></title><pubDate>Fri, 12 Feb 2021 06:00:15 +0100</pubDate><description><![CDATA[Plusieurs figures montantes de la puissante Mafia calabraise se sont installées dans le Grand-Duché, éveillant l’intérêt de la justice italienne.]]></description><guid isPermaLink=\"true\">https://www.lemonde.fr/les-decodeurs/article/2021/02/12/openlux-un-petit-parfum-de-mafia-calabraise-au-luxembourg_6069681_4355770.html</guid><link>https://www.lemonde.fr/les-decodeurs/article/2021/02/12/openlux-un-petit-parfum-de-mafia-calabraise-au-luxembourg_6069681_4355770.html</link><media:content url=\"https://img.lemde.fr/2021/02/11/162/0/1950/975/644/322/60/0/14a439b_648826476-chapitre-5-papier-2.png\" width=\"644\" height=\"322\"/></item><item><title><![CDATA[L’islamisme au cœur du débat télévisé entre Gérald Darmanin et Marine Le Pen]]></title><pubDate>Fri, 12 Feb 2021 01:47:33 +0100</pubDate><description><![CDATA[Le ministre de l’intérieur a défendu le projet de loi sur le séparatisme, dont la présidente du parti d’extrême droite estime qu’il a été « vidé de son sens ».]]></description><guid isPermaLink=\"true\">https://www.lemonde.fr/politique/article/2021/02/12/l-islamisme-au-c-ur-d-un-debat-cordial-entre-gerald-darmanin-et-marine-le-pen_6069660_823448.html</guid><link>https://www.lemonde.fr/politique/article/2021/02/12/l-islamisme-au-c-ur-d-un-debat-cordial-entre-gerald-darmanin-et-marine-le-pen_6069660_823448.html</link><media:content url=\"https://img.lemde.fr/2021/02/11/212/0/5424/2712/644/322/60/0/d436cd2_5198878-01-06.jpg\" width=\"644\" height=\"322\"><media:description type=\"plain\">Marine Le Pen face à Gérald Darmanin sur le plateau de « Vous avez la parole », le 11 février sur France 2.</media:description><media:credit scheme=\"urn:ebu\">STÉPHANE DE SAKUTIN / AFP</media:credit></media:content></item><item><title><![CDATA[Le « parcours du combattant » de Jeanne P., victime d’inceste, sans nouvelles de la justice depuis deux ans]]></title><pubDate>Fri, 12 Feb 2021 01:59:47 +0100</pubDate><description><![CDATA[Après avoir déposé plainte en février 2019 à Lyon contre son ancien beau-père, son dossier a d’abord été transmis à Clermont-Ferrand à la fin 2019 et un juge n’a été saisi que le 8 février.]]></description><guid isPermaLink=\"true\">https://www.lemonde.fr/societe/article/2021/02/12/le-parcours-du-combattant-de-marie-victime-d-inceste-sans-nouvelles-de-la-justice-depuis-deux-ans_6069661_3224.html</guid><link>https://www.lemonde.fr/societe/article/2021/02/12/le-parcours-du-combattant-de-marie-victime-d-inceste-sans-nouvelles-de-la-justice-depuis-deux-ans_6069661_3224.html</link><media:content url=\"https://img.lemde.fr/2021/02/12/1413/0/3999/1995/644/322/60/0/bf7225f_530188498-dscf0088.jpg\" width=\"644\" height=\"322\"><media:description type=\"plain\">Jeanne P., dans la région lyonnaise, le 11 février.</media:description><media:credit scheme=\"urn:ebu\">BRUNO AMSELLEM POUR « LE MONDE »</media:credit></media:content></item><item><title><![CDATA[Destitution de Donald Trump : l’accusation juge une condamnation nécessaire pour protéger la démocratie]]></title><pubDate>Fri, 12 Feb 2021 04:34:37 +0100</pubDate><description><![CDATA[Les procureurs démocrates se sont efforcés de relier l’ex-président des Etats-Unis à l’assaut contre le Congrès. Mais leur efficacité ne devrait pas briser la solidarité républicaine.]]></description><guid isPermaLink=\"true\">https://www.lemonde.fr/international/article/2021/02/12/destitution-de-trump-l-accusation-juge-une-condamnation-necessaire-pour-proteger-la-democratie_6069669_3210.html</guid><link>https://www.lemonde.fr/international/article/2021/02/12/destitution-de-trump-l-accusation-juge-une-condamnation-necessaire-pour-proteger-la-democratie_6069669_3210.html</link><media:content url=\"https://img.lemde.fr/2021/02/11/250/0/3000/1500/644/322/60/0/934d415_5199594-01-07.jpg\" width=\"644\" height=\"322\"><media:credit scheme=\"urn:ebu\">Samuel Corum / AFP</media:credit></media:content></item><item><title><![CDATA[La ruée vers Chami, « capitale de l’or » en Mauritanie]]></title><pubDate>Thu, 11 Feb 2021 18:00:13 +0100</pubDate><description><![CDATA[La ville est passée de 2 600 habitants en 2013 à près de 11 000 aujourd’hui. Trois mille personnes y travaillent à produire jusqu’à 30 kg d’or par jour, trouvant parfois « des pépites grosses comme le poing ».]]></description><guid isPermaLink=\"true\">https://www.lemonde.fr/afrique/article/2021/02/11/mauritanie-a-chami-la-ruee-vers-l-or_6069631_3212.html</guid><link>https://www.lemonde.fr/afrique/article/2021/02/11/mauritanie-a-chami-la-ruee-vers-l-or_6069631_3212.html</link><media:content url=\"https://img.lemde.fr/2021/02/10/233/0/2448/1224/644/322/60/0/8785ea8_894022417-naturimages-18cgd00634.jpg\" width=\"644\" height=\"322\"><media:description type=\"plain\">Dans le désert mauritanien, des milliers d'orpailleurs ont décidé de tenter leur chance à la recherche d'or. Les risques considérables encourus sont, selon eux, à la mesure de l'enjeu : sortir de la pauvreté. A Chami, en août 2017.</media:description><media:credit scheme=\"urn:ebu\">Ahmed LEMINE / Naturimages</media:credit></media:content></item><item><title><![CDATA[Covid-19 : visualisez l’évolution de l’épidémie en France et dans le monde]]></title><pubDate>Tue, 05 May 2020 18:07:51 +0200</pubDate><description><![CDATA[La situation sanitaire en France et à l’étranger, synthétisée par « Le Monde » en cartes et en graphiques et actualisée chaque jour.]]></description><guid isPermaLink=\"true\">https://www.lemonde.fr/les-decodeurs/article/2020/05/05/coronavirus-age-mortalite-departements-pays-suivez-l-evolution-de-l-epidemie-en-cartes-et-graphiques_6038751_4355770.html</guid><link>https://www.lemonde.fr/les-decodeurs/article/2020/05/05/coronavirus-age-mortalite-departements-pays-suivez-l-evolution-de-l-epidemie-en-cartes-et-graphiques_6038751_4355770.html</link><media:content url=\"https://img.lemde.fr/2020/10/08/0/0/2560/1280/644/322/60/0/6d01ae0_954500046-img-de-taille-e-10x.png\" width=\"644\" height=\"322\"/></item><item><title><![CDATA[Comment la neige révèle que les trottoirs sont trop petits]]></title><pubDate>Thu, 28 Dec 2017 10:58:57 +0100</pubDate><description><![CDATA[Lorsqu’une rue ou un carrefour sont recouverts de neige, les traces laissées par les roues des voitures dessinent avec précision l’espace qu’elles utilisent.]]></description><guid isPermaLink=\"true\">https://www.lemonde.fr/economie/video/2017/12/28/comment-la-neige-revele-que-les-trottoirs-sont-trop-petits_5235238_3234.html</guid><link>https://www.lemonde.fr/economie/video/2017/12/28/comment-la-neige-revele-que-les-trottoirs-sont-trop-petits_5235238_3234.html</link><media:content url=\"https://img.lemde.fr/2021/02/10/819/0/4928/2461/644/322/60/0/f411033_5189257-01-06.jpg\" width=\"644\" height=\"322\"><media:credit scheme=\"urn:ebu\">JEAN-FRANCOIS MONIER / AFP</media:credit></media:content></item><item><title><![CDATA[Le sexisme de Yoshiro Mori, ex-patron des JO de Tokyo, symbole d’un machisme enraciné au Japon]]></title><pubDate>Fri, 12 Feb 2021 03:32:32 +0100</pubDate><description><![CDATA[Les propos qui ont précipité sa démission, annoncée vendredi matin, ne relèvent pas du simple dérapage verbal. Les gérontes du monde politique en sont coutumiers.]]></description><guid isPermaLink=\"true\">https://www.lemonde.fr/international/article/2021/02/12/au-japon-le-sexisme-de-yoshiro-mori-symbole-d-un-machisme-enracine_6069667_3210.html</guid><link>https://www.lemonde.fr/international/article/2021/02/12/au-japon-le-sexisme-de-yoshiro-mori-symbole-d-un-machisme-enracine_6069667_3210.html</link><media:content url=\"https://img.lemde.fr/2021/02/12/342/0/3500/1750/644/322/60/0/5f3663c_5201542-01-06.jpg\" width=\"644\" height=\"322\"><media:credit scheme=\"urn:ebu\">KIM KYUNG-HOON / AFP</media:credit></media:content></item><item><title><![CDATA[Le chorégraphe Rachid Ouramdane veut faire de Chaillot un « théâtre des diversités »]]></title><pubDate>Fri, 12 Feb 2021 09:00:41 +0100</pubDate><description><![CDATA[Le codirecteur du Centre chorégraphique national de Grenoble depuis 2016 a été nommé à la tête de l’établissement dédié à la danse.]]></description><guid isPermaLink=\"true\">https://www.lemonde.fr/culture/article/2021/02/12/le-choregraphe-rachid-ouramdane-veut-faire-de-chaillot-un-theatre-des-diversites_6069694_3246.html</guid><link>https://www.lemonde.fr/culture/article/2021/02/12/le-choregraphe-rachid-ouramdane-veut-faire-de-chaillot-un-theatre-des-diversites_6069694_3246.html</link><media:content url=\"https://img.lemde.fr/2021/02/12/0/0/5760/2877/644/322/60/0/d8424e3_883182251-portrait-rachid-ouramdane-cre-dit-ge-raldine-aresteanu-1.jpeg\" width=\"644\" height=\"322\"><media:description type=\"plain\">Le chorégraphe Rachid Ouramdane en 2015.</media:description><media:credit scheme=\"urn:ebu\">GÉRALDINE ARESTEANU</media:credit></media:content></item><item><title><![CDATA[Covid-19 : le confinement décrété pour cinq jours à Melbourne, en plein Open d’Australie]]></title><pubDate>Fri, 12 Feb 2021 05:56:12 +0100</pubDate><description><![CDATA[Le tournoi de tennis va tout de même se poursuivre, mais à huis clos. Un foyer de contamination est apparu dans un hôtel ayant servi à la quarantaine de plusieurs joueurs.]]></description><guid isPermaLink=\"true\">https://www.lemonde.fr/planete/article/2021/02/12/covid-19-le-confinement-decrete-pour-cinq-jours-a-melbourne-en-plein-open-d-australie_6069675_3244.html</guid><link>https://www.lemonde.fr/planete/article/2021/02/12/covid-19-le-confinement-decrete-pour-cinq-jours-a-melbourne-en-plein-open-d-australie_6069675_3244.html</link><media:content url=\"https://img.lemde.fr/2021/02/12/416/0/5000/2500/644/322/60/0/428b6bc_5201703-01-06.jpg\" width=\"644\" height=\"322\"><media:credit scheme=\"urn:ebu\">BRANDON MALONE / AFP</media:credit></media:content></item><item><title><![CDATA[Vaccin anti-Covid : « Une majorité des bénéficiaires est issue des classes les plus aisées et ne représente pas la population la plus vulnérable »]]></title><pubDate>Fri, 12 Feb 2021 06:15:20 +0100</pubDate><description><![CDATA[La campagne de vaccination doit donner la priorité aux plus fragiles, tant au niveau local qu’international, recommandent dans une tribune au « Monde » trois médecins généralistes, Jacques Battistoni, Alexandre Feltz et Denis Lemasson.]]></description><guid isPermaLink=\"true\">https://www.lemonde.fr/idees/article/2021/02/12/vaccin-anti-covid-une-majorite-des-beneficiaires-est-issue-des-classes-les-plus-aisees-et-ne-represente-pas-la-population-la-plus-vulnerable_6069683_3232.html</guid><link>https://www.lemonde.fr/idees/article/2021/02/12/vaccin-anti-covid-une-majorite-des-beneficiaires-est-issue-des-classes-les-plus-aisees-et-ne-represente-pas-la-population-la-plus-vulnerable_6069683_3232.html</link><media:content url=\"https://img.lemde.fr/2021/02/11/199/0/6460/3226/644/322/60/0/f4f871c_754486908-pns-777102108.jpg\" width=\"644\" height=\"322\"><media:description type=\"plain\">« Toutes les recherches sur les inégalités sociales de santé l’ont montré : les conditions sociales et territoriales de vie jouent un rôle majeur dans la survenue des maladies.  »</media:description><media:credit scheme=\"urn:ebu\">Radius Images / Photononstop</media:credit></media:content></item><item><title><![CDATA[Biathlon : la difficile succession de Martin Fourcade chez les Bleus]]></title><pubDate>Fri, 12 Feb 2021 06:38:20 +0100</pubDate><description><![CDATA[Les biathlètes français ont l’occasion vendredi lors du sprint des championnats du monde de Pokljuka (Slovénie) de redorer un début de saison en demi-teinte.]]></description><guid isPermaLink=\"true\">https://www.lemonde.fr/sport/article/2021/02/12/biathlon-la-difficile-succession-de-martin-fourcade-chez-les-bleus_6069686_3242.html</guid><link>https://www.lemonde.fr/sport/article/2021/02/12/biathlon-la-difficile-succession-de-martin-fourcade-chez-les-bleus_6069686_3242.html</link><media:content url=\"https://img.lemde.fr/2021/02/10/394/0/4726/2363/644/322/60/0/60e0ffe_5188208-01-06.jpg\" width=\"644\" height=\"322\"><media:description type=\"plain\">Le leader des Bleus, Quentin Fillon Maillet – ici le 10 février –, aura à cœur, lors des championnats du monde de Pokljuka, de sauver une saison décévante jusque-là.</media:description><media:credit scheme=\"urn:ebu\">JURE MAKOVEC / AFP</media:credit></media:content></item><item><title><![CDATA[Chick Corea, légendaire pianiste de jazz, est mort à 79 ans]]></title><pubDate>Thu, 11 Feb 2021 23:23:49 +0100</pubDate><description><![CDATA[Le musicien est mort mardi d’une forme rare de cancer. Il était, avec Herbie Hancock et Keith Jarrett, l’un des pianistes les plus influents du XXe siècle.]]></description><guid isPermaLink=\"true\">https://www.lemonde.fr/disparitions/article/2021/02/11/le-pianiste-chick-corea-legende-americaine-du-jazz-est-mort-a-79-ans_6069653_3382.html</guid><link>https://www.lemonde.fr/disparitions/article/2021/02/11/le-pianiste-chick-corea-legende-americaine-du-jazz-est-mort-a-79-ans_6069653_3382.html</link><media:content url=\"https://img.lemde.fr/2021/02/11/250/0/3000/1500/644/322/60/0/d515e73_75f80b7ce6e34e63b65b23d0e688895f-75f80b7ce6e34e63b65b23d0e688895f-0.jpg\" width=\"644\" height=\"322\"><media:credit scheme=\"urn:ebu\">Mike Carlson / Mike Carlson/Invision/AP</media:credit></media:content></item><item><title><![CDATA[Touché par une cyberattaque « massive », l’hôpital de Dax veut poursuivre les soins coûte que coûte]]></title><pubDate>Fri, 12 Feb 2021 02:54:35 +0100</pubDate><description><![CDATA[Le centre hospitalier est victime depuis mardi d’un rançongiciel : un logiciel malveillant qui a paralysé le système informatique local, et exige le paiement d’une rançon pour en récupérer l’accès et les données.]]></description><guid isPermaLink=\"true\">https://www.lemonde.fr/pixels/article/2021/02/12/touche-par-une-cyberattaque-massive-l-hopital-de-dax-veut-poursuivre-les-soins-coute-que-coute_6069664_4408996.html</guid><link>https://www.lemonde.fr/pixels/article/2021/02/12/touche-par-une-cyberattaque-massive-l-hopital-de-dax-veut-poursuivre-les-soins-coute-que-coute_6069664_4408996.html</link><media:content url=\"https://img.lemde.fr/2021/02/12/633/0/4571/2283/644/322/60/0/f609cd1_390278734-451226.jpg\" width=\"644\" height=\"322\"><media:description type=\"plain\">L’accueil du centre hospitalier de Dax (Landes), le 10 février.</media:description><media:credit scheme=\"urn:ebu\">IROZ GAIZKA / AFP</media:credit></media:content></item><item><title><![CDATA[Covid-19 : « Parler de variant sud-africain est inapproprié et stigmatisant »]]></title><pubDate>Thu, 11 Feb 2021 20:00:11 +0100</pubDate><description><![CDATA[Le professeur Salim Abdool Karim, spécialiste du virus en Afrique du Sud, revient sur la décision du pays de suspendre le déploiement des vaccins AstraZeneca.]]></description><guid isPermaLink=\"true\">https://www.lemonde.fr/afrique/article/2021/02/11/covid-19-parler-de-variant-sud-africain-est-inapproprie-et-stigmatisant_6069644_3212.html</guid><link>https://www.lemonde.fr/afrique/article/2021/02/11/covid-19-parler-de-variant-sud-africain-est-inapproprie-et-stigmatisant_6069644_3212.html</link><media:content url=\"https://img.lemde.fr/2021/02/09/186/0/3500/1750/644/322/60/0/629d694_ppp-dad06-health-coronavirus-africa-0209-11.JPG\" width=\"644\" height=\"322\"><media:credit scheme=\"urn:ebu\">DADO RUVIC / REUTERS</media:credit></media:content></item><item><title><![CDATA[La BBC interdite en Chine après une enquête sur des viols et tortures de Ouïgoures]]></title><pubDate>Thu, 11 Feb 2021 20:41:03 +0100</pubDate><description><![CDATA[BBC World News a diffusé un reportage contenant des récits de violences sexuelles contre des Ouïgoures dans des camps d’internement chinois. Londres dénonce une atteinte inacceptable à la liberté de la presse.]]></description><guid isPermaLink=\"true\">https://www.lemonde.fr/international/article/2021/02/11/la-bbc-interdite-par-pekin-apres-une-enquete-sur-des-viols-et-tortures-de-ouigoures-dans-des-camps-chinois_6069649_3210.html</guid><link>https://www.lemonde.fr/international/article/2021/02/11/la-bbc-interdite-par-pekin-apres-une-enquete-sur-des-viols-et-tortures-de-ouigoures-dans-des-camps-chinois_6069649_3210.html</link><media:content url=\"https://img.lemde.fr/2021/02/11/449/0/5390/2695/644/322/60/0/6be0e0e_5197666-01-06.jpg\" width=\"644\" height=\"322\"><media:credit scheme=\"urn:ebu\">BEN STANSALL / AFP</media:credit></media:content></item><item><title><![CDATA[75 % des restaurants amenés à disparaître : pourquoi ce chiffre est trompeur]]></title><pubDate>Thu, 11 Feb 2021 20:16:14 +0100</pubDate><description><![CDATA[Un chiffre sur l’avenir de la restauration sorti du livre « The Great Reset » suscite l’inquiétude en France. Il s’agit d’une estimation de mars 2020 qui semble très surévaluée.]]></description><guid isPermaLink=\"true\">https://www.lemonde.fr/les-decodeurs/article/2021/02/11/75-des-restaurants-amenes-a-disparaitre-pourquoi-ce-chiffre-est-trompeur_6069647_4355770.html</guid><link>https://www.lemonde.fr/les-decodeurs/article/2021/02/11/75-des-restaurants-amenes-a-disparaitre-pourquoi-ce-chiffre-est-trompeur_6069647_4355770.html</link><media:content url=\"https://img.lemde.fr/2020/11/25/334/0/3500/1750/644/322/60/0/3cb2b79_gggchp17-health-coronavirus-france-1125-11.JPG\" width=\"644\" height=\"322\"><media:description type=\"plain\">Un restaurant fermé en raison des restrictions sanitaires, le 25 novembre à Paris. </media:description><media:credit scheme=\"urn:ebu\">CHARLES PLATIAU / REUTERS</media:credit></media:content></item></channel></rss>\n";


        System.out.println(input);
        // When
        List<ActualitesData> actualitesData = null;
        try {
            actualitesData = actualites.getActualites(input);
        } catch (org.xml.sax.SAXException e) {
            e.printStackTrace();
        }

        // Then

        // Créer une classe avec les data
        // Object créer avec la bonne valeurs dans les attributs

        Assertions.assertThat(actualitesData.get(0).getLink()).isEqualTo("https://www.lemonde.fr/planete/article/2021/02/12/covid-19-face-aux-variants-la-situation-sanitaire-en-france-est-en-sursis_6069668_3244.html");
        Assertions.assertThat(actualitesData.get(0).getTitle()).isEqualTo("Covid-19 : les variants de plus en plus présents, la situation sanitaire en France est en sursis");
        Assertions.assertThat(actualitesData.get(0).getDescription()).isEqualTo("« Les prochaines semaines nous diront si les mesures actuelles suffisent », a reconnu Olivier Véran, alors que le variant britannique est responsable à lui seul de près d’un quart des contaminations au Covid-19.");
        Assertions.assertThat(actualitesData.get(0).getPubDate()).isEqualTo("Fri, 12 Feb 2021 03:50:16 +0100");

    }
}
