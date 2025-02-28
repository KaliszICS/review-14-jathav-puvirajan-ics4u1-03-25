public class PracticeProblem {
	public static void main(String args[]) {

	}
	public static int calculate(int num1, int num2, char operator){
		int output = 0;
		switch(operator){
			case '+':
				output = num1 + num2;
				break;
			case '-':
				output = num1 - num2;
				break;
			case '/':
				output = (int)Math.floor(num1/num2);
				break;
			case '*':
				output = num1 * num2;
				break;
			case '%':
				output = num1 % num2;
				break;
			case '^':
				output = (int)Math.pow(num1,num2);
				break;
			default:

		}
		return output;
	}
	final static int MAXIMUM = 10;
	public static boolean totalWordsChecker(String str){
		return str.split("[^\\w.'']+|\\(\\)").length <= MAXIMUM;
	}
	public static String minString(String str1, String str2, String str3){
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		str3 = str3.toLowerCase();
		if(str1.compareTo(str2) <= 0){
			if(str1.compareTo(str3) <= 0){
				return str1;
			}else{
				return str3;
			}
		}else{
			if(str2.compareTo(str3) <= 0){
				return str2;
			}else{
				return str3;
			}
		}
	}
}
