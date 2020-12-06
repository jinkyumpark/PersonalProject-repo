public class NumberSystemConverter {
	private String num = "";
	
	public MyNum(String num) {
		this.num = num;
	}
	
	public String toBinary() {
		int numInt = Integer.parseInt(this.num);
		String numOut = "";
		while(numInt != 0 && numInt != 1) {
			if(numInt % 2 == 1) {
				numOut += 1;
			}else {
				numOut += 0;
			}
			numInt /= 2;
		}
		numOut = reverseStr(numOut);
		return numOut;
	}
	
	public String toOctal() {
		int inNum = Integer.parseInt(num);
		String outStr = "";
		return "";
	}
	
	public String toHexa() {
		int inNum = Integer.parseInt(num);
		String outStr = "";
		
		int digit = deriveDigit(inNum, 16);
		
		while(inNum != 0) {
			int count = 0;
			while(inNum < digit) {
				inNum -= digit;
				count++;
			}
			outStr += convertDigitHexa(count);
			digit /= 16;
		}
		return outStr;
	}
	
	private char convertDigitHexa(int inNum) {
		char outNum = (char)(inNum);
		if(inNum == 10)
			outNum = 'A';
		if(inNum == 11)
			outNum = 'B';
		if(inNum == 12)
			outNum = 'C';
		if(inNum == 13)
			outNum = 'D';
		if(inNum == 14)
			outNum = 'E';
		if(inNum == 15)
			outNum = 'F';
		return outNum;
	}
	
	private int deriveDigit(int inNum, int numberSystem) {
		int checker = 1;
		while(inNum < checker) {
			if(inNum > checker) {
				checker *= numberSystem;
			}
		}
		checker /= numberSystem;
		return checker;
	}
	
	private String reverseStr(String inStr) {
		String outStr = "";
		for(int i = inStr.length()-1; i > 0; i--) {
			outStr += inStr.charAt(i);
		}
		return outStr;
	}
}
