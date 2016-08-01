package com.hand;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;



public class App {
	public static void main(String[] args) throws IOException {
		GetResource getRes = new GetResource("http://hq.sinajs.cn/list=sz300170");
		String str = getRes.getResources();
		String[] arr = dowithStr(str);
		
		CreateXML cxml= new CreateXML();
		cxml.create(arr);
	}

	public static String[] dowithStr(String str) {
		String substr = str.substring(21, str.length() - 2);
		String[] arr = substr.split(",");
		return arr;
	}

}
