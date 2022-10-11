import java.util.Arrays;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int arr[]= {10,9,8,11,13,12};
		
		
		int temp;
		for(int i=0;i<arr.length -1;i++) {
			for(int j=0; j<arr.length -1;j++) {
				if(arr[j] > arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		System.out.println("After Sorting :" +Arrays.toString(arr));
	}
}
