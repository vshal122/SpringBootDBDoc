package com.rakuten.StudentApp.Practise;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PQueue {

    static void findKMaxElement(int[] arr,int k, int n) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for (int i=0; i<n; i++) {
            minHeap.add(arr[i]);
        }
        System.out.println(minHeap);
        while(!minHeap.isEmpty())
        {
            System.out.println(minHeap.peek());
            minHeap.poll();
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int k = 4, n = arr.length;
            findKMaxElement(arr, k, n);

    }
}
