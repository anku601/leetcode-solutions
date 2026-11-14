class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        int n= s.length();

        for(int i=0;i<n;i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                ans.append(Character.toLowerCase(s.charAt(i)));
            }
            else if (s.charAt(i)>='a' && s.charAt(i)<='z'){
                ans.append(s.charAt(i));
            }
            else if (s.charAt(i)>='0' && s.charAt(i)<='9'){
                ans.append(s.charAt(i));
            }
        }
        String res= ans.toString();

        int i=0;
        int e= res.length()-1;
        while(i<e){
            if(res.charAt(i)==res.charAt(e)){
                i++;
                e--;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}