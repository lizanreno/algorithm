package cn.reno.algorithm.sort;

import java.util.Scanner;

public class SelectionSort extends BasicSort {

    public static void sort(Comparable[] a){
        boolean isexch = false;
        for(int i = 0; i < a.length ; i++){
            int min = i;
            for(int j = i + 1; j < a.length; j++){
                if(less(a[j ], a[min])) {
                    min = j;
                    isexch = true;
                }
            }
            if(isexch){
                exch(a,i,min);
                isexch = false;
            }

        }
    }

    public  static  void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String[] strings = str.split(",");
        sort(strings);
        assert  isSorted(strings);
        show(strings);
    }
}
