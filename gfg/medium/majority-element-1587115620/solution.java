class Solution {
	int majorityElement(int arr[]) {
	    
     // Boyer–Moore Majority Vote Algorithm (also called Moore's Voting Algorithm).
    //  is used to find an element that appears more than n/2 times in an array.
     // optimal O(n) time and O(1) space.
     
	    
             int candidate = 0;
             int count = 0;

             for (int i = 0; i < arr.length; i++) {

                 if (count == 0) {
                     candidate = arr[i];      //Find the candidate
                 }

                 if (arr[i] == candidate) {
                     count++;
                 } else {
                     count--;
                 }
             }

             
             int frequency = 0;

             for (int i = 0; i < arr.length; i++) {
                 if (arr[i] == candidate) {         //Verify the candidate
                     frequency++;
                 }
             }

             
             if (frequency > arr.length / 2) {      //Check if candidate is actually majority
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
