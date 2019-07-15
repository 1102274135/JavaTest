package Exam2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
      //获取city
      public static  void  main(String[] args){
          int cid=Integer.valueOf(JD.countryid);
          String city="";
          int cityID=0;
          try {
              Connection con=JD.getConnection();
              String sql="select city_id,dity from city where countyr_id=?";
             PreparedStatement sta= con.prepareStatement(sql);
             sta.setInt(cid,1);
             ResultSet res=sta.executeQuery();
             if(res.next()){
                  city=res.getString("city");
                  cityID=res.getInt("city_id");
             }
             System.out.println("city:"+city+" cityID"+cityID);
          } catch (SQLException e) {
              e.printStackTrace();
          }
      }
}
