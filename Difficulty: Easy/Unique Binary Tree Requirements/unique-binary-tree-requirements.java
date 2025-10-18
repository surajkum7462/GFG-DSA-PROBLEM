// User function Template for Java

class Solution {

    public static boolean isPossible(int a, int b) {
        // Code here
        return (Math.abs(a-b)==1) && (a+b>=3) && (a+b<=5);
    }
}