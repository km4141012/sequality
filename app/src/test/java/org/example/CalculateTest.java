package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testSum_TwoAndThree_ReturnsFive() {
    Calculate calculate = new Calculate();
    assertEquals(5, calculate.sum(2, 3));
  }

  @Test
  public void testGetIndividualFee_Age12_Returns1000() {
    Calculate calculate = new Calculate();
    assertEquals(1000, calculate.getIndividualFee(12));
  }

  @Test
  public void testGetIndividualFee_Age13_Returns2000() {
    Calculate calculate = new Calculate();
    assertEquals(2000, calculate.getIndividualFee(13));
  }

  @Test
  public void testGetTotalFee_Age12Size9_Returns9000() {
    Calculate calculate = new Calculate();
    assertEquals(9000, calculate.getTotalFee(12, 9));
  }

  @Test
  public void testGetTotalFee_Age12Size10_Returns9000() {
    Calculate calculate = new Calculate();
    assertEquals(9000, calculate.getTotalFee(12, 10));
  }

  @Test
  public void testGetTotalFee_Age13Size9_Returns18000() {
    Calculate calculate = new Calculate();
    assertEquals(18000, calculate.getTotalFee(13, 9));
  }

  @Test
  public void testGetTotalFee_Age13Size10_Returns18000() {
    Calculate calculate = new Calculate();
    assertEquals(18000, calculate.getTotalFee(13, 10));
  }
}
