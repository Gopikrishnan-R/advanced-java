import java.util.*;
class rectangles
{
double length;
double breadth;
void setData()
{
System.out.println("area of rectangle is"+(length*breadth));
}

}

class rectangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
rectangles obj1=new rectangles();
System.out.println("enter length:");
obj1.length=sc.nextDouble();
System.out.println("enter breadth:");
obj1.breadth=sc.nextDouble();
obj1.setData();
}
}

