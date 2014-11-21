package leetcode.pascalstriangle;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jingzhao.ssh
 * @date 14-11-21
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return new ArrayList<List<Integer>>();
        if(numRows == 1) return createOneList();
        if(numRows == 2) return createTwoList();
        List<List<Integer>> result = generate(numRows - 1);
        List<Integer> upLay = result.get(numRows-2);
        List<Integer> layer = createLayerList(upLay);
        result.add(layer);
        return result;
    }

    private List<Integer> createLayerList(final List<Integer> upLay) {
        List<Integer> layer = new ArrayList<Integer>();
        layer.add(1);
        for(int i=0; i<upLay.size(); i++){
            if(i+1<upLay.size()) {
                int tmp = upLay.get(i) + upLay.get(i+1);
                layer.add(tmp);
            }
        }
        layer.add(1);
        return layer;
    }

    private List<List<Integer>> createOneList() {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> layer = new ArrayList<Integer>();
        layer.add(1);
        result.add(layer);
        return result;
    }

    private List<List<Integer>> createTwoList(){
        List<List<Integer>> result = generate(1);
        List<Integer> layer = new ArrayList<Integer>();
        layer.add(1);
        layer.add(1);
        result.add(layer);
        return result;
    }

}
