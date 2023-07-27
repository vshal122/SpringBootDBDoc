package com.rakuten.StudentApp.Practise;

public class HeapSortClass {


    public int []  sortElement(int arr[])
    {
        int len=arr.length;
        for (int i = len/2-1; i >=0; i--) {
            System.out.println("Second highest loop for 1st loop in sort");
              heapify(arr,i,len);
        }
        for (int i=len-1; i>0; i--) {
             int temp=arr[0];
             arr[0]=arr[i];
             arr[i]=temp;
            System.out.println("Second highest 2nd loop in sort");
             heapify(arr,0,i);
        }
        return  arr;
    }
    public void heapify(int arr[],int i,int len)
    {
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<len && arr[l]>arr[largest])
        {
           largest=l;
        }
        if(r<len && arr[r]>arr[largest])
        {
          largest=r;
        }
        if(largest!=i)
        {
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            System.out.println("Larges or i if wala loop");
            heapify(arr,largest,len);
        }
    }
    public static void main(String[] args) {
        int [] arr = { 12, 11, 13, 5, 6, 7 };
        HeapSortClass hsc = new HeapSortClass();
       int arr1[]= hsc.sortElement(arr);

        for (int i = 0; i < arr1.length ; i++) {
            System.out.println(arr1[i]);
        }
    }
}
