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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import categories.CoAuthorList;

/**
 * Class to store all co-authors across multiple HTML source codes in a list
 * 
 */
public class TotalCoAuthorsListCompiler {
  /**
   * Constructor
   * 
   */
  public TotalCoAuthorsListCompiler() {}

  /**
   * Store all co-authors across multiple HTML source codes in an array list
   * 
   * @param htmlSources The array of HTML source code for co-author extraction
   * @return Array list of all co-authors in the given HTML source codes
   * 
   */
  public ArrayList<String> getSortedCoAuthorList(String[] htmlSources) {

    // Initialize a set to store all co-authors
    Set<String> totalCoAuthors = new HashSet<String>();
    // Initialize an array list to store all co-authors from a single
    // source code
    ArrayList<String> singleSourceCoAuthors;

    // For each source code in the given array of source codes get the list
    // of co-authors
    for (String source : htmlSources) {
      singleSourceCoAuthors = new CoAuthorList(source).getCategoryContent();
      // For each co-author add it to the total set of co-authors
      for (String coauthor : singleSourceCoAuthors) {
        totalCoAuthors.add(coauthor);
      }
    }

    // Convert the set to an array list tht contains all co-authors
    ArrayList<String> totalCoAuthorsList =
        new ArrayList<String>(totalCoAuthors);

    // Sort the list alphabetically
    Collections.sort(totalCoAuthorsList);

    return totalCoAuthorsList;

  }

}
