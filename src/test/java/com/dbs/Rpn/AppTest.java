package com.dbs.Rpn;

import cucumber.api.java.en.Given;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest  extends TestCase
{
   
    
    App app=new App();
    public void testAddition() throws Exception{
    	String expression="30,40,+";
    	assertEquals(70.0f, app.calculate(expression));
    }
    public void testAdditionI()throws Exception{
    	String expression="40,30,+";
    	assertEquals(70.0f, app.calculate(expression));
    }
    public void testAdditionC()throws Exception{
    	String expression="60,30,+";
    	assertEquals(90.0f, app.calculate(expression));
    }

}
