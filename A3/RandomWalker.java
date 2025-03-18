/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

 public class RandomWalker {
   int x, y = 0;
    public static void main(String[] args){
      int n = Integer.parseInt(args[0]);

      RandomWalker rw = new RandomWalker();
      System.out.println("(" + rw.x + "," + rw.y + ")"); //prints starting point

      for(int i = 0; i < n; i++){
         int rand = (int)(Math.random()* 4 );
         switch(rand){
            case 0: rw.y++; break; //north
            case 1: rw.y--; break; //south
            case 2: rw.x++; break; //east
            case 3: rw.x--; break; //west
         }
         System.out.println("(" + rw.x + "," + rw.y + ")");
      }
      float distance = rw.x * rw.x + rw.y * rw.y;
      System.out.println("Squared distance: " + String.format("%.1f",distance));

    }
   
   }