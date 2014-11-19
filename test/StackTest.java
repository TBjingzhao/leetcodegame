package leetcode.test;

import junit.framework.Assert;
import leetcode.stack.Stack;
import org.junit.Test;

/**
 *
 * @author jingzhao.ssh
 * @date 14-11-18
 */
public class StackTest {

    private Stack obj = new Stack();

    @Test
    public void test_push(){
        obj.push(1);
        Assert.assertTrue(obj.size() == 1);
        obj.pop();
    }

    @Test
    public void test_pop(){
        obj.push(1);
        int result = obj.pop();
        Assert.assertTrue(result == 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_pop_null(){
        int result = (Integer)obj.pop();
        Assert.assertTrue(result == 1);
    }

    @Test
    public void test_top(){
        obj.push(1);
        int result = (Integer)obj.top();
        Assert.assertTrue(result == 1);
        obj.pop();
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_top_null(){
        int result = (Integer)obj.top();
        Assert.assertTrue(result == 1);
    }

    @Test
    public void test_getMin(){
        obj.push(1);
        obj.push(2);
        int result = obj.getMin();
        Assert.assertTrue(result == 1);
        obj.clear();
    }

    //push(512),push(-1024),push(-1024),push(512),pop,getMin,pop,getMin,pop,getMin
    @Test
    public void test_error(){
        obj.push(512);
        obj.push(-1024);
        obj.push(-1024);
        obj.push(512);
        int popr = obj.pop();
        Assert.assertTrue(popr == 512);
        Assert.assertTrue(obj.getMin() == -1024);
        int popr2 = obj.pop();
        Assert.assertTrue(popr2 == -1024);
        Assert.assertTrue(obj.getMin() == -1024);
        int popr3 = obj.pop();
        Assert.assertTrue(popr3 == -1024);
        Assert.assertTrue(obj.getMin() == 512);

    }
}
