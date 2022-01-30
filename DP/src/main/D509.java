package main;

public class D509 {
    public int fib(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        int[] ints = new int[n+1];
        ints[0]=0;
        ints[1]=1;
        for (int i = 2; i <= n; i++) {
            ints[i]=ints[i-1]+ints[i-2];
        }
        return ints[n];
    }

    public int rec(int n){
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        else{
            return rec(n-1)+rec(n-2);
        }
    }
}
