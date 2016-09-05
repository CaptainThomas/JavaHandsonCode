public class Solution {
    public void rotate(int[] nums, int k) {
        //here k is the kth element from the end
        //k=1 for the last element and so on
        
        k=k%nums.length;
        int n = nums.length;
        
        //reverse the array from start to n-kth elements
        reverse(nums,0,n-1-k);
        
        //reverse the aray from kth to end
        reverse(nums,n-k,n-1);
        
        //reverse entire array
        reverse(nums,0,n-1);
        
    }
    
    public void reverse(int[] nums, int left, int right) {
        while(left<right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}