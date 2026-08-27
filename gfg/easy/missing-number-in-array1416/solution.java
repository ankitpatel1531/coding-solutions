class Solution {
    int missingNum(int arr[]) {
        int n = arr.length;
        int xor=n+1;
        
        for(int i =0;i<n;i++){
            xor = xor^arr[i]^(i+1);
        }
        return xor;
        // code here
        
    }
}