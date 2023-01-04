import java.util.*;
public class calculations {
    public static final int MAX_FARMS = 10; //depends on map space
    //main driver
    //need while loop for each balloon popped and check what can be bought within there

    //use tree structure to go through each possibility?
    
    //create a bunch of "routes" and see which one gives the most money!!
    //stops creating combinations for each route based on if the route hits the farm_end_round
    public static Tower[] calculate(){
        //calculates every combination of givenTowers (recursion) and returns the best combination of towers int[]. [1,11,22,33] means get farm 1, 
        //NOT TREE STURCTURE 
        Tower[] t = new Tower[1];
        //loop
        //find every combination
        //for each combination: calculate money from it
        for(int farm = 1; farm <= MAX_FARMS; farm++){

        }


        return t;
    }


    //use the global variable farm_round_end
    public static int money_from_route(Tower givenTowers[]){
        //create a route object mainly based on a specific givenTowers combination and then returns money once it hits a certain round
        return 0;
    }

    //find the number of combinations for 1 farm, then 2, then 3... up to (10)
    //row: each combination of towers
    //col: towers within each combination
    public static Tower[][] combination_test(){
        Tower t = new Tower(1);
        Tower s = new Tower(2);
        Tower[][] m = {{t,s}};
        //set int[][] combinations to something based on farms
        return m;
    }

    public static void combination_helper(ArrayList<ArrayList<Integer>> combinations, int farms, int index){
        //base case based on farms. each recursive call "adds a for loop ontop or below the other farm"
        //update index each call
        //
        //for each farm, find every combination possible within it (use combation_upgrades & is_valid)
        //
        //in this case, farms = number of for loops needed
        if(index > farms){
            return;
        } else {
            combination_helper(combinations, farms, index+1);
            //now how can we get all the combinations?
        }
        
        
    }











    public static int combinations_for_farm(int farm){
        return 0;
    }

    //some sort of helper function for 11, 12, 21, combinations. keep in mind no farm is possiblity

    
}
