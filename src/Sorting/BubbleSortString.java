package Sorting;

public class BubbleSortString
{
    public static void main(String[] args)
    {
        String[] letters = {"z", "y", "x", "w", "v", "u", "t", "s", "r", "q" ,"p", "o", "n",
                "m", "l","k", "j", "i", "h", "g", "f", "e", "d", "c", "b", "a"};



        //Outer Loop iteration
        for (int unsortedLastIndex = letters.length -1; unsortedLastIndex > 0 ; unsortedLastIndex--)
        {
            for (int i = 0; i <  unsortedLastIndex; i++)
            {
                swap(letters, i, i+1);
            }
        }

        for (int i = 0; i < letters.length; i++)
        {
            System.out.println(letters[i]);
        }


    }


    public static void swap(String[]text, int i, int j)
    {
        if(i == j)
        {
            return;
        }

        String temp = text[i];
        text[i] = text[j];
        text[j] = temp;
    }
}
