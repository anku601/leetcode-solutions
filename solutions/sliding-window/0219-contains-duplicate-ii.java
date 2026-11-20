class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n= nums.length;

        Set<Integer> se =new HashSet<>();


        for(int i=0;i<n;i++){
            if(se.contains(nums[i])){
                return true;
            }
            se.add(nums[i]);

            while(se.size()>k){
                se.remove(nums[i-k]);

            }

        }
        return false;
    }
}