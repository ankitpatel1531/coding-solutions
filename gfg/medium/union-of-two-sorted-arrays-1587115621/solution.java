// // Java.util.*;
// class Solution {
//     public static ArrayList<Integer> findUnion(int a[], int b[]) {
//         // code here
//         HashSet<Integer> set = new HashSet<>();
        
//         for(int i =0;i<a.length;i++){
//             set.add(a[i]);
//         }
//         for(int i =0;i<b.length;i++){
//             set.add(b[i]);
//         }
//         ArrayList<Integer> list = new ArrayList<>();
        
//         for(int x: set){
//             list.add(x);
//         }
//         Collections.sort(list);
//         return list;
        
        class Solution {
            public static ArrayList<Integer> findUnion(int a[], int b[]) {

                HashSet<Integer> set = new HashSet<>();

                // Add elements of a
                for (int i = 0; i < a.length; i++) {
                    set.add(a[i]);
                }

                // Add elements of b
                for (int i = 0; i < b.length; i++) {
                    set.add(b[i]);
                }

                // Convert HashSet to ArrayList
                ArrayList<Integer> list = new ArrayList<>(set);

                // Sort the result
                Collections.sort(list);

                return list;
            
        

    
 /*   
    // if agr hash set se poochta to but ye unique value store krta haia 
    // aur unorder hota hai  lekin iski time coplexty sbse best hai
    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < a.length; i++) {
        set.add(a[i]);
    }

    for (int i = 0; i < b.length; i++) {
        set.add(b[i]);
    }

    int[] union = new int[set.size()];
    int i = 0;

    for (int x : set) {
        union[i++] = x;
    }

    return union;
        
      
      */          
    }
    
}
