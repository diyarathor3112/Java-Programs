import java.util.*;
interface Shape
{
    void input();
    void vol();
}
class Cone implements Shape
{
    int r = 0;
    int h=0;
    double pi = 3.14, volume = 0;
    public void input()
    {
        r = 5;
       h=5;
    }
    public void vol()
    {
        volume=(pi*r*r*h)/3;
        System.out.println("Volume of cone:"+volume);
    }
}
class Sphere implements Shape
{
    int r = 0;
    double pi = 3.14, ar = 0;
    public void input()
    {
        r = 5;
    }
    public void vol()
    {
        ar = pi * r * r*r;
        System.out.println("Volume of Sphere:"+ar);
    }
}
class Hemisphere implements Shape
{
    double ar;
    double pi=3.14;
    int r=5;
    public void input()
    {
       int r=5;
       int h=3;
    }
    public void vol()
    {
       ar=(2*(pi*r*r*r))/3;
        System.out.println("Volume of Hemisphere:"+ar);
    }
}
public class Demo
{
    public static void main(String[] args)
    {
        Cone obj1 = new Cone();
       Hemisphere obj2 = new Hemisphere();
       Sphere obj3 = new Sphere();
       obj1.input();
            obj1.vol();
        obj2.input();
          obj2.vol();
         obj3.input();
          obj3.vol();


    }
}