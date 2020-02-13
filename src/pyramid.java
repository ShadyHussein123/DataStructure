import java.util.Scanner;

public class pyramid
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the word:  ");
        String text = input.next();
        System.out.println("Justification (L = left, R = Right): ");
        String just = input.next();


        if (just.equalsIgnoreCase("L"))
        {
            for (int i = 0; i<= text.length(); i++)
            {
                for (int j = 0; j <= i; j++)
                {
                    System.out.print(text.charAt(i) + " ");
                }
                System.out.println();
            }
        }

        else if (just.equalsIgnoreCase("R"))
        {
            for (int i = 0; i<= text.length(); i++)
            {
                for (int j = text.length()-1; j >=i ; j--)
                {
                    System.out.print("  ");
                }
                for (int j = 0; j <= i; j++)
                {
                    System.out.print(text.charAt(i) + " ");
                }
                System.out.println();
            }
        }





        
    }
}


