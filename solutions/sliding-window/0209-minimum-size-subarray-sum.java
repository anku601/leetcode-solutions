class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        

        int n = nums.length;
        int j=0;
        int cnt=0;
        int cntMin=Integer.MAX_VALUE;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];
            cnt++;

           

                while(sum>=target){
                    if(target<=sum)cntMin= Math.min(cnt,cntMin);
                    sum= sum-nums[j];
                    j++;
                    cnt--;
                    
                }
            
        }
        if(cntMin==Integer.MAX_VALUE){
            return 0;
        }
        

        return cntMin;
    }
}