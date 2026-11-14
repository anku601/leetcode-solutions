//344. Reverse String

class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int i= 0;
        int e= n-1;

        while(i<e){
            char temp= s[i];
            s[i]=s[e];
            s[e]=temp;
            i++;
            e--;
        }
    }
}