class Solution {
    public boolean isPalindrome(String s) {

        String cleaned = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                cleaned += s.charAt(i);
            }
        }

        cleaned = cleaned.toLowerCase();
        for(int i = 0; i < (cleaned.length()/2); i++){
            if(cleaned.charAt(i) != cleaned.charAt(cleaned.length()-1-i)){
                return false;
            }
        }

        return true;
    }
}
