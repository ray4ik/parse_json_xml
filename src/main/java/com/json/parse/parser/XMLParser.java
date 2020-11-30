package com.json.parse.parser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import com.json.parse.menu.MenuItem;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.function.Function;

public class XMLParser extends Parser {
    public XMLParser(String fileName) {
        super(fileName);
    }

    @Override
    public void parse() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(new File(this.fileName));
        this.menu.clear();

        NodeList nodeList = document.getDocumentElement().getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;

                Function<String, String> getValue = s -> element.getElementsByTagName(s).item(0)
                        .getChildNodes().item(0).getNodeValue();

                String name = getValue.apply("name");
                String description = getValue.apply("description");
                String price = getValue.apply("price");
                String calories = getValue.apply("calories");

                this.menu.add(new MenuItem(name, description, price, calories));
            }
        }
    }
}
