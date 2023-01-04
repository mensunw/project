//Given inputs, this code will output the best farming route for the 2nd player in a co-op game
import java.util.*;
public class banana{
    public static void main(String[] args){
        System.out.println("Hello World");
        //ASSUMING 2-player co-op and one person is farming
        //global variables are in init

        //Call code to take in input
        input.read(); //sets input to starting global variables

        System.out.println(input.farm_round_start);
        //Calculate using input

        //System.out.println(calculations.calculate());
        //testing money function

        Tower test = new Tower(1040);
        test.setUpgrade(22);
        System.out.println(test.UPGRADE2_2);
        System.out.println(test.cost);

        Tower[][] testing = calculations.combination_test();
        for(int row = 0; row < testing.length; row++){
            for(int col = 0; col < testing[0].length; col++){
                System.out.println(testing[row][col].cost);
            }
        }

        int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        //we want to create something like this but within a function
        for(int row = 0; row < 4; row++){
            for(int col = 0; col < 4; col++){
                for(int three = 0; three < 4; three++){
                    System.out.println("" + row + " " + col + " " + three);
                }
            }
        }
        ArrayList<ArrayList<Integer>> combinations = new ArrayList<ArrayList<Integer>>();
        calculations.combination_helper(combinations, 2, 2);



        
    }
}