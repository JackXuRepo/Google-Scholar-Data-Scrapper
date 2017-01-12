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
 * Class to compile description and data of number of all citations of a google
 * scholar html page
 * 
 */

public class CitationAmount extends CategoryData {

  /**
   * Constructor that overrides variables in super class
   * 
   * @param htmlString The string containing an HTML source code
   */
  public CitationAmount(String htmlString) {

    super(htmlString);
    this.dataRegex = ">Citations</a></td>"
        + "<td class=\"cit-borderleft cit-data\">([0-9]+)</td>";
    this.description = "Number of All Citations";
  }


}
