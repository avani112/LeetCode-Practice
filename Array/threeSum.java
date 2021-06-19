/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
*/

class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        Set<List<Integer>> set=new HashSet<>();
        Arrays.sort(a);
        int n=a.length;
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=a[i]+a[j]+a[k];
                if(sum==0) set.add(Arrays.asList(a[i],a[j++],a[k--]));
                else if(sum>0) k--;
                else j++;
            }
        }
       return new ArrayList(set);
    }
}
