package Collections;

import java.util.ArrayList;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        Integer sum = 0;
        for(Integer i : list1){
            sum += i;
        }
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        original.remove(toRemove);
        return original;
    }

    public boolean happyList(ArrayList<String> original) {

//       // String ans = original.get(0);
//        for(int i = 0; i < original.size(); i++){
//            if(original.get()){
//
//            }
//        }
//        return ;
        return false;
    }
}
