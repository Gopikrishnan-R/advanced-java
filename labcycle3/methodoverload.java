import java.util.*;

class Shape
   
  {
  
   void area(int l,int b)
   {
   
    int a = l*b;
    
    System.out.println("area of rectangle:"+a);
    
    }
    
    void area (double r)
    
    {
    
    double a=3.14*r*r;
    
    System.out.println("area of circle:"+a);
    
    }
    
    void area(int s)
    
    {
     int a=s*s;
     System.out.println("area of square:"+a);
     }
     }
     
     class methodoverload
     {
     public static void main(String args[])
     {
     
     
     
     Scanner obj= new Scanner(System.in);
     System.out.println("enter length & breadth of rectangle:");
     
     int l=obj.nextInt();
     int b=obj.nextInt();
     System.out.println("enter radius of circle:");
     double r = obj.nextInt();
     System.out.println("enter length of square:");
     int s=obj.nextInt();
     Shape sh=new Shape();
     sh.area(l,b);
     sh.area(r);
     sh.area(s);
     }

}
     
     
     
     
     
     
    
