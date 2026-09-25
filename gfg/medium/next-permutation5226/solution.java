class Solution {
	void nextPermutation(int[] arr) {
		// code here
		int n = arr.length;
		int i;
		
		for (i = n - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				break;
			}
		}
		
		if (i >= 0) {
			int j;
			
			for (j = n - 1; j > i; j--) {
				if (arr[j] > arr[i]) {
					break;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		int left = i + 1;
		
		for (int right = n - 1; left < right; left++, right--) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
	}
}
