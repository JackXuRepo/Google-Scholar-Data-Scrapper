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
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class to extract data from a HTML source code using regexes
 * 
 */

public class DataExtractor {
  private Pattern patternObject;
  private Matcher matcherObject;

  /**
   * Constructor
   * 
   */
  public DataExtractor() {}


  /**
   * Extract data represented by a regex from a string source and return each
   * captured group as an element in an array list
   * 
   * @param dataRegex The regular expression for extraction of data
   * @param htmlString The string to be extracted from
   * @return An array list containing the data extracted
   */
  public ArrayList<String> extractAsList(String dataRegex, String htmlString) {

    // Initialize array list to store matching data
    ArrayList<String> dataList = new ArrayList<String>();

    // Total number of captured groups
    int groupCount;

    // Set up the matcher and pattern objects
    patternObject = Pattern.compile(dataRegex);
    matcherObject = patternObject.matcher(htmlString);

    // Find all occurrences of matching data
    while (matcherObject.find()) {
      // Store data extracted from each capture group in an array list
      groupCount = matcherObject.groupCount();
      for (int i = 1; i <= groupCount; i++) {
        dataList.add(matcherObject.group(i));
      }
    }

    return dataList;
  }



}
