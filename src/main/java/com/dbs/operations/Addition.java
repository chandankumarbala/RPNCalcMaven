package com.dbs.operations;

public class Addition implements RPNCalculator{


	public float calculate(Object opearand1, Object operand2) {
		// TODO Auto-generated method stub
		return Float.valueOf(opearand1.toString())+Float.valueOf(operand2.toString());
		
	}

}
