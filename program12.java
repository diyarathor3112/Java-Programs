import java.lang.System;
import java.util.*;
class ArrayDemo{
    public void arrayFunc(int[] num,int target){
        System.out.print("\nPair of elements whose sum is : "+target+" "+"are: "+);
        for(int i=0;i<num.length();i++){
            for(intj=i+1;j<num.length();j++){
                if(num[i]+num[j]==target){
                    System.out.print(num[i]+"+"+num[j]+"="+target);
                }
            }
        }

    }
    public void arrayFunc(int[] arr1, int len1,int[] arr2,int len2){
        int[] merge=new int[len1+len2];
        inti=0,j=0,k=0;
        while(i<len1 && j<len2)
        {
            if(arr1[i]<arr2[j]){
                merge[k++]=arr1[i++];
            }
            else{
                merge[k++]=arr2[j++];
            }
        }
            while(i<len1){
                    merge[k++]=arr1[i++];
            }
            while(j<len2){
                merge[k++]=arr2[j++];
            }
            System.arraycopy(merge,0,arr1,0,len1);
    System.arraycopy(merge,0,arr2,0,len2);
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    for(i=0;i<len1;i++){
         System.out.println("The first array is :"+arr1);
    }
    for(i=0;i<len2;i++){
    Sytem.out.println("The second array is :"+arr2);
    }
            }

}
class main{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
           ArrrayDemo array=new ArrayDemo();
           int[] arr=new int[10];
           int[] arr1=new int[10];
             int[] arr2=new int[10];
           int key;
           int i,n;
           System.out.print("\nEnter the range :");
           n=sc.nextInt();
           System.out.print("\nEnter the Elements :");
           for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
           }
            System.out.print("\nEnter the key :");
           key=sc.nextInt();
           array.arrayFunc(arr,key);
           System.out.print("\nEnter the Elements :");
           for(i=0;i<5;i++){
            arr1[i]=sc.nextInt();
           }
           System.out.print("\nEnter the Elements :");
           for(i=0;i<3;i++){
            arr2[i]=sc.nextInt();
           }
         demo.arrayFunc(arr1,arr1.length(),arr2,arr2.length());
    }
}