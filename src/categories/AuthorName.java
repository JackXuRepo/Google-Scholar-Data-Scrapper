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
 * Class to compile description and data of author name category of a google
 * scholar html page
 * 
 */
public class AuthorName extends CategoryData {

  /**
   * Constructor that overrides variables in super class
   * 
   * @param htmlString The string containing an HTML source code
   */
  public AuthorName(String htmlString) {

    super(htmlString);
    this.dataRegex = "<span id=\"cit-name-display\" "
        + "class=\"cit-in-place-nohover\">(.*?)</span>";
    this.description = "Name of Author";
  }



}
