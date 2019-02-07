

public class Main {

    public static void main(String[] args) {
        // Gumball Machine 1: Accepts only Quarters
        System.out.println("Gumball Machine 1 (Cost: 25 cents): Accepts only Quarters");
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
        
        System.out.println();
        
        // Gumball Machine 2 (Cost: 50 cents): Accepts two Quarters
        System.out.println("Gumball Machine 2 (Cost: 50 cents): Accepts two Quarters");
        GumballMachine2 gumballMachine2 = new GumballMachine2(2);
        System.out.println(gumballMachine2);
        
        System.out.println("Inserting a quarter...");
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.turnCrank();
        
        System.out.println("Inserting a dime...");
        gumballMachine2.insertCoin( 10 );
        gumballMachine2.turnCrank();
        
        System.out.println("Inserting a quarter...");
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.turnCrank();
        
        System.out.println();
        
        // Gumball Machine 3: Accepts All Coins
        System.out.println("Gumball Machine 3 (Cost: 50 cents): Accepts All Coins");
        GumballMachine3 gumballMachine3 = new GumballMachine3(2);
        System.out.println(gumballMachine3);
        
        System.out.println("Inserting a quarter...");
        gumballMachine3.insertCoin( 25 );
        gumballMachine3.turnCrank();
        
        System.out.println("Inserting a nickel...");
        gumballMachine3.insertCoin( 5 );
        gumballMachine3.turnCrank();
        
        System.out.println("Inserting a penny...");
        gumballMachine3.insertCoin( 1 );
        gumballMachine3.turnCrank();
        
        
        System.out.println("Inserting a quarter...");
        gumballMachine3.insertCoin( 25 );
        gumballMachine3.turnCrank();
    
        
    }
}
