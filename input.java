import java.util.Scanner;
public class input {
    //globals
    public static int farm_round_start;
    public static int farm_round_end;
    public static int difficulty;
    public static boolean benjy = false;
    public static boolean sell_knowledge = true;
    public static boolean first_farm_discount_knowledge = true;
    public static boolean starting_cash_research = false;
    public static boolean flat_pack_research = true;

    //hashmap for each tower: int[], quantity & sell value <- using list of tower objects instead
    //dont need cap for towers, not accounting for little space or water

    //reads user input and sets global variables
    public static void read(){
        //evantually need input for round to spend certain money for defense though
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the round to start farming: "); //round 1 or 3

        //farm_round_start = scanner.nextInt();
        farm_round_start = 4;
        
        System.out.println("Enter the round to end farming: ");
        //farm_round_end = scanner.nextInt();
        farm_round_end = 10;

        System.out.println("Enter difficulty (1 - 3): ");
        difficulty = 1;





        scanner.close();
    }
}
