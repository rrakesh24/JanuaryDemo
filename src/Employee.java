import java.awt.*;
import java.util.*;
import java.util.Stack;

public class Employee {
   public static void main(String s[])
   {



       ArrayList<Object> list=new ArrayList<>(10);
       list.add(2);
       list.add(8);
       list.add("abc");
       list.add(17.0);

       Map<Integer,String> map=new HashMap<>();
       map.put(1,"Rakesh");
       map.put(10,"Master");
       map.put(100,"jack");
       map.put(100,"Ranjan Giri");
       map.remove(10);
       map.put(2,null);
       map.put(5,null);
       map.put(null,"y");
       map.put(null,"K");

Map<Integer,Integer> map1=new Hashtable<>();
map1.put(10,1000);
map1.put(99,80000);
       System.out.println(map1);
     //  map1.put(null,7);
       map1.put(8,null);




      // System.out.println(map.size());

      // System.out.println(map);


      // System.out.println(list);
   }

}
