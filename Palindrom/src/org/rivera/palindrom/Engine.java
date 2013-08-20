package org.rivera.palindrom;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

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
		
		Engine1.parseArgs(args);	
	}
	
	/**
	 * Parses the args.
	 *
	 * @param args the args
	 */
	public void parseArgs(String[] args){
		Options options = new Options();
		options.addOption("h","help",false,"Help")
			.addOption("i","input",true,"Input (Required)")
			.addOption("o","output",true,"Output (Required)");
		CommandLineParser parser = new GnuParser();
		try {
			CommandLine cmd = parser.parse( options, args);
			
			if(cmd.hasOption("help")){
				  HelpFormatter formatter = new HelpFormatter();
				  formatter.printHelp("palindrom_xml", options);
			}else if(cmd.hasOption("input") && cmd.hasOption("output")){
				
				try {
					readXMLAndProduce("dataset1.xml","output.xml","dataset");
				} catch (IOException e) {
					System.err.println("File Error -" + e.getMessage());					
				}				
			}else{
				HelpFormatter formatter = new HelpFormatter();
				formatter.printHelp("palindrom_xml", options);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Clean string.
	 *
	 * @param strInput the str input
	 * @return the string
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
	 * Read file.
	 *
	 * @param strPath the str path
	 * @return the string
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public String readFile(String strPath) throws IOException{
		StringBuilder output = new StringBuilder(); 
		BufferedReader br = new BufferedReader(new FileReader(new File(strPath)));
	    String line;
	    while((line = br.readLine()) != null) {
	    	output.append(line);
	    }
	    br.close();
	    return output.toString();
	}
	
	/**
	 * Read xml and produce.
	 *
	 * @param strXMLFile the str xml file
	 * @param strXMLOuputFile the str xml ouput file
	 * @param strElement the str element
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void readXMLAndProduce(String strXMLFile, String strXMLOuputFile,String strElement) throws IOException{
		String FileContent= readFile(strXMLFile);
		DomParser dom1 = new DomParser();
		ArrayList<Node> results= dom1.parseXML(FileContent, strElement);
		
		StringBuilder output= new StringBuilder();
		String strLineSep=System.getProperty("line.separator");
		output.append("<?xml version=\"1.0\"?>"+strLineSep);
		output.append("<answers>"+strLineSep);
		for(int i = 0; i<results.size(); i++){
			Node currentNode=results.get(i);
			if(currentNode.getKey().substring(1,currentNode.getKey().length()-1).startsWith("data"))
				output.append("\t<"+currentNode.getKey()+">" + isPalindrom(currentNode.getKey()) 
					+"</"+currentNode.getKey()+">"+strLineSep);
		}
		output.append("</answers>"+strLineSep);
		
		System.out.println(output.toString());
	}

}
