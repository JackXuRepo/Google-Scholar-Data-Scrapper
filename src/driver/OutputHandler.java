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
import java.util.ArrayList;

/**
 * Class to format and generate output
 * 
 */
public class OutputHandler {
  // The output string
  private String output;
  // Keeps track of how many categories have been formatted
  private int numOfCategories;

  /**
   * Constructor to initialize variables
   * 
   */
  public OutputHandler() throws FileNotFoundException {
    output = "";
    numOfCategories = 1;
  }

  /**
   * Append a separator string to the output
   * 
   */
  public void appendSeparator() {
    output += "----------------------------------"
        + "-------------------------------------\n";
  }

  /**
   * Reset the counter which keeps track of how many categories have been
   * formatted
   * 
   */
  public void resetOutputIndex() {
    // Reset the counter to 1
    numOfCategories = 1;
  }

  /**
   * Format a category description/title and append to output
   * 
   * @param name The raw title/description of the category to be formatted
   */
  public void appendCategoryName(String name) {
    // Format and append the category description
    output += Integer.toString(numOfCategories) + ". " + name + ":\n";
    // Increase description counter by 1
    numOfCategories++;

  }

  /**
   * Format a category's data and append to output
   * 
   * @param data The array list containing raw data of the category to be
   *        formatted
   */
  public void appendCategoryData(ArrayList<String> data) {
    // Format each element in the array list
    for (String line : data) {
      output += "\t" + line + "\n";
    }
  }

  /**
   * Format a category's data with each new line enumerated and append to output
   * 
   * @param data The array list containing raw data of the category to be
   *        formatted
   */
  public void appendEnumeratedCategoryData(ArrayList<String> data) {

    // Initialize a counter
    int count = 1;

    // Format each element in the array list enumerating them with the
    // value of counter
    for (String line : data) {
      output += "\t" + Integer.toString(count) + "-   " + line + "\n";
      // increase counter by 1
      count++;

    }
  }


  /**
   * Return the output string
   * 
   * @return The output string
   */
  public String getOutput() {
    return output;
  }

}
