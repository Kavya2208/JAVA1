public class CmdSum
{
	public static void main(String[] args) {
	    int sum=0;
		for(String i:args){
		    int j=Integer.parseInt(i);
		    sum=sum+j;
	}
	System.out.println(sum);
}
}