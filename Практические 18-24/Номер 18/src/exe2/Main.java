package exe2;
import java.util.Scanner;

public class Main
{
    public class Exception2 {
        public static void exceptionDemo() {
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
    }
    public static void main(String[] args)
    {
        try {
            Exception2.exceptionDemo();
        }
        catch (Exception e){
            System.err.print(e.getMessage());
        }
        finally
        {
            System.out.println("======");
        }

    }// end main
}
