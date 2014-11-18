package leetcode.test;

import junit.framework.Assert;
import leetcode.twosum.TwoSum;
import org.junit.Test;

/**
 *
 * @author jingzhao.ssh
 * @date 14-11-17
 */
public class TwoSumTest {

    private TwoSum obj = new TwoSum();
    private int data[] = {3, 2, 4};
    private int data_zero[] = {0, 1, 2};
    private int data_null[] = {};
    private int data_error[] = {0, 4, 3, 0};

    @Test
    public void test_basic(){
        int[] result = obj.twoSum(data, 6);
        for(int i=0; i<result.length; i++)
            System.out.println(result[i]);
        Assert.assertTrue(result[0] == 2);
        Assert.assertTrue(result[1] == 1);
    }

    @Test
    public void test_error(){
        int[] result = obj.twoSum(data, 50);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
            Assert.assertTrue(result[i] == 0);
        }
    }

    @Test
    public void test_error_commit(){
        int[] result = obj.twoSum(data_error, 0);
        for(int i=0; i<result.length; i++)
            System.out.println(result[i]);
        Assert.assertTrue(result[0] == 3);
        Assert.assertTrue(result[1] == 0);
    }


}
