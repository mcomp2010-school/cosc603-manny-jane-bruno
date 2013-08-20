package org.rivera.palindrom;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
	/**
	 * Read file.
	 *
	 * @param strPath the path
	 * @return Content of file
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static String readFile(String strPath) throws IOException{
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
     * Write string to file.
     *
     * @param Results the results
     * @param Path the path
     * @param append if True, it appends to the file
     * @throws IOException 
     */
    public static void writeStringToFile(String strResults,String strPath,boolean blnAppend) throws IOException{
        FileWriter fstream = new FileWriter(strPath, blnAppend);
        BufferedWriter out = new BufferedWriter(fstream);
        out.write(strResults);
        out.close();
    }
}
