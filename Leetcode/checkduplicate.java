package Leetcode;

import java.util.HashSet;

public class checkduplicate {
    public static boolean main(String[] args) {
        HashSet<Integer> res=new HashSet<>();
        for (int i : res) {
            if(res.contains(i)){
                return true;
            }
            res.add(i);
        }
        return false;
    }
}
