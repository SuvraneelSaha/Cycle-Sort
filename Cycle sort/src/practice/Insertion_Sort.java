package practice;

import java.util.Arrays;
import java.util.Scanner;

import static practice.BubbleSort.swap;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements of the array ");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("OG array "+ Arrays.toString(arr));
        insertionsort(arr);
        System.out.println("Og array " + Arrays.toString(arr));

    }
    static void insertionsort(int[] arr)
    {
        // in case of the insertion sort the sorting takes place in spaces
        // ie the first two elements will be sorted then 3 elements then 4 and so on
        for (int i = 0; i <arr.length-1 ; i++)
        {
            for (int j = i+1; j >0 ; j--)
            {
                if(arr[j]<arr[j-1])
                {
                    // swap
                    swap(arr,j,j-1);

                }
                else
                {
                    break;
                }
            }
        }
    }
}
