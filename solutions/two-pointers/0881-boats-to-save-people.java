class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        int n= people.length;
        Arrays.sort(people);
        int cnt=0;
        int i=0;
        int k= n-1;

        while(i<=k){
            int sum =people[i]+people[k];
            if(sum==limit){
                i++;
                k--;
                cnt++;
            }
            else if(sum>limit){
                cnt++;
                k--;
            }
            else{
                i++;
                k--;
                cnt++;
            }
        }
        return cnt;
        
    }
}