package ArrayPackage;

public class ArraySum {

	public static void main(String[] args) {
		int arr[] = new int[6];
		int arr1[] = {1, 3, 4, 6, 4,5, 7};
		int sum = 0;
		for(int i =0; i <arr1.length; i++) {
			sum += arr1[i];
			
		}
		System.out.println(sum);
	}
}
