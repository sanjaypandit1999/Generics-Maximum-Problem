package com.bridgelabz;

public class FindMaximumNo {
    public <T extends Comparable> T MaxNo(T x, T y, T z){
        T maximum = x;
        if(y.compareTo(maximum) > 0)
        maximum = y;
        if(z.compareTo(maximum) >0)
        maximum = z;
        return  maximum;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to find maximum no");
        FindMaximumNo maximum = new FindMaximumNo();
        System.out.println("The maximum is " +maximum.MaxNo(50,60, 70));
        System.out.println("The maximum is " +maximum.MaxNo(1.5f,3.6f, 2.6f));
        System.out.println("The maximum is " +maximum.MaxNo("Apple","Peach","Banana"));
    }
}
