package com.design.prototype;

public class App {
	  public static void main (String[] args) 
	    { 
	        StockStore.getStock("Reliance").addStock(); 
	        StockStore.getStock("Tcs").addStock(); 
	        StockStore.getStock("Reliance").addStock(); 
	        StockStore.getStock("Tcs").addStock(); 
	    } 
}
