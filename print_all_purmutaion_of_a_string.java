package recursion;

import java.util.*;

public class print_all_purmutaion_of_a_string {
    public static void permutation(String s, int d, String newst) {
        if (s.length() == 0) {
            System.out.println(newst);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String n = s.substring(0, i) + s.substring(i + 1);
            permutation(n, d + 1, newst + c);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        permutation(s, 0, " ");
    }
}
