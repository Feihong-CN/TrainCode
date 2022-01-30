package test;

import main.Offer05;
import main.Offer53_1;
import main.Offer58_2;
import org.junit.Test;

import main.Offer30;

public class TestLeetCode {

    @Test
    public void testOffer30(){
        Offer30 offer30 = new Offer30();
        offer30.push(512);
        offer30.push(-1024);
        offer30.push(-1024);
        offer30.push(512);
        offer30.pop();
        int min = offer30.min();
        offer30.pop();
        int min2 = offer30.min();
        offer30.pop();
        int min3 = offer30.min();
    }
    @Test
    public void testOffer05(){
        Offer05 offer05 = new Offer05();
        String s = offer05.replaceSpace("We are happy.");
        System.out.println(s);
    }
    @Test
    public void testOffer58_2(){
        Offer58_2 offer58_2 = new Offer58_2();
        String abcdefg = offer58_2.reverseLeftWords("abcdefg", 2);
    }
    @Test
    public void testOffer53_1(){
        Offer53_1 offer53_1 = new Offer53_1();
        int[] nums={1,2,2};
        int target=2;
        int search = offer53_1.search(nums, target);
        System.out.println(search);

    }

}