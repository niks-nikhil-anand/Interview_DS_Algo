// Implement Upper Bound

// Coding Ninja :- https://www.codingninjas.com/studio/problems/implement-upper-bound_8165383

// Problem statement :- You are given a sorted array 'arr' of distinct values and a target value 'm'.
// You need to search for the index of the target value in the array.

// Note:- If the value is present in the array, return its index.
// If the value is absent, determine the index where it would be inserted in the array while maintaining the sorted order. 

public class Solution {
    public static int searchInsert(int [] arr, int m){
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] >= m){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
    return ans;
    }
}