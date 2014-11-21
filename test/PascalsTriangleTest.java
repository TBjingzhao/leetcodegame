package leetcode.test;

import junit.framework.Assert;
import leetcode.pascalstriangle.PascalsTriangle;
import org.junit.Test;

import java.util.List;

/**
 *
 * @author jingzhao.ssh
 * @date 14-11-21
 */
public class PascalsTriangleTest {

    private PascalsTriangle obj = new PascalsTriangle();

    @Test
    public void test_base_1(){
        List<List<Integer>> result = obj.generate(1);
        Assert.assertTrue(result.size() == 1);
    }

    @Test
    public void test_base_2(){
        List<List<Integer>> result = obj.generate(2);
        Assert.assertTrue(result.size() == 2);
    }

    @Test
    public void test_base_3(){
        List<List<Integer>> result = obj.generate(3);
        Assert.assertTrue(result.size() == 3);
    }

    @Test
    public void test_base_5(){
        List<List<Integer>> result = obj.generate(5);
        Assert.assertTrue(result.size() == 5);
    }
}
