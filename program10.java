import java.lang.System;
import java.util.*;
class bank{
    int acc;
    String name;
    String add;
    int b;
    public bank(){
    this.name="john";
    this.add="delhi";
    this.acc=100;
    this.b=0;
    }
    public void display(){
        System.out.println("the details are :");
        System.out.println("1.Name :"+name);
          System.out.println("2.Address :"+add);
            System.out.println("3.Account Number :"+accno);
              System.out.println("4.Balance :"+bal);
    }
    public void withdraw(int bal,String name,int accno){
          Scanner sc=new Scanner(System.in);
        int am;
        System.out.println("Enter the amount to withdraw :");
        am=sc.nextInt();
        if(am>bal){
            System.out.println("Insufficient amount ");
        }
        else{
        bal=bal-am;
                System.out.println("The amount after withdrawl is :"+bal+" "+"of"
                +" "+name+" "+accno);
        }

    }
       public void deposit(int bal,String name,int accno){
        Scanner sc=new Scanner(System.in);
        int am;
        System.out.println("Enter the amount to deposit :");
        am=sc.nextInt();
        bal=bal+am;
                System.out.println("The amount after Deposit is :"+bal+" "+"of"
                +" "+name+" "+accno);

    }

}
class main{
    public static void main(String arg[]){
  Scanner sc=new Scanner(System.in);
  int count=100;
  String name,add;
  int accno,bal;
  bank[] depositers=new bank();
  for(inti=0;i<5;i++){
     System.out.println("Enter the details :");
        System.out.println("1.Name :");
        depositers[i]=sc.nextLine();
        System.out.println("2.Address :");
        add=sc.nextInt();
            System.out.println("3.Account Number :");
            accno=++count;
              System.out.println("4.Balance :");
                bal=sc.nextInt();
  }
  
 
    }
}