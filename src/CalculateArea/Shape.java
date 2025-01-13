package CalculateArea;

public class Shape{
    float a ;
    void area(float r){
        a = 3.14f*r*r;
        System.out.println("Area of circle is"+a);
   }
   void area(float l,float b){
        a = l*b;
       System.out.println("Area of Rectangle is"+a);
   }



}
