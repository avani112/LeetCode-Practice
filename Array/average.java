/*
Given an array of unique integers salary where salary[i] is the salary of the employee i.

Return the average salary of employees excluding the minimum and maximum salary.
*/
class Solution {
    public double average(int[] salary) {
        int min=salary[0],max=salary[0] ;
        int sum=0; double avg=0.0;
        for(int i=0;i<salary.length;i++){ 
            sum=sum+salary[i];// find sum 
            if(salary[i]<min) min=salary[i]; // find minimum 
            if(salary[i]>max) max=salary[i]; // find maximum
        }
        avg=(double) (sum-min-max)/(salary.length-2); average all excluding min and max
        return avg;
    }
}