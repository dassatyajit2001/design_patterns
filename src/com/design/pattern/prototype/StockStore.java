package com.design.pattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class StockStore { 
   
    private static Map<String, Stock> stockMap = new HashMap<String, Stock>();  
       
    static 
    { 
    	stockMap.put("Reliance", new StockConcrete("Reliance",1)); 
    	stockMap.put("Tcs", new StockConcrete("Tcs",2)); 
    } 
       
    public static Stock getStock(String stockName) 
    { 
        return (Stock) stockMap.get(stockName).clone(); 
    } 
} 
