

public class GumballMachine {
 
    State soldOutState;
    State noCoinState;
    State hasCoinState;
    State soldState;
 
    State state = soldOutState;
    int count = 0;
    
    // Types: {0: Cost - 25 cents, Only Quarters, 1: Cost: 50, Only Quarters, 2: Cost 50, All coins}
    int gumballMachineType = 0;
    int amountReceived = 0;
 
    public GumballMachine(int numberGumballs, int gumballMachineType) {
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noCoinState;
        } 
        
        this.gumballMachineType = gumballMachineType;
    }
 
    public void insertCoin(int coin) 
    {
        switch ( this.gumballMachineType ) 
        {
            case 0: if ( coin == 25 ) 
                        state.insertCoin(coin);
                    else 
                        System.out.println( "Please insert a quarter" ) ;
                    break;
            case 1: if ( coin == 25 )
                    {
                        amountReceived += 25;
                        if ( amountReceived >= 50 ) 
                            state.insertCoin(amountReceived);
                        else
                            System.out.println( "Need one more quarter" ) ;
                    } 
                    else
                         System.out.println( "Please insert a quarter" ) ;
                    break;
            case 2: switch( coin )
                    {
                        case 1: this.amountReceived += 1; break;
                        case 5: this.amountReceived += 5; break;
                        case 10: this.amountReceived += 10; break;
                        case 25: this.amountReceived += 25; break;
                        default: System.out.println("Invalid coin");
                    }
                    if ( amountReceived >= 50) 
                        state.insertCoin(amountReceived);
                    else
                        System.out.println( "Need more " + (50-this.amountReceived) + " cents");
                    break;
            default: System.out.println("Invalid Machine Type");
        }
        
    }
    
 
    public void ejectCoin() {
        amountReceived = 0;
        state.ejectCoin();
    }
 
    public void turnCrank() {
        amountReceived = 0;
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = noCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
