package cn.reno.algorithm.basic;

public class SlideWindowAlgorithm {

    public int maxWindowSum(int[] a, int n) throws RuntimeException{
        int maxSum = 0;
        if(a.length < n){
           throw new RuntimeException("数量不足");
        }else{
            for(int i = 0; i < n; i++){
                maxSum += a[i];
            }

        }
        return maxSum;
    }
}
