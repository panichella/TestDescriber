package org.apache.commons.collections.primitives;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections.primitives.ArrayIntList;
import org.apache.commons.collections.primitives.ArrayUnsignedShortList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/*
 * The following test cases have been automatically generated using EvoSuite. 
 * These unit tests contain assertions that reflect the current behavior of the  
 * class under test (ArrayIntList.java). However, since the class under test is faulty 
 * (i.e., there are bugs), the generated assertions may wrongly reflect the 
 * incorrect behavior. Therefore, the assertions need to be analyzed and fixed. 
 * Feel free to remove assertions or to @Ignore tests you do not understand.
 *
 * Notes on Testing: There are bugs in ArrayIntList.java. A test revealing a bug should 
 * fail. Tests not revealing bugs should pass. To this aim you can add/remove and modify
 * test cases. You may fix obvious bugs, but do not waste time debugging.
 */

/**
 * CLASS UNDER TEST: 
 * The main class under test is ArrayIntList. It describes a single array integer list 
 * and maintains information regarding: 
 * - the data of the array integer list; 
 * - the size of the array integer list;
 * */

public class TestArrayIntList {

	/**
	 * OVERVIEW: The test case "test0" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test0() throws Throwable {
		// The test case instantiates an "ArrayIntList" with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		// The next method call ensures the capacity of arrayIntList0 with min 
		// capacity 2
		// The execution of this method call implicitly covers the following 1
		// conditions:
		// - the condition " min capacity greater than _data.length" is FALSE;
		arrayIntList0.ensureCapacity(2); // this is correct
		// Then, it tests:
		// 1) whether the size of "arrayintlist0" is equal to 0;
		assertEquals(0, arrayIntList0.size()); // this is correct
	}

	/**
	 * OVERVIEW: The test case "test1" covers around 3.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test1() throws Throwable {
		// The test case instantiates an "ArrayIntList" with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		assertEquals(0, arrayIntList0.getModCount()); // ok
		try {
			// The next method call add the element 321 to "arrayIntList0" at index 0
			arrayIntList0.add(0, 321);
			assertEquals(321, arrayIntList0.get(0)); // ok 
			fail("Expecting exception: ArithmeticException");
		} catch (ArithmeticException e) {
			//
	        // / by zero
	        //
		}
	}

	/**
	 * OVERVIEW: The test case "test2" covers around 1.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test2() throws Throwable {
		// The test case instantiates an "ArrayUnsignedShortList" with the default
		// configuration (initial capacity is 8)
		ArrayUnsignedShortList arrayUnsignedShortList0 = new ArrayUnsignedShortList();
		ArrayIntList arrayIntList0 = null;
		try {
			//Then, the test case assigns to "arrayIntList0arrayIntList0" an object
			// obtained by casting "arrayUnsignedShortList0" as a collection of integers
			arrayIntList0 = new ArrayIntList((IntCollection) arrayUnsignedShortList0);
			fail("Expecting exception: IllegalArgumentException");
		} catch (IllegalArgumentException e) {
	         //
	         // capacity 0
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test3" covers around 5.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test3() throws Throwable {
		// The test case instantiates an "ArrayIntList" with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		// The next method call trim to size of "arrayIntList0"
		arrayIntList0.trimToSize();
		try {
			// the method add 10 to the object "arrayIntList0"
			arrayIntList0.add(10);			
			fail("Expecting exception: ArithmeticException");
		} catch (ArithmeticException e) {
	         //
	         // / by zero
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test4" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test4() throws Throwable {
		// The test case instantiates a "ArrayIntList" with the default
		// configuration (initial capacity is 8)
		// The execution of this constructor implicitly covers the following 1
		// conditions:
		// - the condition " initial capacity less than 1" is FALSE;
		ArrayIntList arrayIntList0 = new ArrayIntList(8);		
		try {
			// It sets the element -2301 at index -3120 in arrayIntList0
			arrayIntList0.set((-2301), (-3120)); // ok 
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
	         //
	         // Should be at least 0 and less than 0, found -2301
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test5" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test5() throws Throwable {
		// The test case instantiates a "ArrayIntList"  with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			// The next method call add the element to -1121 "arrayIntList0" at 
			// index -1121
			arrayIntList0.add((-1121), (-1121)); // ok
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
			//
	        // Should be at least 0 and at most 0, found -1121
	        //
		}
	}

	/**
	 * OVERVIEW: The test case "test6" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test6() throws Throwable {
		// The test case instantiates a "ArrayIntList"  with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			// It sets the element 1784 at index 1875 in arrayIntList0
			arrayIntList0.set(1875, 1784); // ok
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
			 //
	         // Should be at least 0 and less than 0, found 1875
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test7" covers around 3.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test7() throws Throwable {
		// The test case instantiates a "ArrayIntList" with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		// The next method call the ensures the capacity of arrayIntList0 with min 
		// capacity 58
		// The execution of this method call implicitly covers the following 1
		// conditions:
		// - the condition " min capacity greater than _data.length" is TRUE;
		arrayIntList0.ensureCapacity(58);
		// Then, it tests:
		// 1) whether the size of "arrayintlist0" is equal to 0;
		assertEquals(0, arrayIntList0.size());
		
	}

	/**
	 * OVERVIEW: The test case "test8" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test8() throws Throwable {
		// The test case instantiates a "ArrayIntList" with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		// The next method call trim to size of "arrayIntList0"
		// The execution of this method call implicitly covers the following 1
		// conditions:
		// - the condition "the size is less than data.length" is TRUE;
		arrayIntList0.trimToSize();
		// The next method call trim to size of "arrayIntList0"
		// The execution of this method call implicitly covers the following 1
		// conditions:
		// - the condition "the size is less than data.length" is TRUE;
		arrayIntList0.trimToSize();
		// Then, it tests:
		// 1) whether the size of "arrayintlist0" is equal to 0;
		assertEquals(0, arrayIntList0.size());
	}

	/**
	 * OVERVIEW: The test case "test9" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test9() throws Throwable {
		// The test case instantiates a "ArrayIntList"  with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			// It retrieves the element at index -1091 of arrayIntList0
			arrayIntList0.get((-1091));
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
	         //
	         // Should be at least 0 and less than 0, found -1091
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test10" covers around 3.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test10() throws Throwable {
		// The test case instantiates a "ArrayIntList"  with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		// The next method call the ensure capacity in min cap 9 to
		// arrayIntList0
		// The execution of this method call implicitly covers the following 1
		// conditions:
		// - the condition " min capacity greater than _data.length" is TRUE;
		arrayIntList0.ensureCapacity(9);
		// Then, it tests:
		// 1) whether the size of "arrayintlist0" is equal to 0;
		assertEquals(0, arrayIntList0.size());
	}

	/**
	 * OVERVIEW: The test case "test11" covers around 2.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test11() throws Throwable {
		// The test case instantiates a "ArrayIntList" with the default
		// configuration.
		ArrayIntList arrayIntList0 = new ArrayIntList();
		try {
			// The next method call add the element 2 to "arrayIntList0" at 
			// index 2155
			arrayIntList0.add(2155, 2);
			fail("Expecting exception: IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
	         //
	         // Should be at least 0 and at most 0, found 2155
	         //
		}
	}

	/**
	 * OVERVIEW: The test case "test12" covers around 3.0% (low percentage) of
	 * statements in "ArrayIntList"
	 **/
	@Test
	public void test12() throws Throwable {
		// The test case instantiates an "ArrayUnsignedShortList" with the default
		// configuration (initial capacity is 8)
		ArrayUnsignedShortList arrayUnsignedShortList0 = new ArrayUnsignedShortList();
		// the method add the element 11 to the object "arrayUnsignedShortList0"
		arrayUnsignedShortList0.add(11);
		ArrayIntList arrayIntList0 = null;
		try {
			//Then, the test case assigns to "arrayIntList0arrayIntList0" an object
			// obtained by casting "arrayUnsignedShortList0" as a collection of integers
			arrayIntList0 = new ArrayIntList((IntCollection) arrayUnsignedShortList0);
			fail("Expecting exception: ArithmeticException");
		} catch (ArithmeticException e) {
	         //
	         // / by zero
	         //
		}
	}

}
