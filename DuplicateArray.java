package arrayexamples;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		//Declaring variables
            int count=0;
		    int array[]=new int[5];
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter elements in the Array: ");
				
				//loop to insert element in the array
				for(int i=0;i<5;i++) {
					
					array[i]=sc.nextInt();
				}
				
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
			
			if(array[i]==array[j])//Checking element is present or not
			{
			count++;//counting duplicate elements
			break;
		    }
			
			}
			
		
	}
		System.out.println("Total numbers of duplicate element found in array : "+count);
	}
	}

	



