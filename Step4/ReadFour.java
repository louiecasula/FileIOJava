package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    public static void main(String[] args)
    {
        try {
            Scanner fileIn = new Scanner(new File("Step4/input.txt"));

            int sum = 0;
            while (fileIn.hasNext())
            {
                // Reads the entire line as a string
                String lineIn = fileIn.nextLine();
                sum += Integer.parseInt(lineIn);
                System.out.println("Running total: " + sum);
            }
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}