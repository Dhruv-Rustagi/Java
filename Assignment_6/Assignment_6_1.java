package Assignment_6;

import java.util.ArrayList;

// A vampire number v is a number with an even number of digits n, that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes, where v contains precisely all the digits from x and from y, in any order. Write a java program to print first 100 vampire numbers.

public class Assignment_6_1 {
    static int k;
    static int number;
    static ArrayList<Integer> ans;
    public static void main(String[] args) {
        k = 100;
        number = 10;
        ans = new ArrayList<>();

        while (k>0)
        {
            int noOfDigits = 0;
            int x = number;
            while(x>0)
            {
                x /=10;
                noOfDigits ++;
            }

            if(noOfDigits%2 == 0) {
                permutatons(Integer.toString(number), noOfDigits, "", "");
            }
            number++;

        }
        for(Integer i : ans)
        {
            System.out.println(i);
        }
    }



    private static void permutatons(String in, int digits, String op, String op2)
    {
        if(op.length() == digits/2 && op2.length() == digits/2)
        {
            if(isVampireNumber(op, op2))
            {
                if(ans.contains(number) == false)
                {
                    ans.add(number);
                    k--;
                }
            }
            return;
        }
        if(in.length() == 0)
        {
            return;
        }

        if(op.length()<digits/2)
        {
            for(int i = 0;i<=op.length();i++)
            {
                permutatons(in.substring(1), digits, op.substring(0,i) + in.charAt(0) + op.substring(i), op2);
            }
        }

        if(op2.length()<digits/2)
        {
            for(int i = 0;i<=op2.length();i++)
            {
                permutatons(in.substring(1), digits, op, op2.substring(0,i) + in.charAt(0) + op2.substring(i));
            }
        }

    }

    private static boolean isVampireNumber(String op, String op2)
    {
        if(op.charAt(op.length()-1)== '0' && op2.charAt(op2.length()-1)== '0')
        {
            return false;
        }
        if(Integer.parseInt(op) * Integer.parseInt(op2) == number)
        {
            return true;
        }
        return false;
    }
}
