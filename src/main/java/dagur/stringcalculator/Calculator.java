package dagur.stringcalculator;

import java.util.*;


public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}else if(text.contains("-")){
			String negatives = findNegatives(text);
			throw new IllegalArgumentException("Negatives not allowed: " + negatives);
		}else if(text.contains(",") || text.contains("\n")){
			return findSum(splitter(text));
		}else
			return convertToInt(text);
		
		
	}

	private static int convertToInt(String text) {
		int result;
		result = Integer.parseInt(text); 
		return result;
	}

	private static String[] splitter(String numbers){
		numbers = numbers.replaceAll("[\\\n]", ",");
		return numbers.split(",");
	   
	}
      
    private static int findSum(String[] numbers){
 	    int sum = 0;
        for(String number : numbers){
        	int temp = convertToInt(number);
        	if(temp > 1000)
        	{
        		temp = 0;
        	}
		    sum = sum + temp;
		}
		return sum;
    }

    private static String findNegatives(String numbers){
    	String[] nums = splitter(numbers);

    	String negs = "";
    	String comma = ", ";

    	for(String number : nums){
        	if(number.contains("-")){
        		negs = negs + number + comma;
        	}
		}


		if(negs.endsWith(", ")){
			negs = negs.substring(0, negs.length() - 2);
		}
		
		return negs;

    }
  

}
