package Supplies;
import java.util.*; 
import java.io.*;
public class Storage
{  
	interface Methods
	{
		public abstract void Welcome();
		public static class Info();
	}
		
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
     String name,market;
    int price;
   // static
    //{
     //name="randomcompany";
     //}
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
 }
