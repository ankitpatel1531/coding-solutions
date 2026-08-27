class Solution {
    int missingNum(int arr[]) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<n; i++){
            set.add(arr[i]);
        }
        for (int i = 1; i <= n+1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1 ;
        
        
        
        
        
        
        
        
        
/*
        int n = arr.length;
        int xor=n+1;
        
        for(int i =0;i<n;i++){
            xor = xor^arr[i]^(i+1);
        }
        return xor;
        // code here
        */
        
    }
}