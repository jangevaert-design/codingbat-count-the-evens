package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatCountTheEvensTest {

  private int[][] evensParams = {
      {2, 1, 2, 3, 4},
      {2, 2, 0},
      {1, 3, 5},
      {},
      {11, 9, 0, 1},
      {2, 11, 9, 0},
      {2},
      {2, 5, 12}
  };

  private int[] evensExpected = {3, 3, 0, 0, 1, 2, 1, 2};

  @Test
  void evensTest() {
    for (int i = 0; i < evensParams.length; i++) {
      int actual = CodingBatCountTheEvens.countEvens(evensParams[i]);
      Assertions.assertEquals(actual, evensExpected[i]);

    }
  }
}