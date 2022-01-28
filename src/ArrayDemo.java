import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo {
   /* public static void main(String args[]){
        int a[]=new int[5];//declaration and instantiation
        a[0]=10;//initialization
        a[1]=20;
        a[2]=70;
        a[3]=40;
        a[4]=50;
//traversing array
        int sum=0;
        for(int i=0;i<a.length;i++)//length is the property of array
        {
            sum=sum+a[i];
          //  System.out.println(a[i]);
            System.out.println("sum......................."+sum);
        }
    }*/

    public static void main(String args[]){
        int arr[]={50,60,70,80};
        for(int i=0;i<=arr.length;i++){
            System.out.println(arr[i]);
        }
    }

   /* static void min(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
            if(max<arr[i])
                max=arr[i];

        System.out.println(max);
    }

    public static void main(String args[]){
        int a[]={33,3,4,5};//declaring and initializing an array
        min(a);//passing array to method
    }*/
}
