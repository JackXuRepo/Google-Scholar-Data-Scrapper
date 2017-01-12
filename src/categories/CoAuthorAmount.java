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

/**
 * Class to compile description and data of number of co-authors of a google
 * scholar html page
 * 
 */

public class CoAuthorAmount extends CoAuthorList {

  /**
   * Constructor that overrides variables in super class
   * 
   * @param htmlString The string containing an HTML source code
   */
  public CoAuthorAmount(String htmlString) {
    super(htmlString);
    this.description = "Total Co-Authors";
  }

  /**
   * Compile the raw data of this data category
   * 
   */
  protected void compileData() {

    // Use the super class to compile
    super.compileData();

    // Count the size of the compile data
    int numOfCoauthors = content.size();

    // Clear content and add the number of co-authors as the raw data
    content.clear();
    content.add(Integer.toString(numOfCoauthors));
  }



}
