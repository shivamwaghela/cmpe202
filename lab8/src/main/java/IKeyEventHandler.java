 
/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public interface IKeyEventHandler
{
	/**
	* send Key events to Screen 
	*/
    void key(String ch, int cnt) ; 	
    /**
    * set next handler in event chain
    */			
    void setNext( IKeyEventHandler next) ;		

}