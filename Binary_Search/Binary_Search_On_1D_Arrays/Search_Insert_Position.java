// Search Insert Position

// Problem Statement :- Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.


class Solution {
    public int searchInsert(int[] nums, int target) {
    int start = 0;
    int end = nums.length-1;
    int ans = nums.length;
     while(start<=end){
         int mid = start+(end-start)/2;

         if(nums[mid] == target){
             ans = mid ;
             return ans;
         }else if(nums[mid]>target){
             ans = mid;
             end = mid-1;
         }else{
              start = mid+1;
            
         }
     }
    return ans ;    
    }
}
