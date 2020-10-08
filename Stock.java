import java.util.*; 
import java.io.*;
class MarketWatch
{

	final String[] stocks={"TATA","BPCL","IOC","RELIANCE","TCS"};
	int[]  prices={100,200,300,400,500};
	int Choice,Quantity;
	//MarketWatch(int Choice,int Quantity)
	//{
	//this.Choice=0;
	//this.Quantity=0;
	//}
}
class Trading extends MarketWatch
{					
    static String name,market;
    int price;
    static
    {
     name="randomcompany";
     }
    Trading()
    {
      name="random";
      market="nse";
      price=100;	
    }
    Trading(String namee, String markett,int pricee)
    {
    this.name=namee;
    this.market=markett;
    this.price=pricee;
    }
    public static class Info
    {
    	public void print()
    	{
    	System.out.println("The name of the stock is" + name);
    	}
    }
    public static void Welcome(String name)
    {
    	System.out.println("\n			Welcome to the Trading Platform "  + name+"\n");
    }
    public int Trade(int Quantity)
    {
    	int i,price;
    	Scanner in = new Scanner(System.in);
    	System.out.println("Here are the stocks which you can buy\n ");
    	for(i=0;i<5;i++)
    	{
    		System.out.print(stocks[i] + "\t");
    	}
    	System.out.print("\n");
    	for(i=0;i<5;i++)
    	{
    		System.out.print(prices[i] + "\t");
    	}
    	System.out.println("\nPress 1 for stock one and like that\n ");
    	super.Choice=in.nextInt();
    	price=prices[super.Choice];
    	System.out.println("You are going to buy  "+ Quantity + " number of stocks at " + price + " per stock of " + stocks[super.Choice] );
    	return 0;
    } 
    public int Trade(int Quantity,int price)
    {
    	System.out.println("You have\t" + stocks[Choice] + " to sell \n");	
    	System.out.println("You can only  sell  "+ Quantity + " number of stocks at " + price + " per stock");
    	int Profit=price-prices[Choice];
    	if(Profit>=0)
    	{
    	System.out.println("You have made Profit of\t"  + Profit );
    	}
    	else if(Profit<=0)
    	{
    		System.out.println("You have made Loss of \t"  + Profit );
    	 }
    	return 0;
    }     
 }
 public class Stock
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
