import java.lang.System;
import java.util.*;
//remove all 0's from a digit
class main{
    public static void main(String arg[]){
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        num=sc.nextInt();
        //changing the number to string
        String numstr=Integer.toString(num);
        StringBuilder res=new StringBuilder();
        for(int i=0;i<numstr.length();i++){
               char digit=numstr.charAt(i);
               if(digit==0){
                res.append('1');
               }
               else{
                res.append(digit);
               }
        }
        System.out.print("\nThe output is :"+res);
    }
}

