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

    public Float FloatMaxNo(Float x, Float y, Float z) {
        float maximum = x;
        if (y.compareTo(maximum) > 0)
            maximum = y;
        if (z.compareTo(maximum) > 0)
            maximum = z;
        return maximum;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to find maximum no");
        FindMaximumNo maximum = new FindMaximumNo();
       // System.out.println(max.MaxNo(50,80,70));
        System.out.println(maximum.FloatMaxNo(1.5f,3.6f, 2.6f));
    }
}
