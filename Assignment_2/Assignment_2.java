package Assignment_2;

import java.util.*;

// Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive). Write time and space complexity of your solution as comments in the source file.

public class Assignment_2 {
    public static void main(String[] args) {

//         Time Complexity = O(n)
//         Space Complexity = O(n)

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String str = sc.nextLine();

        str = str.toLowerCase();

        boolean freq[] = new boolean[26];

        for(int i = 0;i<str.length();i++)
        {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                freq[str.charAt(i) - 'a'] = true;
            }
        }

        boolean containsAll = true;

        for(int isPresent = 0;isPresent<26;isPresent++)
        {
//            System.out.println(isPresent);
            if(freq[isPresent] == false)
            {
                containsAll = false;
                break;
            }
        }

        if(containsAll)
        {
            System.out.println("String contains all characters from a to z");
        }
        else
        {
            System.out.println("String does not contains all characters from a to z");
        }
    }
}

