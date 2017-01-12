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
 * Class to compile description and data of number of i10-index after 2009 of a
 * google scholar html page
 * 
 */

public class IndexAmount extends CategoryData {

  /**
   * Constructor that overrides variables in super class
   * 
   * @param htmlString The string containing an HTML source code
   */
  public IndexAmount(String htmlString) {

    super(htmlString);
    this.dataRegex = "<td class=\"cit-borderleft cit-data\""
        + ">([0-9]+)</td></tr></tbody></table></td><";
    this.description = "Number of i10-index after 2009";
  }


}
