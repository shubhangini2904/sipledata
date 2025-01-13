package CalculateArea;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        float r,l,b,h;
        Scanner obj = new Scanner(System.in);
        System.out.println("R,L,B,H");
        r= obj.nextFloat();
        l= obj.nextFloat();
        b= obj.nextFloat();
        h= obj.nextFloat();
        Shape ob = new Shape();
        ob.area(r);
        ob.area(l,b);
        ob.area(l,h);

    }
}
