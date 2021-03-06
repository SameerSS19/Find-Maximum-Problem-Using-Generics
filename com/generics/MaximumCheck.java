package com.generics;

public class MaximumCheck 
{
	 /* Welcome message */
    public static void main(String[] args) 
    {
    	System.out.println("Welcome to the Test Maximum Program");
    	System.out.println("The maximumInteger value in given set is " + maximumInteger(220, 240, 210));
        System.out.println("The maximumFloat value in given set is " + maximumFloat(220.25f, 240.30f, 210.99f));
        System.out.println("The maximumString value in given set is " + maximumString("Peach", "Apple", "Banana"));
        System.out.println("The maximumInteger Generic value in given set is " + maximumOfObject(999, 999, 996));
        System.out.println("The maximumFloat Generic value in given set is " + maximumOfObject(7.99f, 7.999f, 7.9999f));
        System.out.println("The maximumFloat Generic value in given set is "+ maximumOfObject("BridgeLabz", "Capgemini", "Sogeti"));
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
    
    /* In The Test Position Maximum of 3 String values */
    public static String maximumString(String firstString, String secondString, String thirdString) 
    {
        String maximum = firstString;
        if (secondString.compareTo(maximum) > 0)
            maximum = secondString;
        if (thirdString.compareTo(maximum) > 0)
            maximum = thirdString;
        return maximum;
    }
    
    /* In The Test Position Maximum of 3 Float values */
    public static <T extends Comparable<T>> T maximumOfObject(T first, T second, T third) {
        T maximumValue = first; // first is larger
        if (second.compareTo(maximumValue) > 0)
            maximumValue = second; // second is larger
        if (third.compareTo(maximumValue) > 0)
            maximumValue = third; // third is larger
        return maximumValue;
    }
}
