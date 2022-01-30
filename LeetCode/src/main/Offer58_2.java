package main;

public class Offer58_2 {
    public String reverseLeftWords(String s, int n) {
        String substring = s.substring(0, n);
        String substring2 = s.substring(n,s.length());
        String s1 =  substring2+substring;
        return s1;
    }
}
