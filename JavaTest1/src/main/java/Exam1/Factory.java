package Exam1;

import java.util.List;
import java.util.Map;

public class Factory {
    private MyMap myMap;
    public Map<Integer,List<Integer>>  getMap(List<Integer> list){
        myMap=new MapSimple(list);
        ((MapSimple) myMap).createMap();
        myMap.sort();
        return ((MapSimple) myMap).getMap();
    }
}
