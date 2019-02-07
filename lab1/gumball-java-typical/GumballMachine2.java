public class GumballMachine2 implements GumballMachineInterface
{

    private int num_gumballs;
    private int quarter_count;

    public GumballMachine2( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.quarter_count = 0;
    }

   
    public void insertCoin(int coin)
    {
        if ( coin == 25 )
            this.quarter_count++ ;
        else 
            System.out.println("Invalid coin. Please insert quarters only.");
    }
    
    public void turnCrank()
    {
        if ( this.quarter_count >= 2 )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.quarter_count = 0 ;
                System.out.println( "Thanks for 50 cents.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else if ( this.quarter_count == 1)
        {
            System.out.println( "Need one more quarter" ) ;
        }
        else 
        {
            System.out.println( "Please insert a quarter" ) ;
        }        
    }
}
