public class route {
    public int money; //each possibility/route will have its own money
    //each time money comes in, it's a loop

    public Tower towers[]; //the "tower route"

    //constructor
    public route(Tower givenTowers[]){
        towers = givenTowers;
    }

    //create "what-if" and a tower scenario (manually input each tower when gold is ready), [banna farm1, upgrade banana farm1, ONLY FARMS, sell banna farm2, buy bannafarm 1 upgrade..]
    //will not account for placing the farm MID-ROUND, as this depends on where the defensive towers are placed
    //assumes every balloon is popped

    //maybe later on can account for things other than farms: bloon trap, alchmest rubber to gold, etc.
    public void money_gameLoop(){

        for(int round = input.farm_round_start; round <= input.farm_round_end; round++){
            //if money >= (towers[index]).cost
        } 
        

    }
}
