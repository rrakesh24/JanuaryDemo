public class DemoOOPParent {


   public static void main(String[] args) {
      int[][] arr = new int[][]{{1, 2}, {3, 4}};
//find the maximum value stored in array

      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr.length; j++) {
          //  System.out.println(arr[i][j]);
            if(i==j)
            {
               System.out.println(arr[j][j]);
            }
         }
      }


   }
}
