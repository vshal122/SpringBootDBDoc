package com.rakuten.StudentApp.Practise;

public class QuickSortClass {
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

     static int partition(int arr[], int low, int high)
    {
        int i = low;
        int j = high;
        int pivot = arr[low];
        while (i < j)
        {
            while (pivot >= arr[i])
                i++;
            while (pivot < arr[j])
                j--;
            if (i < j)
                swap(arr,i,j);
        }
        swap(arr,low,j);
        return j;
    }

    static void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

   static void printArray(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
        {
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
     {
        int arr[] = {4, 2, 8, 3, 1, 5, 7,11,6};
        int size = arr.length;
        System.out.println("Before Sorting");
        printArray(arr, size);
        quickSort(arr, 0, size - 1);
        System.out.println("After Sorting");
        printArray(arr, size);

    }
}
