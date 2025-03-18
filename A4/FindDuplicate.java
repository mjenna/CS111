/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 2
 *  true
 *************************************************************************/

 public class FindDuplicate {
    public static void main(String args[]){
    //compare two arrays, if dup then true else false
    int[] n = new int[args.length];
    boolean dup = false;

    for(int i = 0; i < n.length; i++){
        for(int j = i + 1 ; j < n.length; j++){
            n[i] = Integer.parseInt(args[i]);
            n[j] = Integer.parseInt(args[j]);

            if(n[i] == n[j]){
                dup = true;
            }

        }
    }
    System.out.println(dup);

    }
}
