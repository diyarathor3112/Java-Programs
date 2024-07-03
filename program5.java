import java.lang.System;
//Array in zig zag form
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
        for(int i=0;i<n;i++){
            if(i%2==0 && arr[i]>arr[i+1]){
                 temp=arr[i];
                 arr[i]=arr[i+1];
                 arr[i+1]=temp;
            }
            if(i%2==1 && arr[i]<arr[i+1]){
                 temp=arr[i];
                 arr[i]=arr[i+1];
                 arr[i+1]=temp;
            }
        }
          System.out.print("\nArray in zig zag form :");
        for(int i=0;i<n;i++){
           System.out.print(arr[i]);
        }
    }
}
            
