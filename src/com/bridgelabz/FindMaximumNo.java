package com.bridgelabz;

public class FindMaximumNo<T extends  Comparable> {
    public T i, i1,i2, i3, i4 ,i5;

    public FindMaximumNo(T i, T i1, T i2, T i3, T i4, T i5 ) {
        this.i =i;
        this.i1 = i1;
        this.i2 =i2;
        this.i3 =i3;
        this.i4 = i4;
        this.i5 = i5;
    }

    public static  <T extends Comparable> T MaxNo(T i, T i1, T i2, T i3, T i4, T i5){
        T maximum = i;
        if(i1.compareTo(maximum) > 0)
        maximum = i1;
        if(i2.compareTo(maximum) >0)
        maximum = i2;
        if(i3.compareTo(maximum) > 0)
            maximum = i3;
        if(i4.compareTo(maximum) >0)
            maximum = i4;
        if(i5.compareTo(maximum) >0)
            maximum = i5;
        return  maximum;
    }
    public static <T> void print(T maximum) {
        System.out.println("The maximum is " +maximum);

    }
    public  void maiximumIs (){
        T maximum = FindMaximumNo.MaxNo(i, i1, i2, i3, i4, i5);
        print(maximum);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to find maximum no");
        new FindMaximumNo<Integer>(50, 70, 60, 80, 90,75).maiximumIs();
        new FindMaximumNo<Float>(1.2f, 3.4f, 2.6f,8.6f, 4.6f,7.5f).maiximumIs();
        new FindMaximumNo<String>("Apple", "Peach", "Banana","Guava", "orange", "mango").maiximumIs();
    }
}
