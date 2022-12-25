import java.util.Scanner;
public class input {
    public static int farm_round_start;

    //reads user input and sets global variables
    public static void read(){
        //evantually need input for round to spend certain money for defense though
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the round to start farming: ");

        farm_round_start = scanner.nextInt();
    }
}
