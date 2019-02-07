public class GumballMachine3 implements GumballMachineInterface
{

    private int num_gumballs;
    private int amount_received;

    public GumballMachine3( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.amount_received = 0;
    }

   
    public void insertCoin(int coin)
    {
        switch( coin )
        {
            case 1: this.amount_received += 1; break;
            case 5: this.amount_received += 5; break;
            case 10: this.amount_received += 10; break;
            case 25: this.amount_received += 25; break;
            default: System.out.println("Invalid coin");
        }
    }
    
    public void turnCrank()
    {
        if ( this.amount_received >= 50 )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.amount_received = 0 ;
                System.out.println( "Thanks for 50 cents.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else if ( this.amount_received < 50 )
        {
            System.out.println( "Need more " + (50-this.amount_received) + " cents");
        }
        else 
        {
            System.out.println( "Please insert 50 cents" ) ;
        }        
    }
}
