package com.dbs.operations;

import java.util.HashMap;
import java.util.Map;

public class Factory {
		
	Map<String,RPNCalculator> symbolsFactory;
		public Factory(){
		symbolsFactory=new HashMap<String,RPNCalculator>();
		symbolsFactory.put("+", new Addition());
		symbolsFactory.put("-", new Substraction());
		
		}
		
	public RPNCalculator getOperatorObject(Object symbol){
		return symbolsFactory.get(symbol.toString());
	}
}
