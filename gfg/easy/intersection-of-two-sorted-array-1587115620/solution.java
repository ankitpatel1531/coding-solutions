// class Solution {
// 	static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
	    
	    
	    
		
// 		/*
// 		int n = arr1.length + arr2.length;
// 		ArrayList<Integer> list = new ArrayList<>();
// 		int[] vis = new int[n];
		
// 		for (int i = 0; i<arr1.length; i++) {
// 			if (i > 0 && arr1[i - 1] == arr1[i])
// 				continue;
// 			for (int j = 0; j<arr2.length; j++) {
// 				if (arr1[i] == arr2[j] && vis[j] == 0) {
// 					list.add(arr1[i]);
// 					vis[j] = 1;
// 					break;
// 				}
// 				if (arr2[j] >arr1[i])
// 					break;
// 			}
			
// 		}
// 		return list;
// 		// code here
// 		*/
		
// 	}
// }
class Solution {
    static ArrayList<Integer> intersection(int arr1[], int arr2[]) {

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i < arr1.length && j < arr2.length) {

            if(arr1[i] == arr2[j]) {

                if(list.size() == 0 || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }

                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        return list;
    }
}