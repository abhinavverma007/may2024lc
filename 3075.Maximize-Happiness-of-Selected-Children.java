//https://leetcode.com/submissions/detail/1253956824/
class Solution {
  public long maximumHappinessSum(int[] happiness, int k) {
    int sz = happiness.length;
    int dec = 0;
    Arrays.sort(happiness);
    int l = sz - 1;
    long ans = 0;
    while (k--> 0) {
      int val = happiness[l] - dec;
      if (val > 0) {
        ans = ans + (happiness[l] - dec);
      }

      dec = dec + 1;
      l = l - 1;

    }
    return ans;

  }
}
