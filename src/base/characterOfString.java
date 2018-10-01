package base;

public class characterOfString {

	public static void main(String[] args) {
		
		characterOfString charString  =new characterOfString();
		charString.reverseSu();
	}
	
	public void reverseSu() {
		String name = "I am SURBHI";
		for(int i=name.length()-1;i>=0 ;i--) {
			
			System.out.print(name.charAt(i));
		}
	}
	
	public void reverseSu1() {
		String name = "I am SURBHI";
		for(int i=name.length()-1;i>=0 ;i--) {
			
			System.out.print(name.charAt(i));
		}
}
}