import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int presum = 0;
        int count = 0;
        //创建一个hashmap K为前缀和，V为个数统计
        Map<Integer,Integer> presumMap = new HashMap<>();
        presumMap.put(0,1);
        for (int num : nums) {
            //计算前缀和
            presum += num;
            //统计，默认为无
            count += (presumMap.containsKey(presum - k))?presumMap.get(presum - k):0;
            //往hashmap里面加键值对
            presumMap.put(presum,presumMap.getOrDefault(presum,0)+1);
        }
        return count;
    }
}