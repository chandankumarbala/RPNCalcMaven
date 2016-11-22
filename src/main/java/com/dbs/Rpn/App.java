package com.dbs.Rpn;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.dbs.operations.Addition;
import com.dbs.operations.Factory;
import com.dbs.operations.Substraction;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
	Factory operationsFactory;
	private Stack operationStack;
	public App(){
		operationsFactory=new Factory();
		operationStack= new Stack();
	}
	
	private float popStack(){
		return Float.valueOf(operationStack.pop().toString());
	}
	private void pushStack(Object data){
		operationStack.push(data);
	}
	
	private float publishResult() throws Exception{
		if(operationStack.size()==1)
			return popStack();
		else
			throw new Exception("Please insert a valid input");
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Welcome to RPN Calculator" );
        App app=new App();
        try{
        	System.out.println( "Result : "+ app.calculate(args[0]));
        }catch(Exception e){
        	e.printStackTrace();
        }
       
    }
    
    private static boolean isOperator(String data){
		Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(data);
		boolean result = m.find();
		return result;

	}
    
    
    public float calculate(String expression) throws Exception{
    	String[] argsArr=expression.split(",");
		
    	
    	for(int i=0;i<argsArr.length;i++){
			
			if(!isOperator(argsArr[i]))
				pushStack(argsArr[i]);
			else{
				
			 pushStack(operationsFactory.getOperatorObject(argsArr[i]).calculate(popStack(), popStack()));
			}
				
		}
    	return publishResult();
    }
    
}
