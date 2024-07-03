import java.lang.System;
//saddle point of the array 
class main{
    public static void main(String arg[]){
         int[][] arr=new int[10][10];
        int n,temp;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter range :");
        n=sc.nextInt();
        System.out.print("\nEnter elements :");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
        }
        }
        int min=0,max=0;
        int mincol,maxrow;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                    mincol=j;
                    max=arr[i][mincol];
                    for(int k=1;k<n;k++){
                        if(arr[k][mincol]>max){
                            max=arr[k][mincol];
                            maxrow=k;
                        }
                    }
                }

            }
        }
        if(i==maxrow){
            System.out.print("\nSaddle Point found at"+i);
        }
        else{
            System.out.print("\nNo Saddle Point found");
        }
    }
}

        