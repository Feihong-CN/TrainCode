package main;

public class D746 {
    public int minCostClimbingStairs(int[] cost) {
        if(cost==null)
            return -1;
        if (cost.length==0)
            return 0;
        if (cost.length==1)
            return cost[0];

        int n=cost.length+1;
        int[] ints = new int[n];
        ints[0]=0;
        ints[1]=cost[0];
        for (int i = 2; i < n; i++) {
            ints[i]=Math.min(ints[i-2]+cost[i-2],ints[i-1]+cost[i-1]);
        }

        int[] ints2 = new int[n];
        ints2[0]=0;
        ints2[1]=0;
        ints2[2]=cost[1];
        for (int i = 3; i < n; i++) {
            ints2[i]=Math.min(ints2[i-2]+cost[i-2],ints2[i-1]+cost[i-1]);
        }
        return Math.min(ints[n-1],ints2[n-1]);
    }
}
