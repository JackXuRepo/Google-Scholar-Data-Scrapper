// **********************************************************
// Assignment3:
// UTORID user_name: xuhaosen
//
// Author: Haosen Xu
//
//
// Honor Code: I pledge that this program represents my own
// program code and that I have coded on my own. I received
// help from no one in designing and debugging my program.
// *********************************************************
package driver;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyParser {

/**
* @param args
*/
public static void main(String[] args) {
  // Split first argument into an array list containing HTML file names
  String scholarUrl[] = args[0].split(",");
  
  // Instantiate object that extract HTML source code from a HTML file name
  HTMLSourceExtractor extractor = new HTMLSourceExtractor();

  // Instantiate object that prints output onto the console
  ConsolePrinter cprinter = new ConsolePrinter();
  
  // Instantiate object that prints output onto a file
  FilePrinter fprinter = new FilePrinter();
  
  // Instantiate the output formatter
  OutputHandler output = null;
 try {
  output = new OutputHandler();
} catch (FileNotFoundException e1) {
  e1.printStackTrace();
}
 // Instantiate object that parses all HTML source codes
  MultiScholarDataParser parser = new MultiScholarDataParser(output);
  
  // Extract each HTML source codes from the given HTML file names
  for(int i = 0 ; i < scholarUrl.length; i++){
    try {
      scholarUrl[i] = extractor.extractContent(scholarUrl[i]);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  try {
    // Parse the data from the HTML source codes
    parser.parseData(scholarUrl);
  } catch (IOException e) {
    e.printStackTrace();
  }
  
  // Get the output string
  String outputString = output.getOutput();
  
  // Print the output according to the number of arguments given
  if(args.length == 2){
    try {
      // Print output to a file if an extra argument is given
      fprinter.printToFile(outputString, args[1]);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
   }
  else if(args.length == 1){
    // Print output to console if not extra argument is given
    cprinter.printToConsole(outputString);
  }

  
}


}
