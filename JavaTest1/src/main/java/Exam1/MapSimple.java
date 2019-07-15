package Exam1;

import java.util.*;

public class MapSimple implements MyMap {
    private List<Integer> list;
    private Map<Integer,List<Integer>> map=new HashMap<Integer, List<Integer>>();

    private List<Num> nums=new ArrayList<Num>();
    public MapSimple(List<Integer> list){
        this.list=list;

    }
    public void createMap(){
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
         Collection<List<Integer>> s=map.values();
         int c=0;
         for(List<Integer> l : s){
             int n=l.size();

             for(int i=0;i<n;i++){
                 for(int k=0;k<n-1;k++){
                     if(l.get(k)>l.get(k+1)){
                         c=l.get(k);
                         l.set(k,l.get(k+1));

                         l.set(k+1,c);
                     }
                 }
             }
         }
    }

    public Map<Integer, List<Integer>> getMap() {
        return map;
    }

    public void setMap(Map<Integer, List<Integer>> map) {
        this.map = map;
    }
}
