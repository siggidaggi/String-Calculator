package dagur.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}else if(text.contains(",")){
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
	    return numbers.split(",");
	}
      
    private static int findSum(String[] numbers){
 	    int sum = 0;
        for(String number : numbers){
		    sum += convertToInt(number);
		}
		return sum;
    }


}
