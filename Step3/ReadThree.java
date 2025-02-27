package Step3;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadThree
{
    public static void main(String[] args)
    {
        try{
            System.out.print("Writing to file ... ");
            // Create the file to write to
            PrintWriter fileOut = new PrintWriter("Step3/output.txt");
            // Write text just like we would to the console
            fileOut.println("              _,........__\n" +
                    "            ,-'            \"`-.\n" +
                    "          ,'                   `-.\n" +
                    "        ,'                        \\\n" +
                    "      ,'                           .\n" +
                    "      .'\\               ,\"\".       `\n" +
                    "     ._.'|             / |  `       \\\n" +
                    "     |   |            `-.'  ||       `.\n" +
                    "     |   |            '-._,'||       | \\\n" +
                    "     .`.,'             `..,'.'       , |`-.\n" +
                    "     l                       .'`.  _/  |   `.\n" +
                    "     `-.._'-   ,          _ _'   -\" \\  .     `\n" +
                    "`.\"\"\"\"\"'-.`-...,---------','         `. `....__.\n" +
                    ".'        `\"-..___      __,'\\          \\  \\     \\\n" +
                    "\\_ .          |   `\"\"\"\"'    `.           . \\     \\\n" +
                    "  `.          |              `.          |  .     L\n" +
                    "    `.        |`--...________.'.        j   |     |\n" +
                    "      `._    .'      |          `.     .|   ,     |\n" +
                    "         `--,\\       .            `7\"\"' |  ,      |\n" +
                    "            ` `      `            /     |  |      |    _,-'\"\"\"`-.\n" +
                    "             \\ `.     .          /      |  '      |  ,'          `.\n" +
                    "              \\  v.__  .        '       .   \\    /| /              \\\n" +
                    "               \\/    `\"\"\\\"\"\"\"\"\"\"`.       \\   \\  /.''                |\n" +
                    "                `        .        `._ ___,j.  `/ .-       ,---.     |\n" +
                    "                ,`-.      \\         .\"     `.  |/        j     `    |\n" +
                    "               /    `.     \\       /         \\ /         |     /    j\n" +
                    "              |       `-.   7-.._ .          |\"          '         /\n" +
                    "              |          `./_    `|          |            .     _,'\n" +
                    "              `.           / `----|          |-............`---'\n" +
                    "                \\          \\      |          |\n" +
                    "               ,'           )     `.         |\n" +
                    "                7____,,..--'      /          |\n" +
                    "                                  `---.__,--.'");
            // Clode out file
            fileOut.close();  

            System.out.println("Done!");
            
            // Read in file to verify it
            Scanner fileIn = new Scanner(new File("Step3/output.txt"));
            
            System.out.println("Reading from file ... ");
            while (fileIn.hasNext()) 
            {
                String lineIn = fileIn.nextLine(); 
                System.out.println(lineIn);
            }
            System.out.println("Done!");
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
