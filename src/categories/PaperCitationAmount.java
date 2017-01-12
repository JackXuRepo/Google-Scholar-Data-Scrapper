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
 * Class to compile description and data of the total number of citations of the
 * first five publications of a google scholar html page
 * 
 */

public class PaperCitationAmount extends CategoryData {

  /**
   * Constructor that overrides variables in super class
   * 
   * @param htmlString The string containing an HTML source code
   */
  public PaperCitationAmount(String htmlString) {

    super(htmlString);
    this.dataRegex = ">([0-9]*)</a></td><td id=\"col-asterisk\">"
        + "</td><td id=\"col-year\">";
    this.description = "Total paper citation(first 5 papers)";
  }

  protected void compileData() {

    // Initialize variable to store number of citations
    int sumOfCitations = 0;

    // Use super class to compile raw data
    super.compileData();

    // Get the length of the raw data list
    int lastIndex = content.size() - 1;

    // Remove unnecessary data until only 5 or less entries are left
    while (lastIndex + 1 > 5) {
      content.remove(lastIndex);
      lastIndex = lastIndex - 1;
    }

    // Add up all the citations
    for (int i = 0; i < content.size(); i++) {
      sumOfCitations += Integer.parseInt(content.get(i));
    }

    // Replace raw data list with the sum of all citations
    content.clear();
    content.add(Integer.toString(sumOfCitations));

  }

}
