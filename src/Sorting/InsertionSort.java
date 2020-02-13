package Sorting;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] intArray = {20, 35, -15, 7, -22 ,55, 1};

        for (int firstUnsortedIndex = 0; firstUnsortedIndex < intArray.length; firstUnsortedIndex++)
        {
            int newElement = intArray[firstUnsortedIndex];

            int i ;

            for (i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement ; i--)
            {
                intArray[i] = intArray[i-1];
            }

            intArray[i] = newElement;
        }


        /** Printing Array For Loop\
         *
         */
        for (int i = 0; i < intArray.length ; i++)
        {
            System.out.println(intArray[i]);
        }

    }

}