/*
 * Copyright (c) Samia Shaikh. All rights reserved.
 * MUET. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

/*
 * Portions Copyright 14SW49. All Rights Reserved.
 */


import java.io.*;
import java.util.*;

/**
 * Immutable objects which describe certain rules for inserting and deleting, such as those
 * implemented by the basic mathematical operators.
 *
 * <p>The base-independent settings are:
 * <ol>
 * <li>{@code precision}:
 * the number of basic operations for such are
 *
 * @see     ReverseString,oddeven
 * @author  Samia Shaikh (14SW049)
 * @since 1.5
 */

public final class MyFirstApi{
	/*
	*Reverse string
	* initializing variables which will be used for storing values
	* initializing methods which will be used for this class
	*/

	public static String rs(String a){
		String str="";
		int size=a.length();
		for(int i=size-1;i>=0;i--)
	{	str+=" "+a.charAt(i);}
	return str;
}
// Odd even


	public  String oddeven(int a){
	if(a%2==0){
	return "the num is even";}
	else
	{return "the num is odd";}}



}