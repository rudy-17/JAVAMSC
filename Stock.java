import java.util.*; 
import java.io.*;
import Supplies.Storage;

public  class Stock
 {
 	public static void main(String args[])
 	{
 	try
 	{
	 	Trading.Welcome(args[0]);
	    	Scanner in = new Scanner(System.in);
	    	Trading obj = new Trading();
	    	//System.out.println(obj.name);
	    	Trading obj1=new Trading("TATA MOTORS","NSE",90);
	    	Trading.Info object= new Trading.Info();
	    	//object.print();
	    	//System.out.println(obj1.name);
	    	System.out.println("please enter 1 to buy stock or 2 to sell");
	    	int Option=in.nextInt();
	    	switch(Option)
	    	{	
	    		case 1: System.out.println("Please enter the quantity to buy");
	    			int Quantity=in.nextInt();
	    			obj.Trade(Quantity);
	    			break;
	    		case 2: System.out.println("Please enter the quantity to sell");
	    			int Quantityy=in.nextInt();
	    			System.out.println("Please enter the price to sell at");
	    			int Price=in.nextInt();
	    			obj.Trade(Quantityy,Price);
	    			break;
	    		default:
	    			System.out.println("Please enter the correct option");
	 
	    	}
	    }
	   catch (Exception e)
	   {
	   System.out.println(e);
	   }
    	}
 }
