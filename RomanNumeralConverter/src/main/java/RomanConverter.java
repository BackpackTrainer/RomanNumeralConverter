
public class RomanConverter {

	public RomanConverter() {}

	public String convertToRomanNumerals(int input) {
		String output = "";
		
		while(input > 0) { 
//			output += "I"; 
//			input--;
//			
//				switch(input) {
//				case 5:
//					output += "V";
//					input -= 5;
//				case 1:
//				case 2:
//				case 3:
//					output += "I"; 
//					input--;
//
//				}
			//^ change to ifs and use continues.
			//example:
			if( (input - 5) >= 0 ){output += "V"; input -= 5; continue; }
			output += "I"; input -= 1;
		}
		
		
		return output;
	}
}
