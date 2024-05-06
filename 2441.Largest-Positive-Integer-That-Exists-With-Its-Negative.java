import java.util.*;
import java.io.*;
// https: //leetcode.com/submissions/detail/1250464569
  public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int len = scn.nextInt();
      int[] nums = new int[len];
      for (int i = 0; i < len; i++) {
        nums[i] = scn.nextInt();
      }
      System.out.println(findMaxK(nums));
    }

    public static int findMaxK(int[] nums) {
      int[] store = new int[2001];
      int len = nums.length;
      int maxNumber = Integer.MIN_VALUE;
      for (int i = 0; i < len; i++) {
        int currNumber = nums[i];
        int positive = currNumber + 1000;
        int negative = -currNumber + 1000;
        store[positive] = 1;
        if (store[negative] == 1) {
          maxNumber = Math.max(maxNumber, Math.abs(currNumber));
        }
      }

      if (maxNumber == Integer.MIN_VALUE) {
        return -1;
      }

      return maxNumber;

    }
  }
