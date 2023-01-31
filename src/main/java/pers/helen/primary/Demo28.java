package pers.helen.primary;

public class Demo28 {

    public static void main(String[] args){
        String haystack = "hello";
        String needle = "aa";
            System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle){
        return haystack.indexOf(needle);
    }
}
