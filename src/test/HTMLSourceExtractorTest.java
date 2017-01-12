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

import java.io.IOException;

import org.junit.Test;

import driver.HTMLSourceExtractor;

/**
 * Test the methods in HTMLSourceExtractor
 */
public class HTMLSourceExtractorTest {


  /**
   * Test extractContent method
   */
  @Test
  public void testExtractContent() {
    HTMLSourceExtractor extractor = new HTMLSourceExtractor();
    String expected = "<br><a>\"This/is/an\"=<html>=file";
    String actual = "";
    try {
      actual = extractor.extractContent("sample3.html");
    } catch (IOException e) {
      e.printStackTrace();
    }
    assertEquals(expected, actual);

  }

}
