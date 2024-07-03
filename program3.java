import java.lang.System;
//to find friendly pair
class main{
    public static void main(String arg[]){
        int n1,n2;
        Scanner sc =new Scanner(System.in);
       int sum1=0;
       int sum2=0;
       n1=sc.nextInt();
       n2=sc.nextInt();
       for(int i=1;i<n1;i++){
        if(n1%i==0){
            sum1=sum1+i;
        }
       }
        for(int j=1;j<n2;j++){
        if(n2%j==0){
            sum2=sum2+j;
        }
       }
       if(sum1/n1==sum2/n2){
              System.out.println("Friendly Pair and sums are"+sum1+" "+sum2);
       }
       else{
        System.out.println("Not A Friendly Pair");
       }
    }
}

       