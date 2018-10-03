package base;

import java.util.Scanner;

public class LargestNumberOFThree {
 
    public static void main(String[] args) {
        //To enter size of Array
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
 
        //To enter list of Array
        int[] a = new int[size];   
        int max1 = a[0];
        int max2 = a[0];
        int max3 = a[0];
        int small1 = a[0];
        int small2 = a[0];
        int small3 = a[0];
        int prodmax = 1;
        int prodsmall = 1;
       
        for(int i = 0; i<size;i++) 
        {
            a[i] = scan.nextInt();
        }
   
                
        for(int j = 0; j <= a.length-1;j++) {
            
            
            
            if(a[j]>max1)
            {
            max3 = max2;
            max2 = max1;    
            max1 = a[j];
            }          
            
            else if(a[j]>max2) {
                max2 = a[j];
                
            }      else if(a[j]>max3) {
                max3 = a[j];
                }
            else if(a[j]<small1) {
                small3 = small2;
                small2 = small1;
                small1 = a[j];
            
        }  else if(a[j]<small2) {
               small2 = a[j];    
        
        }else if(a[j]<small3) {
            small3 = a[j];    
        }
             
            }
        
        prodmax = max1*max2*max3;
           prodsmall = small1*small2*max1;
           
           if(prodmax > prodsmall) {
               
               System.out.println("Largest no:" + prodmax);
           }else
           {
               System.out.println("Largest no:" + prodsmall); 
           }
                    
        
        }  
    
    
    
}
 