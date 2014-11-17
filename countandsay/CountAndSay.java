package leetcode.countandsay;

/**
 *
 * @author jingzhao.ssh
 * @date 14-11-14
 *
 * url: https://oj.leetcode.com/problems/count-and-say/
 */
public class CountAndSay {

    public static String ONE = "1";
    public static String TWO = "11";

    public String countAndSay(int n) {
        if (n <= 0) return "param is error!";
        if (n == 1) return ONE;
        if (n == 2) return TWO;
        String ret = countAndSay(n-1);
        return calculate(ret).toString();
    }

    private StringBuffer calculate(String ret) {
        StringBuffer result = new StringBuffer();
        int cnt = 1;
        for (int i = 1; i < ret.length(); i++) {
            if (ret.charAt(i) == ret.charAt(i - 1)) {
                cnt++;
            } else {
                result.append(cnt).append(ret.charAt(i - 1));
                cnt = 1;
            }
        }
        result.append(cnt).append(ret.charAt(ret.length()-1));
        return result;
    }
}
