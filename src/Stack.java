public class Stack {

   private int array[];
   private int top;
   private int capacity;

   Stack(int size)
   {
       array=new int[size];
       capacity=size;
       top=-1;
   }

   public void push(int num)
   {
       if(isFull())
       {
           System.out.println("Stack Overflow");
       }
       array[++top]=num;
       System.out.println("Elemet pushed is..."+num);
   }

   public int pop()
   {
       if(isEmpty())
       {
           System.out.println("Stack Underflow");
       }
       return array[top--];
   }

   public boolean isEmpty()
   {
       return top==-1;
   }

    public Boolean isFull()
    {
       return top==capacity-1;
    }


    public static void main(String args[])
    {
       Stack s=new Stack(4);
        s.push(5);
        s.push(80);
        s.push(100);
        s.push(1700);
      //  s.push(45);

        System.out.println("Result of pop() operation is ..:"+s.pop());
        System.out.println("Result of pop() operation is ..:"+s.pop());

    }

}
