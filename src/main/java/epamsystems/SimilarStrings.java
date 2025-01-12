package epamsystems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// write a boolean method that checks if two strings in parameter are similar.
/*
1- abcba, abc ----> similar
2- bca, abcbcbc -----> similar
3- bcd, bc ----> not similar
4- abcd, abde ----> not similar
5- bc, abcd ----> not similar
6- bccc, bbbbbbbc ----> similar

 */
public class SimilarStrings {

    public static void main(String[] args) {
        System.out.println(areSimilar("abcba", "abc"));        // true
        System.out.println(areSimilar("bca", "abcbcbc"));     // true
        System.out.println(areSimilar("bcd", "bc"));           // false
        System.out.println(areSimilar("abcd", "abde"));        // false
        System.out.println(areSimilar("bc", "abcd"));          // false
        System.out.println(areSimilar("bccc", "bbbbbbc"));     // true
    }

    public static boolean areSimilar(String first, String second) {
        Set<Character> set1 = toCharacterSet(first);
        Set<Character> set2 = toCharacterSet(second);

        return set1.equals(set2);
    }

    private static Set<Character> toCharacterSet(String str) {
        Set<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()) {
            set.add(ch);
        }

        return set;
    }


}
