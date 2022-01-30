package main;

public class D70 {
    public int climbStairs(int n) {
        if (n==0)
            return -1;
        else if(n==1)
            return 1;
        else if(n==2)
            return 2;
        int[] ints = new int[n+1];
        ints[0]=-1;
        ints[1]=1;
        ints[2]=2;
        for (int i = 3; i < ints.length; i++) {
            ints[i]=ints[i-1]+ints[i-2];
        }
        return ints[n];
    }
}
