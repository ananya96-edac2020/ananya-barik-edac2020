                ASSIGNMENT:3(MODULE 2)
Q1. Write a program to merge two arrays of integers by reading one number at a time from each array until one of the array is exhausted, and then concatenating the remaining numbers. Input: [23,60,94,3,102] and [42,16,74] Output: [23,42,60,16,94,74,3,102]
import java.util.Scanner;
class Hello
{
  static void Merge(int arr1[],int arr2[],int arr3[],int n1,int n2){
   int i=0,j=0,k=0;
   while(i<n1 && j<n2){ //traverse the arr
    arr3[k++]=arr1[i++];
    arr3[k++]=arr2[j++];
    }
   while(i<n1){
   arr3[k++]=arr1[i++];
   }
   while(j<n2){
   arr3[k++]=arr2[j++];
   }
}