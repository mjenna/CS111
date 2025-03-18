/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *

 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

 public class RURottenTomatoes {

    public static void main(String args[]){
        int index = 0;
        int rows = Integer.parseInt(args[0]);
        int cols = Integer.parseInt(args[1]);
        int[][] ratings = new int[rows][cols];
        int count = 2; //account for rows and cols

        for(int i = 0; i < ratings.length; i++){
            for(int j=0; j < cols; j++){
                ratings[i][j] = Integer.parseInt(args[count]);
                count++;

            }
        }
        int maximumSum = 0;
        for(int i=0; i < ratings[0].length; i++){
            int rowSum = 0;
            for (int j = 0; j < ratings.length; j++){
                rowSum += ratings [j][i];
            }
            if(rowSum > maximumSum){
                maximumSum = rowSum;
                index = i;

            }
        }
        System.out.println(index);

    }
}