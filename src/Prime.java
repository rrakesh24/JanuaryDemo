
import java.lang.*;

class Prime {

    // Check for number prime or not
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        if (isPrime(19))
            System.out.println("It is a Prime No.............");
        else
            System.out.println("Not a Prime No................");
    }
}

// This code is contributed by Ronak Bhensdadia
