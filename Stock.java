import java.util.*; 
import java.io.*;
  
class Trading
{					
    static String name,market;
    int price;
    Trading()
    {
      name="random";
      market="nse";
      price=100;	
    }
    static
    {
     name="randomcompany";
     }
    Trading(String namee, String markett,int pricee)
    {
    name=namee;
    market=markett;
    price=pricee;
    }
    public static class Info
    {
    	public void print()
    	{
    	System.out.println("The name of the stock is" + name);
    	}
    }
    public static void Welcome()
    {
    	System.out.println("Welcome to the Trading Platform");
    }
    public int Trade(int Quantity,int price)
    {
    	System.out.println("You are going to sell  "+ Quantity + " number of stocks at " + price + " per stock");
    	 
    	return 0;
    
    }
    public int Trade(int Quantity)
    {
    	int price=50;
    	System.out.println("The current Price of the stock is " + price);
    	System.out.println("You are going to buy  "+ Quantity + " number of stocks at " + price + " per stock");
    	 
    	return 0;
    
    }      
 }
 public class Stock
 {
 	public static void main(String args[])
 	{
 	Trading.Welcome();
    	Scanner in = new Scanner(System.in);
    	Trading obj = new Trading();
    	System.out.println(obj.name);
    	Trading obj1=new Trading("TATA MOTORS","NSE",90);
    	Trading.Info object= new Trading.Info();
    	object.print();
    	System.out.println(obj1.name);
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
 }

