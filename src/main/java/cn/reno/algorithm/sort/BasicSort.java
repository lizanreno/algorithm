package cn.reno.algorithm.sort;


import java.util.Scanner;

public class BasicSort {
    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    public   static  void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
        show(a);
    }

    public  static void show(Comparable[] a){
        for(int i= 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a){
        for(int i = 1; i < a.length; i++){
            if(less(a[i],a[i - 1])) return  false;
            return  true;
        }
        return true;
    }

    public static void sort(Comparable[] a){}

    public  static  void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String[] strings = str.split(",");
        sort(strings);
        assert  isSorted(strings);
        show(strings);
    }
}
