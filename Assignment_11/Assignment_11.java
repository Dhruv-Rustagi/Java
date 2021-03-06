package Assignment_11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Using TextFile and a Map<Character,Integer>, create a program that takes the file name as a command line argument and counts the occurrence of all the different characters. Save the results in a text file.

public class Assignment_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0;i<str.length();i++)
        {

            if(map.containsKey(str.charAt(i)) == false)
            {
                map.put(str.charAt(i), 1);
            }
            else
            {
                int val = map.get(str.charAt(i));
                map.put(str.charAt(i), val+1);
            }
        }

        System.out.println(map);
    }
}
