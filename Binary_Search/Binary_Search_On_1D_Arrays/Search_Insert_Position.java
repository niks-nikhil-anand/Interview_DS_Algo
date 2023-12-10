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


// Similar Problem :- First Bad Version

// Problem Statement :- You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
// Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
// You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.


/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
         int start = 1;
         int end = n;
         int bad = -1;
         while(start<=end){
             int mid = start+(end-start)/2;
           
             if(isBadVersion(mid)){ 
                 bad = mid;
                 end = mid-1;
             }else { 
                 start = mid+1;
             }
         }
         return bad ;   
        }
    }
