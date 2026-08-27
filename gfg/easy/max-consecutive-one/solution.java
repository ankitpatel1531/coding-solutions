class Solution {
    public int maxConsecBits(int[] arr) {
        int count =1;
        int max = 1;
        int n = arr.length;
        
        for(int i =1;i<n;i++){
            if(arr[i]==arr[i-1]){
                count++;
                
            }
            else{
                count = 1;
            }
            max = Math.max(max,count);
        }
        return max;
        // code here
        
    }
}
