package selectionSortEx;

public class SelectionSort {
	
	private static void selectionsort(int[] arr, int n) {
		int least, temp;
		for(int i=0;i<n-1;i++) {
			least = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[least]) {
					least = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[least];
			arr[least] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = {5, 3, 8, 1, 2, 7};
		int size = arr.length;
		selectionsort(arr, size);
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
