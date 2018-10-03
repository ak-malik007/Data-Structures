package base;

public class largest {

	public static void main(String[] args) {
	
		largest l = new largest();
		int arr[]= {-1,-9,-6,-7,-8,-4};
		int la=l.large(arr);
		System.out.println(la);

	}
	
	public int large(int[] arr) {
		int max = Integer.MIN_VALUE;
		int max2= Integer.MIN_VALUE;
		int max3= Integer.MIN_VALUE;
		int small=Integer.MAX_VALUE;
		int small2=Integer.MAX_VALUE;
		int small3=Integer.MAX_VALUE;
		int prodmax=1,prodsmall=1;
	
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
			max3=max2;
				max2=max;
				max=arr[i];
			}
			else if(arr[i]>max2)
			{ max3=max2;
				max2=arr[i];}
	
			else if(arr[i]>max3)
				max3=arr[i];
			
			if(arr[i]<small)
				{small3=small2;
				small2=small;
				small=arr[i];}
			else if(arr[i]<small2)
				{
				small3=small2;
				small2=arr[i];}
			else if(arr[i]<small3)
				small3=arr[i];
				}
		
		
		prodmax=max*max2*max3;
		prodsmall=small*small2*max;
		
		if(prodmax>prodsmall)
		{
			System.out.println("prodmax");
		return prodmax;}
		else {
			System.out.println("prodsmall");
			return prodsmall;
		}
		}

}
