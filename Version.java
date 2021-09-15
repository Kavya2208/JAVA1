/* Code written using in-built function*/
/*import java.util.Scanner;
public class Version
{
   public static void main(String [] args)
    {
       System.out.println("Enter a string : ");
       Scanner str=new Scanner(System.in);
       String s=str.nextLine();
       int len=s.length();
       s=s.substring(1,len-1);
       System.out.println(s);
    }
}*/


/* code written without in-built function*/
import java.util.Scanner;
public class Version
{
   public static void main(String [] args)
    {
       System.out.println("Enter a string : ");
       Scanner str=new Scanner(System.in);
       String s=str.nextLine();
       int len=s.length();
       String k="";
       for(int i=1;i<len-1;i++)
        {
          char ch=s.charAt(i);
          k=k+ch;
        }
          System.out.println(k);
    }
}













