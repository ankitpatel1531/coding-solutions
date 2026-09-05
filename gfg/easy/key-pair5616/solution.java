class Solution {
    boolean twoSum(int arr[], int target) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int x:arr){
            int required = target-x;
            
            if(set.contains(required)){
                return true;
            }
            set.add(x);
        }
        return false;
        
        
        
        
        /*
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i =0;i<arr.length;i++){
            int x = arr[i];
            
            int required = target-x;
            
            if(map.containsKey(required)){
                return true;
            }
            map.put(x,i);
        }
        return false;
        */
        
        
        
        
        
        
        
        
    /*    int sum = 0;
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target)
                    return true;
            }
        }
        return false;   */
    }
}