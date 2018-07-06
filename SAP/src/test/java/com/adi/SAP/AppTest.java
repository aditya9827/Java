package com.adi.SAP;

import com.adi.common.Utility;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	
	
	public void testDateParse() {
		Utility.parseDate("23-11-2013");
	}
}
