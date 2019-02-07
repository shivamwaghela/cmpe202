

public class Main {

    public static void main(String[] args) {
        // Gumball Machine 1: Accepts only Quarters
        System.out.println("Gumball Machine 1: Accepts only Quarters");
        GumballMachine gumballMachine = new GumballMachine(2);
        System.out.println(gumballMachine);
        
        System.out.println("Inserting a quarter...");
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();
        
        System.out.println("Inserting a dime...");
        gumballMachine.insertCoin( 10 );
        gumballMachine.turnCrank();
        
        System.out.println("Inserting a quarter...");
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();
        
        System.out.println("Inserting a quarter...");
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();
       
    }
}
