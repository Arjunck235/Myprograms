
public class Arrayprogram {

	public static void main(String[] args) {
		// to display a string elements using array 
		String [] fruits = {"apple","banana","orange","greap"};//0,1,2,3
		System.out.println(fruits[2]);
		
		int[]numbers= {10,20,30,40,50};
		System.out.println(numbers[2]+numbers[1]);
		
		// to change name of a string
		 fruits[0]="orange";
		 System.out.println(fruits[0]);
		 
		 // to find the length of an array
		 System.out.println(fruits.length);
		
		
// to display the values of an array using for loop
		 for(int i=0;i<fruits.length;i++) {
		 System.out.println(fruits[i]);
		 
	}

}}
