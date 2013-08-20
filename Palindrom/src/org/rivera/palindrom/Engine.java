package org.rivera.palindrom;

import java.io.IOException;
import java.util.ArrayList;


/**
 * The Main Class to get program running.
 *
 * @author Emanuel Rivera
 */

public class Engine {
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	
	public static void main(String[] args) {
		Engine Engine1=new Engine();
		//args=new String[]{"dataset1.xml","output.xml"};
		Engine1.parseArgs(args);	
	}
	
	/**
	 * Parses the args.
	 *
	 * @param args the args
	 */
	public void parseArgs(String[] args){
		if(args.length==2){
			try {
				readXMLAndProduce(args[0],args[1],"dataset");
			} catch (IOException e) {
				System.err.println("File Error -" + e.getMessage());					
			}
		}else{
			System.out.println("usage: palindrom_xml <input file> <output file>");
		}
	}
	
	/**
	 * Clean string.
	 *
	 * @param strInput Plain Text
	 * @return Clean Plain Text
	 */
	public String cleanString(String strInput){
		return strInput.replaceAll("[^A-Za-z0-9]", "").toLowerCase().trim();
	}
	
	/**
	 * Checks if is palindrom.
	 *
	 * @param strInput the str input
	 * @return true, if is palindrom
	 */
	public boolean isPalindrom(String strInput){
		strInput=cleanString(strInput);
		String strReverse= new StringBuilder(strInput).reverse().toString();		
		return strInput.equals(strReverse);
	}
	
	/**
	 * Read arraylist and generate 
	 *
	 * @param inputList the str xml file
	 */
	
	public String generateAnswers(ArrayList<Node> inputList){
		StringBuilder output= new StringBuilder();
		String strLineSep=System.getProperty("line.separator");
		output.append("<?xml version=\"1.0\"?>"+strLineSep);
		output.append("<answers>"+strLineSep);
		for(int i = 0; i<inputList.size(); i++){
			Node currentNode=inputList.get(i);
			if(currentNode.getKey().startsWith("data"))
				output.append("\t<"+currentNode.getKey()+">" + isPalindrom(currentNode.getKey()) 
					+"</"+currentNode.getKey()+">"+strLineSep);
		}
		output.append("</answers>"+strLineSep);
		return output.toString();
	}
	
	/**
	 * Read xml and produce.
	 *
	 * @param strXMLFile the xml file
	 * @param strXMLOuputFile the xml output file
	 * @param strElement the element
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void readXMLAndProduce(String strXMLFile, String strXMLOutputFile,String strElement) throws IOException{
		String FileContent= FileUtils.readFile(strXMLFile);
		DomParser dom1 = new DomParser();
		ArrayList<Node> results= dom1.parseXML(FileContent, strElement);
		String xmlAnswerResults = generateAnswers(results);
		FileUtils.writeStringToFile(xmlAnswerResults, strXMLOutputFile, false);
	}

}
