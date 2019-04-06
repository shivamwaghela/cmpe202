/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public interface IDisplayComponent
{

	/**
	* Display UI commponents on Screen
	*/
    String display() ;		

    /**
    * Add subcomponent
    */						
    void addSubComponent( IDisplayComponent c ) ;	 
}
