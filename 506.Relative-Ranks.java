// https://leetcode.com/submissions/detail/1253011726/
class Solution {
  public String[] findRelativeRanks(int[] score) {

    Pair[] pairArray = new Pair[score.length];
    for (int i = 0; i < score.length; i++) {
      pairArray[i] = new Pair(i, score[i]);
    }

    Arrays.sort(pairArray, new Comparator < Pair > () {
      @Override
      public int compare(Pair p1, Pair p2) {
        return p2.y - p1.y;
      }
    });

    String[] arr = new String[score.length];
    int count = 1;
    for (int i = 0; i < score.length; i++) {
      // System.out.println("P:\n"+pairArray[i].x+","+pairArray[i].y);
      if (count == 1) {
        arr[pairArray[i].x] = "Gold Medal";
      } else if (count == 2) {
        arr[pairArray[i].x] = "Silver Medal";
      } else if (count == 3) {
        arr[pairArray[i].x] = "Bronze Medal";
      } else {
        arr[pairArray[i].x] = count + "";
      }
      count++;

    }

    return arr;

  }

}

class Pair {
  int x;
  int y;

  public Pair(int x, int y) {
    this.x = x;
    this.y = y;
  }
}
