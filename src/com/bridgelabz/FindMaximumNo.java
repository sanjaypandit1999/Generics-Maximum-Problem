package com.bridgelabz;

public class FindMaximumNo {
    public Integer MaxNo(Integer x, Integer y, Integer z){
        Integer maximum = x;
        if(y.compareTo(maximum) > 0)
        maximum = y;
        if(z.compareTo(maximum) >0)
        maximum = z;
        return  maximum;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to find maximum no");
        FindMaximumNo max = new FindMaximumNo();
        System.out.println(max.MaxNo(50,80,70));
    }
}
