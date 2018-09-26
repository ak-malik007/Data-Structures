package base;

public class largest {

	public static void main(String[] args) {
	
		largest l = new largest();
		int arr[]= {1,4,2,-7,8,3,1};
		int la=l.large(arr);
		System.out.println(la);

	}
	
	public int large(int[] arr) {
		int max = arr[0];
		int max2=arr[0];
		int max3=arr[0];
		int small=arr[0];
		int small2=arr[0];
		int small3=arr[0];
		int prodmax=1,prodsmall=1;
	
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
			max3=max2;
				max2=max;
				max=arr[i];
			}
			else if(arr[i]>max2)
				max2=arr[i];
	
			else if(arr[i]>max3)
				max3=arr[i];
			
			else if(arr[i]<small)
				{small3=small2;
				small2=small;
				small=arr[i];}
			else if(arr[i]<small2)
				small2=arr[i];
			else if(arr[i]<small3)
				small3=arr[i];
				}
		
		
		prodmax=max*max2*max3;
		prodsmall=small*small2*max;
		
		if(prodmax>prodsmall)
	
		return prodmax;
		else
			return prodsmall;
	}

}
