package base;

public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReverseOfString ros= new ReverseOfString();
String rev=ros.reverse("I am Akash");
System.out.println(rev);
ros.reversewords(" I am  Akash");	
ros.reverse2("I am Akash");
	}

	public String reverse(String str)
	{
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--) {
		rev=rev+str.charAt(i);
		}
		//System.out.println(str);
		//System.out.println(rev);
		return rev;
	}
	
	public void reversewords(String str) {
		String [] rev;
		rev=str.split(" ");
		for(int i=rev.length-1;i>=0;i--)
		{
		 System.out.print(rev[i] + " ");
		}
	}
	public void reverse2(String str) {
		String [] rev;
		rev=str.split(" ");
		System.out.print("\n");
		for(int i=0;i<=rev.length-1;i++)
		{
		 System.out.print(reverse(rev[i]) + " ");
		}
	}
}
