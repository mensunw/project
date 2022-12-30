public class Tower {
    //Object representing a FARM tower/an upgrade. will have
    //how can we create every possibility for a farm tower though??? (can check if valid)
    //make each farm have attributes for each upgrade
    public final static double easy = 1;
    public final static double medium = 1.17646; //can be more precise, but farm towers are not that expensive
    public final static double hard = 1.08; //multiply after medium

    //defualt price
    public static int c_UPGRADE1_1 = 425;
    public static int c_UPGRADE1_2 = 510;
    public static int c_UPGRADE1_3 = 2550;
    public static int c_UPGRADE2_1 = 255;
    public static int c_UPGRADE2_2 = 680;
    public static int c_UPGRADE2_3 = 3230;
    public static int c_UPGRADE3_1 = 210;
    public static int c_UPGRADE3_2 = 170;
    public static int c_UPGRADE3_3 = 2465;

    public boolean UPGRADE1_1 = false;
    public boolean UPGRADE1_2 = false;
    public boolean UPGRADE1_3 = false;
    public boolean UPGRADE2_1 = false;
    public boolean UPGRADE2_2 = false;
    public boolean UPGRADE2_3 = false;
    public boolean UPGRADE3_1 = false;
    public boolean UPGRADE3_2 = false;
    public boolean UPGRADE3_3 = false;

    public String name;
    public int cost;
    public int sellValue;
    public int income;

    public Tower(String name, int cost){
        this.name = name;
        this.cost = cost;
        sellValue = (int)Math.ceil((0.77)*cost); //many more factors, keeping simple for now. always rounds up.
        income = 80; //defualt income
    }

    //setters for farm upgrades
    //11 = UPGRADE1_1
    public void setUpgrade(int upgrade){
        double difficulty_multiplier;
        if(input.difficulty == 1){
            difficulty_multiplier = easy;
        } else if(input.difficulty == 2){
            difficulty_multiplier = medium;
        } else if(input.difficulty == 3){
            difficulty_multiplier = hard;
        } else {
            System.out.println("Difficulty error");
        } 
        switch(upgrade){
            case(11):
                UPGRADE1_1 = true;
                //update cost and increase sell value, increase income
                cost += 425;
                sellValue = (int)Math.ceil((0.77)*cost);
                income += 40;
                break;
            case(12):
                UPGRADE1_2 = true;
                cost += 510;
                sellValue = (int)Math.ceil((0.77)*cost);
                income += 40;
                break;
            case(13):
                UPGRADE1_3 = true;
                cost += 2550;
                sellValue = (int)Math.ceil((0.77)*cost);
                income += 160;
                break;
            case(21):
                UPGRADE2_1 = true;
                cost += 255;
                sellValue = (int)Math.ceil((0.77)*cost);
                income += 0;
                break;
            case(22):
                UPGRADE2_2 = true;
                cost += 680;
                sellValue = (int)Math.ceil((0.77)*cost);
                income *= 1.30; //rounds down anyways
                break;
            case(23):
                UPGRADE2_3 = true;
                cost += 2975;
                sellValue = (int)Math.ceil((0.77)*cost);
                income += -1000;
                //bank will have different mechanic
                break;
            case(31):
                UPGRADE3_1 = true;
                
                break;
            case(32):
                UPGRADE3_2 = true;
                cost += 210;
                sellValue = (int)Math.ceil((0.77)*cost);
                income += 0;
                break;
            case(33):
                UPGRADE3_3 = true;
                cost += 170;
                sellValue = (int)Math.ceil((0.87)*cost);
                income += 0;
                break;
            default: 
                System.out.println("Upgrade error");
                break;
        }
    }

    //finds out if the farm combination is valid
    public boolean isValidFarm(){
        //check if 2 out of 3 rows, 
        //then check if in order, 
        //then check if there is one > 3, other must be <=2 
        return true;
    }
        
    



    //do we need getters? probs not bc public
}
