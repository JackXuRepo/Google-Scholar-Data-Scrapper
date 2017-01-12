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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import categories.AuthorName;
import categories.CategoryData;
import categories.CitationAmount;
import categories.CoAuthorAmount;
import categories.FirstThreeTitles;
import categories.IndexAmount;
import categories.PaperCitationAmount;

/**
 * Class to compile and parse all data relating to a single google scholar HTML
 * source code
 * 
 */

public class ScholarDataParser {
  // Instance of an HTML source code extractor
  HTMLSourceExtractor extractor;
  // The html source code
  String htmlString;
  // All relevant data categories relating to a google scholar
  ArrayList<CategoryData> scholarContents = new ArrayList<CategoryData>();
  // Instance of the output formatter
  OutputHandler output;

  /**
   * Constructor to instantiate objects
   * 
   * @param oh The output formatter
   * @param htmlContent The HTML source code
   */
  public ScholarDataParser(OutputHandler oh, String htmlContent)
      throws IOException {
    htmlString = htmlContent;
    output = oh;

    // Store and instantiate each of the data categories into an array list
    scholarContents.add(new AuthorName(htmlString));
    scholarContents.add(new CitationAmount(htmlString));
    scholarContents.add(new IndexAmount(htmlString));
    scholarContents.add(new FirstThreeTitles(htmlString));
    scholarContents.add(new PaperCitationAmount(htmlString));
    scholarContents.add(new CoAuthorAmount(htmlString));

  }

  /**
   * Parse the raw data from each category
   * 
   */
  public void parseData() {
    // For each category data of a scholar get its description and data and
    // let the output formatter format it
    for (CategoryData data : scholarContents) {
      // Get the category description and send it to the output formatter
      output.appendCategoryName(data.getCategoryDescription());
      // If a category needs enumeration for each new line send it to the
      // appropriate method in output formatter
      if (data instanceof FirstThreeTitles) {
        output.appendEnumeratedCategoryData(data.getCategoryContent());
      } else {
        output.appendCategoryData(data.getCategoryContent());
      }
    }
  }

}
