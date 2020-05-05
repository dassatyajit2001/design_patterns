package com.design.pattern.prototype;

public class StockConcrete extends Stock{ 
   
    public StockConcrete(String stockName,int id) 
    { 
        this.stockName = stockName; 
        this.id=id;
    } 
   
    @Override
    void addStock()  
    { 
        System.out.println(stockName+" added"); 
    } 
} 
