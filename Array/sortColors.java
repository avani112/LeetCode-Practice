/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
*/
// 1ms solution
class Solution {
    public void sortColors(int[] nums) {
        int j = 0;
        int prevI = 0;
        for(int i=0; i<nums.length-1; i++)  {
            j++;
            if( j < nums.length) i = prevI;
            else j = i + 1;         
            if(nums[i] > nums[j]){  
                int temp = nums[i]; 
                nums[i] = nums[j]; 
                nums[j] = temp;
            }           
            prevI = i;
        }
    }
}

// 8ms solution 
class Solution {
    public void sortColors(int[] nums) {
        int count0=0,count1=0,count2=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) count0++;
            else if(nums[i]==1) count1++;
            else count2++;
        }
        System.out.println(count0+" "+count1+" "+count2);
        for(int i=0;i<count0;i++) nums[i]=0;
        for(int i=count0;i<count0+count1;i++) nums[i]=1;
        for(int i=count0+count1;i<count0+count1+count2;i++) nums[i]=2;
    }
}

