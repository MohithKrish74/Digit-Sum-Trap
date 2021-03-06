package com.keyword;


import java.util.*;

public class DigitSumTraps {

    public static int digitSum(int number)
    {
        int sum = 0;
        while(number > 0)
        {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static Boolean checkTrap(int x, int y) {
        if(x < 10 && x % y != 0 && y % x != 0)
        {
            return false;
        }
        return (x == y || (x % y == 0 || y % x == 0) || checkTrap(digitSum(x), y));
    }

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("Enter the number1: ");
        int number1 = in.nextInt();
        System.out.print("Enter the number2: ");
        int number2 = in.nextInt();
        System.out.print("Enter the number for y: ");
        int y  = in.nextInt();
        for(int x = number1; x <= number2; x++)
        {
            if(y < 3)
            {
                y = 3;
            }
            if(checkTrap(x, y))
            {
                list.add(x);
                y += 2;
            }
            else
            {
                y -= 1;
            }

        }
        if(list.isEmpty())
        {
            System.out.println("NONE");
        }
        else
        {
            System.out.println(list);
        }


    }

}
