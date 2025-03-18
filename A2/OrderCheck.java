/*************************************************************************
 *  Compilation:  javac OrderCheck.java
 *  Execution:    java OrderCheck 5 10 15 2
 *
 *  Prints true if the four integer inputs are in strictly ascending
 *  or descending order, false otherwise
 *
 *  % java OrderCheck 5 10 15 2
 *  false
 *
 *  % java OrderCheck 15 11 9 4
 *  true
 *
 *************************************************************************/

public class OrderCheck{
    public static void main(String[] args){
        //convert args into ints
        int one = Integer.parseInt(args[0]);
        int two = Integer.parseInt(args[1]);
        int three = Integer.parseInt(args[2]);
        int four = Integer.parseInt(args[3]);

        //check if ascending or descending respectively
        boolean check = ((one > two) && (two > three) && (three > four) || (one < two) && (two < three) && (three < four));

        //print
        System.out.println(check);


    }
}