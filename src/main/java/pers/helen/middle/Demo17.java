package pers.helen.middle;

import java.util.ArrayList;
import java.util.List;

public class Demo17 {

    public static void main(String[] args){

    }

    public static List<String> letterCombinations(String digits){
        List<String> result = new ArrayList<>();
        if(digits.length() < 1){
            return result;
        }
        String[] strings = digits.split("");
        List<char[]> list = new ArrayList<>();
        for(String str : strings){
            char[] chars = getChars(Integer.valueOf(str));
            list.add(chars);
        }
        for(char[] chars : list){

        }
        return result;
    }

    public static char[] getChars(int digit){
        char[] chars = new char[4];
        switch(digit){
            case 2:
                chars[0] = 'a';
                chars[1] = 'b';
                chars[2] = 'c';
                break;
            case 3:
                chars[0] = 'd';
                chars[1] = 'e';
                chars[2] = 'f';
                break;
            case 4:
                chars[0] = 'g';
                chars[1] = 'h';
                chars[2] = 'i';
                break;
            case 5:
                chars[0] = 'j';
                chars[1] = 'k';
                chars[2] = 'l';
                break;
            case 6:
                chars[0] = 'm';
                chars[1] = 'n';
                chars[2] = 'o';
                break;
            case 7:
                chars[0] = 'p';
                chars[1] = 'q';
                chars[2] = 'r';
                chars[3] = 's';
                break;
            case 8:
                chars[0] = 't';
                chars[1] = 'u';
                chars[2] = 'v';
                break;
            case 9:
                chars[0] = 'w';
                chars[1] = 'x';
                chars[2] = 'y';
                chars[3] = 'z';
                break;
        }
        return chars;
    }
}
