/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. 
*/
class Solution {
    public int fib(int n) {
      int a=0, b=1, sum=0;
        if(n==0 || n==1){return n;}
        for(int i=1; i<n; i++){
            sum = a+b;
            a = b;
            b = sum;
        }
        return sum;
    }
}