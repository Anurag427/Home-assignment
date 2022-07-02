package arrayexamples;

import java.util.Scanner;

public class CopyArray {


	public static void main(String[] args) {
		int array[]=new int[5];
		int array2[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements To copy: ");
		for(int i=0;i<5;i++) {
			
			array[i]=sc.nextInt();
		}
		System.out.println("Copied elements in Array2: ");
for(int i=0;i<array.length;i++) {
	
	array2[i]=array[i];
	System.out.println("Element in index: "+i+" is:"+" "+array2[i]);
}
	}

}

