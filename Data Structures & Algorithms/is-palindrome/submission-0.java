class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int n = s.length();
        int l=0, r=n-1;
        while(l<r){
            while(!Character.isLetterOrDigit(s.charAt(l)) && l<r) l++;
            while(!Character.isLetterOrDigit(s.charAt(r)) && l<r) r--;
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
