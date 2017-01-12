package categories;

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
/**
 * Class to compile description and data of first three publication titles of a
 * google scholar html page
 * 
 */

public class FirstThreeTitles extends CategoryData {

  /**
   * Constructor that overrides variables in super class
   * 
   * @param htmlString The string containing an HTML source code
   */
  public FirstThreeTitles(String htmlString) {

    super(htmlString);
    this.dataRegex = "class=\"cit-dark-large-link\">(.*?)</a><br>";
    this.description = "Title of the first 3 publications";
  }

  /**
   * Compile the raw data of this data category
   * 
   */
  protected void compileData() {

    // Use super class to compile raw data
    super.compileData();

    // Get the last index of the raw data list
    int lastIndex = content.size() - 1;

    // Remove title data from the raw data until only 3 or less is left
    while (lastIndex + 1 > 3) {
      content.remove(lastIndex);
      lastIndex = lastIndex - 1;
    }

  }

}
