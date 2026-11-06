class Solution {

    public String encode(List<String> strs) {

        String encoded_string = "";
        for(int i = 0; i < strs.size(); i++){
            int charNum = strs.get(i).length();
            encoded_string += charNum;
            encoded_string += "#";
            encoded_string += strs.get(i);
        }

        return encoded_string;
    }

    public List<String> decode(String str) {

        List<String> decoded_strs = new ArrayList<>();
        String build = "";
        int i = 0;
        while(i < str.length()){
            int hashPos = str.indexOf('#', i);
            int charsNum = Integer.parseInt(str.substring(i,hashPos));
            
            String word = str.substring(hashPos + 1, hashPos + 1 + charsNum);
            decoded_strs.add(word);
            i = hashPos + 1 + charsNum;
        }

        return decoded_strs;
    }

}
