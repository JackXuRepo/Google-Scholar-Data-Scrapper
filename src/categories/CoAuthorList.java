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
 * Class to compile description and data of all co-author names of a google
 * scholar html page
 * 
 */

public class CoAuthorList extends CategoryData {

  /**
   * Constructor that overrides variables in super class
   * 
   * @param htmlString The string containing an HTML source code
   */
  public CoAuthorList(String htmlString) {

    super(htmlString);
    this.dataRegex = "href=\"http://scholar.google.ca/citations\\?"
        + "user=(?:.*?)=en\" title=\"(.*?)\">(?:.*?)</a><br>";
    this.description = "Co-Author list sorted";
  }



}
