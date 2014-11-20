package leetcode.test;

import junit.framework.Assert;
import leetcode.validpalindrome.ValidPalindrome;
import org.junit.Test;

/**
 *
 * @author jingzhao.ssh
 * @date 14-11-19
 */
public class ValidPalindromeTest {

    private ValidPalindrome obj = new ValidPalindrome();

    private String str1 = "abc ; cba";
    private String str2 = "fasfsafsaf; fdsfdsfsd; dsf";
    private String err1 = "1a2";

    @Test
    public void test_isPalindrome(){
        boolean result = obj.isPalindrome(str1);
        Assert.assertTrue(result);
    }

    @Test
    public void test_isPalindrome_err1(){
        boolean result = obj.isPalindrome(err1);
        Assert.assertFalse(result);
    }
}
