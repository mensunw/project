import java.util.Scanner;
public class input {
    //globals
    public static int farm_round_start;
    public static int farm_round_end;
    public static int money;
    public static boolean benjy;
    public static boolean sell_knowledge;
    public static boolean first_farm_discount_knowledge;

    //hashmap for each tower: int[], quantity & sell value
    //need cap for certain towers in case no water / no space

    //reads user input and sets global variables
    public static void read(){
        //evantually need input for round to spend certain money for defense though
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the round to start farming: ");

        farm_round_start = scanner.nextInt();
        
        System.out.println("Enter the round to end farming: ");
        farm_round_end = scanner.nextInt();




        scanner.close();
    }
}
