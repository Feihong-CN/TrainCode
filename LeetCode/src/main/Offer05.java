package main;

public class Offer05 {
    public String replaceSpace(String s) {
        if (s==null)
            return null;
        String replace = s.replace(" ", "%20");
        return replace;
    }
}
