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
import java.io.PrintWriter;

/**
 * Class to print text into a file
 * 
 */
public class FilePrinter {

  /**
   * Constructor
   * 
   */
  public FilePrinter() {}

  /**
   * Prints text to a file
   * 
   * @param text String to be printed onto a file
   */
  public void printToFile(String text, String fileName)
      throws FileNotFoundException {

    // Print to a file
    PrintWriter out = new PrintWriter(fileName);
    out.print(text);
    out.close();
  }

}
