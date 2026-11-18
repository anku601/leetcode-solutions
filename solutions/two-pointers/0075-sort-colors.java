class Solution {
    public void sortColors(int[] nums) {

        int n= nums.length;

        int mid=0;

        int start =0;
        int end= n-1;

        while(mid<=end){

           switch(nums[mid]){

                case 0:
                    int temp=nums[mid];
                    nums[mid]=nums[start];
                    nums[start]=temp;
                    start++;
                    mid++;
                    break;
                case 1 :
                    mid++;
                    break;
                case 2:
                    int temp2=nums[mid];
                    nums[mid]=nums[end];
                    nums[end]=temp2;
                    end--;
                    break;
            
           }
        } 
    }
}