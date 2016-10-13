package dagur.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
			return convertToInt(text);
	}

	private static int convertToInt(String text) {
		int result;
		result = Integer.parseInt(text); 
		return result;
	}

}
