package com.shiro.shiro_test;

import org.apache.shiro.codec.Hex;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	SecureRandomNumberGenerator randomNumberGenerator =
    		     new SecureRandomNumberGenerator();
//    		randomNumberGenerator.setSeed("123".getBytes());
    		String hex = randomNumberGenerator.nextBytes().toHex();
    		System.out.println(hex);
    		
    }
}
