package javaLanguage;

public class ClimbStair {
    public static void main(String[] args) {

        System.out.println(countDistinctWayToClimbStair(5));
    }

    public static long countDistinctWayToClimbStair(int nStairs) {

        // base case
        if (nStairs < 0) return 0;
        if (nStairs == 0) return 1;

        return countDistinctWayToClimbStair(nStairs - 1)
                + countDistinctWayToClimbStair(nStairs - 2);
    }
}


// 3940 -> 2000 * 1 rup , 500 * 1, 200 * 2, 100 * 1, 20 *2,  10 note