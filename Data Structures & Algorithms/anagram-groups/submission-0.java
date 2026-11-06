class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            int[] alphabet = new int[26];
            for(int j = 0; j < strs[i].length(); j++){
                char letter = strs[i].charAt(j);
                int index = letter - 'a';
                alphabet[index]++;
            }

            String key = "";
            for(int count : alphabet){
                key += count;
                key += ",";
            }
            if(m.containsKey(key)){
                m.get(key).add(strs[i]);
            } else{
                m.put(key, new ArrayList<String>());
                m.get(key).add(strs[i]);
            }
        }

        List<List<String>> list = new ArrayList<>();
        for(String key : m.keySet()){
            list.add(m.get(key));
        }
        return list;
    }
}
