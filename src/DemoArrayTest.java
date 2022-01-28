import java.util.ArrayList;
import java.util.List;

public class DemoArrayTest {

    public static void main(String args[])
    {

       int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr[0].length;j++)
           {
               if(i==j)
               System.out.println(arr[i][j]);
           }
       }



       /* ArrayList demo=new ArrayList();
       demo.add(4);
       demo.add(7);
       System.out.println(demo.get(1));*/


    }
}
