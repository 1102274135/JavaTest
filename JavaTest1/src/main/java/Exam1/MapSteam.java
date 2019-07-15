package Exam1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSteam implements MyMap {
    private List<Integer> list;
    private Map<Integer,List<Integer>> map=new HashMap<Integer, List<Integer>>();

    private List<Num> nums=new ArrayList<Num>();
    public MapSteam(List<Integer> list){
        this.list=list;

    }
    public void createMap() {
        for(int i=0;i<list.size();i++){
            Num num=new Num();
            num.setK(list.get(i));
            num.setV(list.get(i)/10);
            nums.add(num);
        }
        for(Num num : nums){
            boolean flag=true;
            if(map.isEmpty()){
                List<Integer> ls=new ArrayList<Integer>();
                ls.add(num.getK());
                map.put(num.getV(),ls);
            }else{
                for(Map.Entry<Integer,List<Integer>> e : map.entrySet()) {
                    if (num.getV() == e.getKey()) {
                        List<Integer> l= e.getValue();
                        l.add(num.getK());
                        e.setValue(l);
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    List<Integer> ls=new ArrayList<Integer>();
                    ls.add(num.getK());
                    map.put(num.getV(),ls) ;
                }

            }
        }
    }

    public void sort() {

    }
}
