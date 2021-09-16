class Calc
{
 
   double add(double a,double b)
   {
      double sum=a+b;
      return sum;
   }
   double subt(double a,double b)
   {
     double sub=a-b;
     return sub;
   }
   double multiply(double a, double b)
   {
      double mul=a*b;
      return mul;
   }
   double mDivision(double a ,double b)
   {
       double mdiv=a%b;
       return mdiv;
   }
   double division(double a, double b)
   {
       double div=a/b;
       return div;
   }
}

class Calculator
{
   public static void main(String [] args)
   {
     Calc cal=new Calc();
     System.out.println("Addition : " + cal.add(12.5,13.7));
     System.out.println("Subtraction : " + cal.subt(11.0,13.0));
     System.out.println("Multiplication : " + cal.multiply(4.6,5.5));
     System.out.println("Moudlo Division : " + cal.mDivision(12.0,4.0));
     System.out.println("Division : " + cal.division(13.5,7.0));
   }
}