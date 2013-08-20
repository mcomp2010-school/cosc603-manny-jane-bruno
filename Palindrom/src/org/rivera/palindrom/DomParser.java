package org.rivera.palindrom;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * The Class Node.
 */
class Node implements Comparable<Node> {
	private String Key;
	private String Value;
	
	public Node(String key, String value) {
		super();
		Key = key;
		Value = value;
	}
	
	public String getKey() {
		return Key;
	}
	
	public void setKey(String key) {
		Key = key;
	}
	public String getValue() {
		return Value;
	}
	public void setValue(String value) {
		Value = value;
	}
	
	@Override
	public String toString() {
		return "node [Key=" + Key + ", Value=" + Value + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Key == null) ? 0 : Key.hashCode());
		result = prime * result + ((Value == null) ? 0 : Value.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (Key == null) {
			if (other.Key != null)
				return false;
		} else if (!Key.equals(other.Key))
			return false;
		if (Value == null) {
			if (other.Value != null)
				return false;
		} else if (!Value.equals(other.Value))
			return false;
		return true;
	}

	@Override
	public int compareTo(Node other) {
		return this.Key.compareTo(other.Key);
	}
	
}

/**
 * The Class DomParser.
 */
public class DomParser {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		DomParser Dom1 = new DomParser();
		System.out.println(Dom1.parseXML("<? hello ?> <a><b>1</b><c>2</c></a>","a"));
	}
	
	/**
	 * Parses the xml.
	 *
	 * @param input the input
	 * @param strElement the str element
	 * @return the array list
	 */
	public ArrayList<Node> parseXML(String input, String strElement){
		StringBuilder strBTemp= new StringBuilder();
		ArrayList<String> alList= new ArrayList<String>();
		for(int i=0; i<input.length();i++){
			String strCurrentChar=input.substring(i, i+1);		
			strBTemp.append(strCurrentChar);
			if(strCurrentChar.equals(">")){
				if(strBTemp.toString().trim().contains("</")){
					String[] current = strBTemp.toString().trim().split("<");
					if(current[0].trim().length()!=0)
						alList.add(current[0].trim());
					alList.add("<"+current[1].trim());
					strBTemp.setLength(0);
				}else{
					if(!strBTemp.toString().trim().contains("<?"))
						alList.add(strBTemp.toString().trim());
					strBTemp.setLength(0);
				}
			}
		}
	
		TreeSet<Node> alOut=new TreeSet<Node>();
		boolean blnAppend=false;
		String curKey="";
		for (int i = 0 ; i<alList.size() ; i++){
			String currentItemList = alList.get(i);
			if(currentItemList.startsWith("<")){
				if(currentItemList.startsWith("</")){
					if(strElement.equals(currentItemList.substring(2, currentItemList.length()-1))){
						blnAppend=true;
						curKey="";
					}
				}else{
					if(strElement.equals(currentItemList.substring(1, currentItemList.length()-1)))
						blnAppend=true;	
					if(blnAppend=true)
						curKey=currentItemList;
				}
			}else{
				if(blnAppend==true)
					alOut.add(new Node(curKey.substring(1,curKey.length()-1),currentItemList));
			}
		}		
		return new ArrayList<Node>(alOut);
	}
		
}


