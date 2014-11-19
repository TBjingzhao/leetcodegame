package leetcode.stack;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jingzhao.ssh
 * @date 14-11-18
 */
public class Stack {

    //push(x) -- Push element x onto stack.
    //pop() -- Removes the element on top of the stack.
    //top() -- Get the top element.
    //getMin() -- Retrieve the minimum element in the stack.
    private List<Integer> datas = new ArrayList<Integer>();
    private List<Integer> min = new ArrayList<Integer>();

    public void push(int x){
        datas.add(x);
        if(min.size()==0){
            min.add(x);
            return ;
        }
        if(min.get(min.size()-1)>=x)
            min.add(x);
    }

    public int pop(){
        if(datas.size()>0){
            int result = datas.remove(datas.size()-1);
            if(min.get(min.size()-1)==result)
                min.remove(min.size()-1);
            return result;
        }
        throw new IllegalArgumentException("No element");
    }

    public int top(){
        if(datas.size()>0){
            return datas.get(datas.size() - 1);
        }
        throw new IllegalArgumentException("No element");
    }

    public int getMin(){
        if(min.size() == 0)
            throw new IllegalArgumentException("No element");

        return min.get(min.size()-1);
    }

    public int size(){
        return datas.size();
    }

    public void clear(){
        datas.clear();
    }
}
