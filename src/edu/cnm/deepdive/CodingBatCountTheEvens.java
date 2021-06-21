package edu.cnm.deepdive;

/*
Return the number of even ints in the given array.

countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
 */

public class CodingBatCountTheEvens {

  public static void main(String[] args) {
    int[] one = {2, 1, 2, 3, 4};
    int[] two = {2, 2, 0};
    int[] three = {1, 3, 5};
    System.out.printf("with the array %s the result is " + countEvens((one)) + ".\n", "[2, 1, 2, 3, 4]");
    System.out.printf("with the array %s the result is " + countEvens((two)) + ".\n", "[2, 2, 0]");
    System.out.printf("with the array %s the result is " + countEvens((three)) + ".\n", "[1, 3, 5]");


  }

  public static int countEvens(int[] nums) {

    int count = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        count++;
      }
    }
    return count;
  }

}
