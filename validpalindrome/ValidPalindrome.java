package leetcode.validpalindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author jingzhao.ssh
 * @date 14-11-19
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        String tmps = s.trim().toLowerCase();
        char[] chars = tmps.toCharArray();
        List<Character> result = new ArrayList<Character>();
        Stack<Character> ts = new Stack<Character>();
        for(char tc : chars){
            if(Character.isLowerCase(tc) || Character.isDigit(tc)){
                ts.push(tc);
                result.add(tc);
            }
        }
        for(int i=0; i<result.size() ; i++){
            if(ts.pop() != result.get(i))
                return false;
        }
        return true;
    }
}
