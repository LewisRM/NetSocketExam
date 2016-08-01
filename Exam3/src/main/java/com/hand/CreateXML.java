package com.hand;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXML {

	public  void create(String[] arr) {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db;
		try {
			db = dbf.newDocumentBuilder();
			Document d = db.newDocument();
			Element xml =  d.createElement("xml");
			Element root =  d.createElement("stock");
			Element name =  d.createElement("name");
			name.setTextContent(arr[0]);
			Element open =  d.createElement("open");
			open.setTextContent(arr[1]);
			Element close =  d.createElement("close");
			close.setTextContent(arr[2]);
			Element current =  d.createElement("current");
			current.setTextContent(arr[3]);
			Element high =  d.createElement("high");
			high.setTextContent(arr[4]);
			Element low =  d.createElement("low");
			low.setTextContent(arr[5]);
			
			root.appendChild(name);
			root.appendChild(open);
			root.appendChild(close);
			root.appendChild(current);
			root.appendChild(high);
			root.appendChild(low);
			
			xml.appendChild(root);
			d.appendChild(xml);
			
			TransformerFactory transf = TransformerFactory.newInstance();
			Transformer transfer;
		
				transfer = transf.newTransformer();
				transfer.transform(new DOMSource(d), new StreamResult(new File("1.xml")));
			
			
			
		} catch (ParserConfigurationException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (TransformerConfigurationException e1) {
			e1.printStackTrace();
		}catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
		} 

	}



