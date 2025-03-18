/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

 public class LargestOfFive {
    public static void main(String args[]){
    //5 command line ints args
    int one = Integer.parseInt(args[0]);
    int two = Integer.parseInt(args[1]);
    int three = Integer.parseInt(args[2]);
    int four = Integer.parseInt(args[3]);
    int five = Integer.parseInt(args[4]);

    int compare = 0;

    //traverse the list
    for(int i = 0; i < args.length; i++){
        if(compare < Integer.parseInt(args[i])){
            compare = Integer.parseInt(args[i]);
        }
        System.out.println(compare);
    }

    }

}