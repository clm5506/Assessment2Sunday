package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {

        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {

        ArrayList<String> answer = new ArrayList<String>();

        Iterator<String> itr = map.keySet().iterator();
        while(itr.hasNext()){
            String key = itr.next();
            String val = (String) map.get(key);
            if(val.equals(value)){
                answer.add(key);
            }
        }

        return answer.toArray();
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer, Integer> answer = new TreeMap<Integer, Integer>();

        Integer lastVal = 0;
        Integer secondToLastVal = 1;
        for(Integer i = 1; i <= size; i++){
            answer.put(i,lastVal+secondToLastVal);
            lastVal = i;
            secondToLastVal = lastVal+secondToLastVal;
        }
        return answer;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        return null;
    }
}
