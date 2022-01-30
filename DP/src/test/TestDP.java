package test;

import main.D70;
import main.D746;
import org.junit.Test;

public class TestDP {
    @Test
    public void test70(){
        D70 d70 = new D70();
        int i = d70.climbStairs(4);
        System.out.println(i);
    }
    @Test
    public void test746(){
        int[] cost = {10,15,20};
        D746 d746 = new D746();
        int i = d746.minCostClimbingStairs(cost);
        System.out.println(i);
    }

}
