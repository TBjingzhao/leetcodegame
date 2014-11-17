/*
 * Copyright 2014 Alibaba.com All right reserved. 
 *
 * This software is the confidential and proprietary information of 
 * Alibaba.com ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with
 * the terms of the license agreement you entered into with Alibaba.com.
 */
package leetcode.test;

import junit.framework.Assert;
import leetcode.countandsay.CountAndSay;
import org.junit.Test;

/**
 *
 * @author jingzhao.ssh
 * @date 14-11-14
 */
public class CountAndSayTest {

    public CountAndSay casObj = new CountAndSay();

    @Test
    public void test_countAndSay_0(){
        System.out.println(casObj.countAndSay(0));
    }

    @Test
    public void test_countAndSay_negative(){
        System.out.println(casObj.countAndSay(-1));
    }

    @Test
    public void test_countAndSay_1(){
        Assert.assertEquals("1", casObj.countAndSay(1));
    }

    @Test
    public void test_countAndSay_2(){
        Assert.assertEquals("11", casObj.countAndSay(2));
    }

    @Test
    public void test_countAndSay_3(){
        Assert.assertEquals("21", casObj.countAndSay(3));
    }

    @Test
    public void test_countAndSay_5(){
        Assert.assertEquals("111221", casObj.countAndSay(5));
    }

    @Test
         public void test_countAndSay_6(){
        Assert.assertEquals("312211", casObj.countAndSay(6));
    }

    @Test
    public void test_countAndSay_20() {
        System.out.println(casObj.countAndSay(20));
    }

}
