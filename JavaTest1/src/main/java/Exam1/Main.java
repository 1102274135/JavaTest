package Exam1;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Factory factory=new Factory();
        Random r=new Random();
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<50;i++){
            list.add(r.nextInt(100));
        }
        Map<Integer,List<Integer>> map= factory.getMap(list);
        for(Map.Entry<Integer,List<Integer>> e : map.entrySet()) {
            System.out.println(e);
        }
    }
}
