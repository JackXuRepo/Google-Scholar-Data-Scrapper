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

import org.junit.Before;
import org.junit.Test;

import driver.OutputHandler;

/**
 * Test the methods in OutputHandler
 */
public class OutputHandlerTest {
  OutputHandler out;

  /**
   * Initialize the object
   */
  @Before
  public void setUp() throws Exception {
    out = new OutputHandler();
  }

  /**
   * Test the method appendSeparator
   */
  @Test
  public void testAppendSeparator() {
    String expected = "----------------------------------"
        + "-------------------------------------\n";
    String actual;
    out.appendSeparator();
    actual = out.getOutput();
    assertEquals(expected, actual);
  }

  /**
   * Test the method resetOutputIndex
   */
  @Test
  public void testResetOutputIndex() {
    String expected = "1. :\n2. :\n1. :\n";
    String actual;
    out.appendCategoryName("");
    out.appendCategoryName("");
    out.resetOutputIndex();
    out.appendCategoryName("");
    actual = out.getOutput();
    assertEquals(expected, actual);
  }

  /**
   * Test the method appendCategoryName
   */
  @Test
  public void testAppendCategoryName() {
    String expected = "1. a:\n2. b:\n3. c:\n";
    String actual;
    out.appendCategoryName("a");
    out.appendCategoryName("b");
    out.appendCategoryName("c");
    actual = out.getOutput();
    assertEquals(expected, actual);
  }

  /**
   * Test the method appendCategoryData
   */
  @Test
  public void testAppendCategoryData() {
    String expected = "\ta\n\tb\n";
    String actual;
    ArrayList<String> list = new ArrayList<String>();
    list.add("a");
    list.add("b");
    out.appendCategoryData(list);
    actual = out.getOutput();
    assertEquals(expected, actual);
  }


  /**
   * Test the method appendEnumeratedCategoryData
   */
  @Test
  public void testAppendEnumeratedCategoryData() {
    String expected = "\t1-   a\n\t2-   b\n";
    String actual;
    ArrayList<String> list = new ArrayList<String>();
    list.add("a");
    list.add("b");
    out.appendEnumeratedCategoryData(list);
    actual = out.getOutput();
    assertEquals(expected, actual);
  }



}
