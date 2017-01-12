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
import driver.TotalCoAuthorsCalculator;

/**
 * Test the methods in TotalCoAuthorsCalculator
 */
public class TotalCoAuthorsCalculatorTest {

  /**
   * Test the method calculateCoAuthors
   */
  @Test
  public void testCalculateCoAuthors() throws IOException {
    TotalCoAuthorsCalculator calculator = new TotalCoAuthorsCalculator();
    HTMLSourceExtractor extractor = new HTMLSourceExtractor();
    String list[] = {"sample1.html", "sample2.html", "sample3.html"};
    for (int i = 0; i < 3; i++) {
      list[i] = extractor.extractContent(list[i]);
    }
    int actual = calculator.calculateCoAuthors(list);
    int expected = 29;
    assertEquals(expected, actual);
  }

}
