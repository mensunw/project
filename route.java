public class route {
    public int money; //each possibility/route will have its own money
    //each time money comes in, it's a loop

    public Tower towers[]; //the "tower route"
    public int index; //for going through each tower

    //constructor
    public route(Tower givenTowers[]){
        towers = givenTowers;
        money = 556; //testing value for round 4 and 0 2 1 dart monkey
        if(input.starting_cash_research) money += 200; //one of the many checks needed, for now will stick to "defualts"
        index = 0;
    }

    //create "what-if" and a tower scenario (manually input each tower when gold is ready), [banna farm1, upgrade banana farm1, ONLY FARMS, sell banna farm2, buy bannafarm 1 upgrade..]
    //will not account for placing the farm MID-ROUND, as this depends on where the defensive towers are placed
    //assumes every balloon is popped

    //maybe later on can account for things other than farms: bloon trap, alchmest rubber to gold, etc.
    public void gameSimulation(){
        for(int round = input.farm_round_start; round <= input.farm_round_end; round++){
            if(money >= (towers[index]).cost){
                money -= towers[index].cost;
                index++;
            }
            if(index == towers.length) break; //no more towers in this route
        } 
        //in the end must sell all towers and add to money
        

    }

    //finds out if tower combination is possible (upgrade wise), dont need, will make tower function for it
    public boolean isPossibleTowerCombination(){
        return true;
    }
}
