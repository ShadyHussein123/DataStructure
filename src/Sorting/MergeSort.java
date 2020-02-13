//package Sorting;
//
//import java.util.Arrays;
//
//public class MergeSort
//{
//
//    public static void main(String[] args)
//    {
//        int[] intArray = {20, 35, -15, 7, -22 ,55, 1};
//        System.out.println(Arrays.toString(intArray));
//
//        MergeSort.sort(intArray);
//        System.out.println(Arrays.toString(intArray));
//
//    }
//
//
////    public static void sort(int[] a)
////    {
////        if (a.length <= 1)
////        {
////            return;
////        }
////
////
////        int[] first = new int[a.length / 2];
////        int[] second = new int[a.length - first.length];
////        // Copy the first half of a into first, the second half into second
////        for (int i = 0; i < first.length; i++)
////        {
////            first[i] = a[i];
////        }
////        for (int i = 0; i < second.length; i++)
////        {
////            second[i] = a[first.length + i];
////        }
////        sort(first);
////        sort(second);
////
////        merge(int[]);
////    }
//
//
//    public static void merge(int[]first, int[]second, int[] a)
//    {
//        int iFirst = 0; // Next element to consider in the first array
//        int iSecond = 0; // Next element to consider in the second array
//        int j = 0;
//
//        while (iFirst < first.length && iSecond < second.length)
//        {
//            if(first[iFirst] < second[iSecond])
//            {
//                a[j] = first[iFirst];
//                iFirst++;
//            }
//            else
//                {
//                    a[j] = second[iSecond];
//                    iSecond++;
//                }
//            j++;
//        }
//
//        while(iFirst < first.length)
//        {
//            a[j] = first[iFirst];
//            iFirst++; j++;
//        }
//
//        while(iSecond < second.length)
//        {
//            a[j] = second[iSecond];
//            iSecond++; j++;
//        }
//    }
//}
