import java.util.*;
abstract class temperature{
    double temp;
    abstract void settemp(double temp);
    abstract void changetemp();
}
class celsius extends temperature{
    double ftemp;
    void settemp(double temp){
        this.ftemp=temp;
    }
    void changetemp(){
        double f;
        f=(9.0/5.0)*ftemp+32;
        System.out.print("Temperature in fahrenheit :"+f);
    }
}
class fahernheit extends temperature{
    double ctemp;
    void settemp(double temp){
        this.ctemp=temp;
    }
    void changetemp(){
        double c;
       c=(5.0/9.0)*(ctemp-32);
        System.out.print("Temperature in Celsius :"+c);
    }
}
class main{
    public static void main(String arg[]){
        double temp;
        fahernheit f=new fahernheit();
        celsius c=new celsius();
        System.out.println("\n Enter the temperature :");
        Scanner sc=new Scanner(System.in);
        temp=sc.nextDouble();
        f.settemp(temp);
  System.out.println("\nChanging the temperature to Celsius:");
  f.changetemp();
              c.settemp(temp);
  System.out.println("\nChanging the temperature to Fahernheit:");
  c.changetemp();
    }
}