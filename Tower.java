public class Tower {
    //Object representing a FARM tower/an upgrade. will have
    //how can we create every possibility for a farm tower though??? (can check if valid)
    //make each farm have attributes for each upgrade
    public static int UPGRADE1_1 = 1;
    public static int UPGRADE1_2 = 1;
    
    String name;
    int cost;
    int sellValue;
    public Tower(String name, int cost){
        this.name = name;
        this.cost = cost;
        sellValue = (int)Math.ceil((0.77)*cost); //many more factors, keeping simple for now. always rounds up.
    }

    //do we need getters? probs not bc public
}//imprac jokers reminder
