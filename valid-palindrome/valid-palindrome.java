class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        // s= s.replaceAll("[^a-zA-Z0-9]","");
        int j = s.length() - 1;
        
        // s= s.toLowerCase();
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){i++;}
            else if(!Character.isLetterOrDigit(s.charAt(j))){j--;}
            else{
            if(Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;j--;
            }
        }
        
        return true;
    }
}