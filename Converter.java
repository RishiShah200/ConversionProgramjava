public class Converter implements Conversion{

	public String decToBin(String num){
		String s = "";
		 int x = Integer.parseInt(num);
		while(x>0){
			if(x%2==0)
				s = "0" + s;
			else
				s = "1" + s;
			x/=2;
		}
		return s;
	}
	public String binToDec(String num){
		int binaryNumber = Integer.parseInt(num);
		int decimal = 0;
		String decimalReturn = "";
		    int p = 0;
		    while(true){
		      if(binaryNumber == 0){
		        break;
		      } else {
		          int temp = binaryNumber%10;
		          decimal += temp*Math.pow(2, p);
		          binaryNumber = binaryNumber/10;
		          p++;
		       }
		    }
    decimalReturn = ""+decimal;
    return decimalReturn;
	}
	public String decToHex(String num){
			int rem;
			int number2 = Integer.parseInt(num);
			     String str2="";
			     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			     while(number2>0){
			       rem=number2%16;
			       str2=hex[rem]+str2;
			       number2=number2/16;
    	 		}
    	 		return str2;
		}

	public String hexToDec(String num){
		String hex = ("0123456789ABCDEF");
		num = num.toUpperCase();
		int sum = 0;
		for(int x = 0;x<num.length();x++){
				int i = hex.indexOf(num.charAt(x));
				sum = (sum*16)+i;
		}
		String Dec = ""+sum;
		return Dec;
	}
	public String binToHex(String num){
		String bin = binToDec(num);
		return decToHex(bin);
	}
	public String hexToBin(String num){
		String hex = hexToDec(num);
		return decToBin(hex);
	}

}
