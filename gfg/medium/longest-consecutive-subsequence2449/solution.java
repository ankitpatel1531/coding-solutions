class Solution {
	public int longestConsecutive(int[] arr) {
	    
	    Arrays.sort(arr);
	    int count =1;
	    int longest = 1;
	    
	    for(int i =1;i<arr.length;i++){
	        
	        if(arr[i] == arr[i-1]){
	            continue;
	        }
	        if(arr[i] == arr[i-1] +1){
	            count ++;
	        }
	        else{
	            count =1;
	        }
	        longest = Math.max(longest, count);
	    }
	    return longest;
	    
	    
	    
	   // Time Limit Exceeded 
	/*	int longest = 0;
		for (int i = 0; i<arr.length; i++) {
			int current = arr[i];
			int count = 1;
			
			while (LinearSearch(arr, current + 1)) {
				current++;
				count++;
			}
			longest = Math.max(longest, count);
		}
		return longest;
		
	}
	public boolean LinearSearch(int[] arr, int target) {
		for (int i = 0; i<arr.length; i++) {
			if (arr[i] == target) {
				return true;
			}
		}
		return false;
		*/
	}
}
