package practice;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
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
        bubblesort(arr);
        System.out.println("New array "+Arrays.toString(arr));



    }
    static void bubblesort(int[] arr)
    {
        boolean swap;

        // the for loop will run n times
        // and with each pass the largest elements will be at the last index position
        for (int i = 0; i <arr.length ; i++)
        {
            swap = false;
            for (int j = 1; j <arr.length-i ; j++)
            // <arr.length -i  ex - 5-1 = 4   & <4 = 3 upto 3
            {
                    if(arr[j] < arr[j-1])
                    {
                        //Swap
                        swap(arr,j,j-1);
                        swap = true;
                    }

            }
            if(swap == false)
            {
                break;
            }
        }
    }

  static void swap(int[] arr, int a, int b)
  {
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
    }
}
