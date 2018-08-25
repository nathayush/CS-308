import java.util.Scanner;
import java.math.BigInteger;

public class Numerize
{
    static double output = 0;

    public static void main(String[] args)
    {
        for (int i=0; i<11; i++) 
        {
        	String input = "";
            for (int j=0; j<Math.pow(2, i); j++)
            	input += "1";
            long time1 = System.nanoTime();
        	numerize(input);
        	long time2 = System.nanoTime();

			long timeTaken = time2 - time1;
			System.out.println("Time taken " + timeTaken/1000 + " microseconds");
        }
    }

    public static double numerize(String s)
    {
        if (s.length() == 1)
        {
            output = (output * 10) + Double.parseDouble(s.substring(0, 1));
            return output;
        } else
        {
            output = (output * 10) + Double.parseDouble(s.substring(0, 1));
            return numerize(s.substring(1, s.length()));
        }
    }
}