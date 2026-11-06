class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(m.containsKey(nums[i])){
                m.put(nums[i], m.get(nums[i]) + 1);
            } else{
                m.put(nums[i], 1);
            }
        }


        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for(int num: m.keySet()){
            int freq = m.get(num);

            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }

            buckets[freq].add(num);
        }

        int[] result = new int[k];
        int index = 0;

        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result[index] = num;
                    index++;

                    if (index == k) {
                        return result;
                    }
                }
            }
        }

        return result;
        
    }
}
