package arrayexamples;
import java.util.Scanner;

public class NegativeNoArray {

	public static void main(String[] args) {
		
            int f=0;
		    int array[]=new int[5];
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter elements in the Array: ");
				//loop to insert elements in the array
				for(int i=0;i<5;i++)
				{
					
					array[i]=sc.nextInt();
				}
				System.out.println("The negative numbers in the array is : ");
				
				//loop to search negative number
		for(int i=0;i<array.length;i++) {
			if(array[i]<0)//checking negative number
			{
			f=1;
			//Printing negative number with index
			System.out.println("Negative element in index: "+i+" is:"+" "+array[i]);
		}
			
			}
		//if no negative number is present
		if(f==0) {
			System.out.print("0");
		}
	
			}

		


	}


