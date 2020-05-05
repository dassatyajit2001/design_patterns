package com.design.pattern.prototype;

public abstract class Stock implements Cloneable 
{ 
      
    protected String stockName;
    protected int id;
       
    abstract void addStock(); 
       
    public Object clone() 
    { 
        Object clone = null; 
        try 
        {
            clone = super.clone(); 
        }  
        catch (CloneNotSupportedException e)  
        { 
            e.printStackTrace();
        } 
        return clone; 
    } 
} 
