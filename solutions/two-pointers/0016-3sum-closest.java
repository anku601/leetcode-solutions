class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int n= nums.length;

        int ans= Integer.MAX_VALUE;
        int res=0;

        Arrays.sort(nums);


        for(int i=0;i<n;i++ ){

            int j= i+1;
            int k= n-1;

            while(j<k){

                int sum=nums[i]+nums[j]+nums[k];

                int diff=Math.abs(sum-target);

                if(diff<ans){
                    ans=diff;
                    res=sum;

                }
                if(sum==target){
                    return sum;
                }
                else if(sum>target){
                    k--;
                }
                else{
                    j++;
                }

            }
        }
         return res;
        
    }
}