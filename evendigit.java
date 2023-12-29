//Given an array nums of integers, return how many of them contain an even number of digits.
class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        
        for(int num : nums){
            if(even(num)){
                c++;
            }
        }
        return c;
    }
    public boolean even(int i){
        int c = 0;
        while(i>0){
            i = i/10;
            c++;
        }
        if(c%2==0){
            return true;
        }
        return false;
    }
}
