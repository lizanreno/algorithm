package cn.reno.algorithm.sort;

import java.util.Scanner;

/**
 * @Author lizan
 * @Description 选择排序 找到最小元素和第一未排序元素交换
 */
public class SelectionSort extends BasicSort {

    public static void sort(Comparable[] a){
        for(int i = 0; i < a.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < a.length; j++){
                if(less(a[j],a[min])){
                    min = j;
                }
            }
                exch(a,i,min);
                show(a);

        }
    }

    public static void assertSort() {
        String[] strings = getSortLine();
        sort(strings);
        assert  isSorted(strings);
    }

    public  static  void main(String[] args){
        assertSort();
    }
}
