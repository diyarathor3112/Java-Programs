import java.lang.System;
import java.util.*;
abstract shape{
    abstract double rectarea(double l,double w);
    abstract double circlearea(double r);
    abstract double squarearea(double a);
}
class Areas extends shape{
    double rectarea(double l,double w){
        double res;
        res=l*w;
        return res;
    }
    double circlearea(double r){
        double res=2.0*3.14*r*r;
        return res;
    }
     double squarearea(double a){
        double res=a*a;
        return res;
    }

}
class main{
    public static void main(String arg[]){
        Areas area=new Areas();
        double l,w,r,a;
        Scanner sc =new Scanner(System.in);
        System.out.print("\nEnter length :");
        l=sc.nextDouble();
         System.out.print("\nEnter width :");
        w=sc.nextDouble();
        double rarea=area.rectarea(l,w);
         System.out.print("\nThe area of rectangle is :"+rarea);
         System.out.print("\nEnter radius :");
        r=sc.nextDouble();
        double carea=area.circlearea(r);
        System.out.print("\nThe area of circle is :"+carea);
         System.out.print("\nEnter side :");
        a=sc.nextDouble();
        double sqarea=area.squarearea(a);
        System.out.print("\nThe area of square is :"+sqarea);

    }
}