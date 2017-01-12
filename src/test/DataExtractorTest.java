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
package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import driver.DataExtractor;

/**
 * Test the methods in DataExtractor
 */

public class DataExtractorTest {

  /**
   * Test extractAsList method
   */
  @Test
  public void testExtractAsList() {
    DataExtractor extractor = new DataExtractor();
    String regex = "(?:http|ttp):(.*?)_(.*?)_";
    String content = "ttp:hi_hello_";
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("hi");
    expected.add("hello");
    ArrayList<String> actual = extractor.extractAsList(regex, content);
    
    assertEquals(expected, actual);
  }

}
