class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int noOfTrial=minutesToTest/minutesToDie;
        double ans=Math.ceil(Math.log(buckets)/Math.log(noOfTrial+1));
        return (int)(ans);
    }
}