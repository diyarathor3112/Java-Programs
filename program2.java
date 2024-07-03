import java.lang.System;
//swtich statement maturity amount
class main{
    public static void main(String arg[]){
        int am,p,r,n;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Choice :");
        int ch=sc.nextInt();
  System.out.println("Enter the Principal :");
         p=sc.nextInt();
           System.out.println("Enter the Rate :");
         r=sc.nextInt();
           System.out.println("Enter n :");
         n=sc.nextInt();
         while(1){
            switch(ch){
                case 1 :
            am=p*(1+r/100)*n;
            break;
            case 2:
                am=p*n+p*n(n+1)/2*r/100*1/12; 
                case 3 :
                  System.out.println("Invalid Input Re-enter the choice");
                  break;                 
            }

         }
    }
}