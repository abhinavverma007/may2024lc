class Solution {
// https://leetcode.com/submissions/detail/1250508436/
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int lastInLimit = -1;
        int rescueBoats = 0;
        for(int i=people.length-1; i>=0; i--) {
            if(people[i]<limit) {
                lastInLimit = i;
                break;
            }
            else {
                rescueBoats++;
            }
        }
        
        int firstP = 0;
        int lastP = lastInLimit;
        while(firstP<=lastP) {
            if(people[firstP]+people[lastP]<=limit) {
                lastP--;
                firstP++;
            }
            else {
                lastP--;
            }
            rescueBoats++;
        }
        return rescueBoats;
        
    }
}
