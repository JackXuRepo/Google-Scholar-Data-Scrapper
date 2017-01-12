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
package categories;

import java.util.ArrayList;

import driver.DataExtractor;

/**
 * Class to compile description and data of an information category of a google
 * scholar html page
 * 
 */

public class CategoryData {
  // Regex to obtain data
  protected String dataRegex;
  // HTML source code for data scraping
  protected String htmlString;
  // Description of the data
  protected String description;
  // The raw category data
  protected ArrayList<String> content;
  // Object that extracts data from a HTML source code
  protected DataExtractor extractor;

  /**
   * Constructor that initializes objects
   * 
   * @param htmlString The string containing an HTML source code
   */
  public CategoryData(String htmlString) {
    this.htmlString = htmlString;
    content = new ArrayList<String>();
    extractor = new DataExtractor();

  }

  /**
   * Returns the description of this data category
   * 
   */
  public String getCategoryDescription() {
    return description;
  }

  /**
   * Return the raw data of this data category
   * 
   */
  public ArrayList<String> getCategoryContent() {
    compileData();
    return content;
  }

  /**
   * Compile the raw data
   * 
   */
  protected void compileData() {
    content = extractor.extractAsList(dataRegex, htmlString);
  }
}
