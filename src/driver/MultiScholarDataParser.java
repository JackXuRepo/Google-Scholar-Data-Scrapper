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


public class MultiScholarDataParser {
  /**
   * Class to compile and parse all data relating to multiple google scholar
   * HTML source codes
   * 
   */

  // List of all single scholar parsers
  ArrayList<ScholarDataParser> scholarList;
  // The output formatter
  OutputHandler output;
  // Calculator of total number of co-authors across all source codes
  TotalCoAuthorsCalculator coauthorCalculator;
  // Used for storing together all co-authors across all source codes
  TotalCoAuthorsListCompiler coauthorListCompiler;

  /**
   * Constructor to instantiate objects
   * 
   * @param oh The output formatter
   */
  public MultiScholarDataParser(OutputHandler oh) {
    // Instantiate objects
    scholarList = new ArrayList<ScholarDataParser>();
    output = oh;
    coauthorCalculator = new TotalCoAuthorsCalculator();
    coauthorListCompiler = new TotalCoAuthorsListCompiler();
  }

  /**
   * Parse the raw data from each scholar
   * 
   * @param htmlSources
   */
  public void parseData(String[] htmlSources) throws IOException {
    for (String sourceCode : htmlSources) {
      // Create a new instance of a single scholar parser for each
      // HTML source given
      ScholarDataParser singleScholar =
          new ScholarDataParser(output, sourceCode);
      // Add this instance to the list of all single scholar parsers
      scholarList.add(singleScholar);

      // Used data from each single scholar to formulate output
      output.appendSeparator();
      singleScholar.parseData();
      // If there are still single scholar parsers then reset the index of
      // categories for each single scholar parser
      if (!sourceCode.equals(htmlSources[htmlSources.length - 1])) {
        output.resetOutputIndex();
      }
    }
    // Generate a description for category of all co-authors
    String coAuthorDescription = "Co-Author list sorted (Total: "
        + coauthorCalculator.calculateCoAuthors(htmlSources) + ")";
    // Generate a content for category of all co-authors
    ArrayList<String> coAuthorData =
        coauthorListCompiler.getSortedCoAuthorList(htmlSources);

    // Parse all multi scholar source codes categories
    output.appendSeparator();
    output.appendCategoryName(coAuthorDescription);
    output.appendCategoryData(coAuthorData);

  }


}
