package com.generics;

public class MaximumCheck 
{
	 /* Welcome message */
    public static void main(String[] args) 
    {
    	System.out.println("Welcome to the Test Maximum Program");
	}

    /*In The Test Position Maximum of 3 Integer values */
    public static Integer maximumInteger(Integer firstValue, Integer secondValue, Integer thirdValue) 
    {
        Integer maximumValue = firstValue;
        if (secondValue.compareTo(maximumValue) > 0)
            maximumValue = secondValue;
        if (thirdValue.compareTo(maximumValue) > 0)
            maximumValue = thirdValue;
        return maximumValue;
    }
    /* In The Test Position Maximum of 3 Float values */
    public static Float maximumFloat(Float first, Float second, Float third) 
    {
        Float maximumValue = first; // first is larger
        if (second.compareTo(maximumValue) > 0)
            maximumValue = second; // second is larger
        if (third.compareTo(maximumValue) > 0)
            maximumValue = third; // third is larger
        return maximumValue;
    }
}
