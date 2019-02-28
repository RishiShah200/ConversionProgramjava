import java.util.Scanner;
public class ConversionRunner{

	public ConversionRunner(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a number you would like to convert: ");
		String number = reader.nextLine();
		System.out.println("Please enter what you would like to convert to: decToBin [B], binToDec: [D], decToHex[H]");
		String convertTo = reader.nextLine();
		while(!(convertTo.equals("B") || convertTo.equals("D") || convertTo.equals("H"))){
			System.out.println("The choice you entered is invalid. Repick a number: ");
			convertTo = reader.nextLine();
		}
		Converter c = new Converter();
		convertTo = convertTo.toUpperCase();
		if(convertTo.equals("B")){
			number = c.decToBin(number);
			System.out.println(number);
		}
		if(convertTo.equals("D")){
			number = c.binToDec(number);
			System.out.println(number);
		}
		if(convertTo.equals("H")){
			number = c.decToHex(number);
			System.out.println(number);
		}


	}

	public static void main(String[]args){
		ConversionRunner app = new ConversionRunner();

	}

}