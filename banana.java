//Given inputs, this code will output the best farming route for the 2nd player in a co-op game

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

        Tower test = new Tower("farm", 1040);
        System.out.println(test.sellValue);

        
    }
}