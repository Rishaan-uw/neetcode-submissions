class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChar= new char[s.length()];
        char[] tChar= new char[t.length()];

        for(int i = 0; i < s.length(); i++){
            sChar[i] = s.charAt(i);
            tChar[i] = t.charAt(i); 
        }

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }
}