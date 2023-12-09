// Coding Ninja :- https://www.codingninjas.com/studio/problems/lower-bound_8165382

// Implement Lower Bound
// Problem statement :- You are given an array 'arr' sorted in non-decreasing order and a number 'x'.
// You must return the index of lower bound of 'x'.

// Note: For a sorted array 'arr', 'lower_bound' of a number 'x' is defined as the 
// smallest index 'idx' such that the value 'arr[idx]' is not less than 'x'


public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        int start = 0;
        int end = n-1;
        int ans = n;
        while(start<=end){
            int mid = start+(end-start)/2;
            // Two Possibilities - 1) May be an anwer 2) May not be an answer
            if(arr[mid]>=x){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
    return ans;
    }
}