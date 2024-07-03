import java.lang.System;
//all negative in the beginning of the array 
class main{
    public static void main(String arg[]){
         int[] arr=new int[10];
        int n,temp;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter range :");
        n=sc.nextInt();
        System.out.print("\nEnter elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
         for(int i=0;i<n;i++){
             if(arr[i]<0){
                temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                index++;
             }
         }
            System.out.print("\nArray output :");
        for(int i=0;i<n;i++){
           System.out.print(arr[i]);
        }

    }
}
