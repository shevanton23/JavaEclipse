
public class MaxMin {

	public static void main(String[] args) {
		int[] arr = {22, 4, 53, 12};
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
			
		}
		System.out.println("Max number is: " + max );
		System.out.println("Min number is: " + min );
	}

}
