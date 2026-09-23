class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i],i);
        }
        for(int i=0; i<nums.length; i++){
            int solution=target-nums[i];

            if(map.containsKey(solution)&&map.get(solution)!=i){
                return new int[]{i,map.get(solution)};
            }
        }
        return new int[] {};
    }
}
