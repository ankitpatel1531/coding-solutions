class Solution {
	static ArrayList<Integer> leaders(int[] arr) {
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		int n = arr.length;
		int max = arr[n - 1];
		
		ans.add(max);
		
		for (int i = n - 2; i >= 0; i--) {
			
			if (arr[i] >= max) {
				ans.add(arr[i]);
				max = arr[i];
			}
		}
		
		Collections.reverse(ans);
		
		return ans;
		
		// 		Time Limit Exceeded
		/*
		ArrayList<Integer> ans = new ArrayList<>();
		
		int n = arr.length;
		
		for (int i = 0; i < n; i++) {
			
			boolean leader = true;
			
			for (int j = i + 1; j < n; j++) {
				
				if (arr[j] > arr[i]) {
					leader = false;
					break;
				}
			}
			
			if (leader) {
				ans.add(arr[i]);
			}
		}
		
		return ans;
		*/
	}
}
