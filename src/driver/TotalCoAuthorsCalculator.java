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

import categories.CoAuthorAmount;

/**
 * Class to calculate all co-authors across multiple HTML source codes
 * 
 */
public class TotalCoAuthorsCalculator {

  /**
   * Constructor
   * 
   */
  public TotalCoAuthorsCalculator() {}

  /**
   * Class to calculate all co-authors across multiple HTML source codes
   * 
   * @param htmlSources The list of HTML source code strings
   * @return The total number of co-authors across all given HTML source codes
   */
  public int calculateCoAuthors(String[] htmlSources) {
    // Initialize total number of co-authors to 0
    int totalNumOfCoAuthors = 0;

    // For each source code given add up the number of co-authors
    for (String source : htmlSources) {
      // Create a new CoAuthorAmount and extract its data so that it can be
      // converted to an integer and add to the total number of co-authors
      totalNumOfCoAuthors += Integer
          .parseInt(new CoAuthorAmount(source).getCategoryContent().get(0));
    }
    // Return the total number of co-authors
    return totalNumOfCoAuthors;
  }


}
