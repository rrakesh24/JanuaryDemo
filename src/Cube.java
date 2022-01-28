import java.util.Scanner;

public class Cube {

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number:");

        int num=sc.nextInt();

        calculateCube(num);
      /*  int anku=1;
        while(anku<=5)
        {
           System.out.println(anku) ;
           anku=anku+1;
        }*/


    }

    public static void calculateCube(int x)
    {
        System.out.println("Cube of no is:");
        System.out.print(x*x*x);
    }


}
