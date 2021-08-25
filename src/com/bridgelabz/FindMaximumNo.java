package com.bridgelabz;

public class FindMaximumNo<T extends  Comparable> {
    public T X, Y, Z;
    public FindMaximumNo(T x, T y, T z) {
         X = x;
         Y = y;
         Z = z;
    }

    public static  <T extends Comparable> T MaxNo(T x, T y, T z){
        T maximum = x;
        if(y.compareTo(maximum) > 0)
        maximum = y;
        if(z.compareTo(maximum) >0)
        maximum = z;
        System.out.println("The maximum is " +maximum);
        return  maximum;
    }
    public  void maiximumIs (){
        FindMaximumNo.MaxNo(X, Y, Z);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to find maximum no");
        new FindMaximumNo<Integer>(50, 70, 60).maiximumIs();
        new FindMaximumNo<Float>(1.2f, 3.4f, 2.6f).maiximumIs();
        new FindMaximumNo<String>("Apple", "Peach", "Banana").maiximumIs();
    }
}
