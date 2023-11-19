import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Test {

    public static int getHour(String str){
        return Integer.parseInt(str);
    }

    public static boolean inHighAccess(List<Integer> timeList){
        for(int i=0;i<timeList.size();i++){
            if(i+2<timeList.size() && timeList.get(i+2)<=timeList.get(i)+99){
                return true;
            }
        }
        return false;
    }

    public static List<String> findHighAccessEmployees(List<List<String>> access_times) {
        Map<String, List<Integer>> mp = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for(List<String> ls: access_times){
            String emp = ls.get(0);
            int time = getHour(ls.get(1));
            if(!mp.containsKey(emp)){
                mp.put(emp, new ArrayList<>());
            }
            mp.get(emp).add(time);
        }
        System.out.println(mp);
        for(Map.Entry<String, List<Integer>> entry: mp.entrySet()){
            String emp = entry.getKey();
            List<Integer> timeList = entry.getValue();
            Collections.sort(timeList);
            System.out.println(timeList);
            if(inHighAccess(timeList)){
                ans.add(emp);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<String>> ls = new ArrayList<>();
        ls.add(Arrays.asList("d","0002"));
        ls.add(Arrays.asList("c","0808"));
        ls.add(Arrays.asList("c","0829"));
        ls.add(Arrays.asList("e","0215"));
        ls.add(Arrays.asList("d","1508"));
        ls.add(Arrays.asList("d","1444"));
        ls.add(Arrays.asList("d","1410"));
        ls.add(Arrays.asList("c","0809"));

        System.out.println(findHighAccessEmployees(ls));
    }
}
