public class LEDTest {

    public static void main(String args[])
    {
        System.out.println("Press CTRL-c to exit");
        try {
            Runtime runtime=Runtime.getRuntime();
            runtime.exec("gpio mode 4 out");
            while (true) {
                runtime.exec("gpio write 4 1");
                Thread.sleep(1000);
                runtime.exec("gpio write 4 0");
                Thread.sleep(1000);

            }
        }
        catch(Exception e)
        {
            System.out.println("Exception Occurred:");
        }
    }
}
