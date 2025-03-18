/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 * 
 *
 *************************************************************************/

 public class CheckDigit {
public static void main(String args[]){
    //use long-- 12 or 13 digit integer
    long number = Long.parseLong(args[0]);
    int count = 1;
    int num1 = 0;
    int num2 = 0;

    while(number > 0){
        if(count % 2 != 0){
            num1 += number % 10;
        }else{
            num2 += number % 10;
        }
        number /= 10;
        count++;
    }
    num1 = num1 % 10;
    num2 = num2 % 10;
    num2 = num2 * 3;
    num2 = num2 % 10;
    int digit = num1 + num2;
    digit = digit % 10;
    System.out.println(digit);

}
}