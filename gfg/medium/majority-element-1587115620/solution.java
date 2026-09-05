class Solution {
	int majorityElement(int arr[]) {
	    // Step 1: Find the candidate
             int candidate = 0;
             int count = 0;

             for (int i = 0; i < arr.length; i++) {

                 if (count == 0) {
                     candidate = arr[i];
                 }

                 if (arr[i] == candidate) {
                     count++;
                 } else {
                     count--;
                 }
             }

             // Step 2: Verify the candidate
             int frequency = 0;

             for (int i = 0; i < arr.length; i++) {
                 if (arr[i] == candidate) {
                     frequency++;
                 }
             }

             // Step 3: Check if candidate is actually majority
             if (frequency > arr.length / 2) {
                 return candidate;
             }

             return -1;
	    
	    
	    
	    
	/*	
		int n = arr.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i<arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			
		}
		for (int key : map.keySet()) {
			if (map.get(key)> n/2) {
				return key;
			}
		}
		return - 1;    */
		
		
		
		
		
		
/*		
		int n = arr.length;
		
		for (int i = 0; i<n; i++) {
			int count = 0;
			
			for (int j = 0; j<n; j++) {
				if (arr[i] == arr[j]) {
					count ++;
				}
			}
			if (count> n/2) {
				return arr[i];
			}
		}
		return - 1;    */
		
	}
}
