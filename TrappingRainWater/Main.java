package com.company;

public class Main {
    public static int find_total_water(int arr[],int n){
        int totalWaterCount = 0;
        //O(n^2)
        for(int i =1;i<n-1;i++){ //O(n)
            int left_max = find_left_max(arr,n,i); //O(n) -- O(1)
            int right_max = find_right_max(arr,n,i); //O(n) -- O(1)
            //O(n) + O(n) -- O(2n) -- O(n)
            totalWaterCount += (Math.min(left_max, right_max) - arr[i]);
        }
        return totalWaterCount;

    }
    public static int find_left_max(int arr[],int n, int i){
        int maxi_left = 0;
        for(int j = 0;j<=i;j++){
            maxi_left = Math.max(arr[j],maxi_left);
        }
        return maxi_left;
    }
    public static int find_right_max(int arr[],int n, int i){
        int maxi_right = 0;
        for(int j = i;j<n;j++){
            maxi_right = Math.max(arr[j],maxi_right);

        }
        return maxi_right;

    }
    public static void main(String[] args) {
	// write your code here
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = arr.length;
        System.out.println(find_total_water(arr,n));
    }
}
