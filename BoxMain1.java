class Box{  
double length;
double breadth;  
double height;
Box(double l,double b,double h)
{
  length=l;
  breadth=b;
  height=h;
}
void getVolume()
{
    System.out.println("Volume is : "+(length*breadth*height));
}
}
public class BoxMain1 {
public static void main(String[] args) {  
Box b=new Box(11,11,10);   
b.getVolume();
}
}