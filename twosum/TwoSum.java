package leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jingzhao.ssh
 * @date 14-11-17
 */
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> tmpRes = new HashMap<Integer, Integer>();
        for(int i=0; i<numbers.length; i++){
            if(!tmpRes.containsKey(numbers[i]))
                tmpRes.put(numbers[i], i);
            if(tmpRes.containsKey(target - numbers[i])){
                if(i != tmpRes.get(target - numbers[i])){
                    return new int[] {tmpRes.get(target - numbers[i]) +1, i+1};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
