package ArrayPackage;

public class ArrayModify {

	public static void main(String[] args) {
		int arr2[] = {1, 5, 3, 6, 5, 3, 8, 6};
		for(int i =0; i<arr2.length; i++ ) {
			if(arr2[i]==5 && arr2[i+1]== 3) {
				arr2[i+1]=0;
				
				
			}
			System.out.println(arr2[i]);
		}

	}

}
