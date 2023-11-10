package capgemini;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
				char ch,ch1;
				do {
				System.out.println("enter the char");
				Scanner scanner =new Scanner(System.in);
				ch=scanner.next().charAt(0);
						//10 values 
			
				
			
				switch(ch)//I
				{
				case 'a': System.out.println("vowel");
				break;
				case 'e': System.out.println("vowel");
				break;
				case 'i': System.out.println("vowel");
				break;
				case 'o': System.out.println("vowel");
				break;
				case 'u': System.out.println("vowel");
				break;
				case 'A': System.out.println("vowel");
				break;
				case 'E': System.out.println("vowel");
				break;
				case 'I': System.out.println("vowel");
				break;
				case 'O': System.out.println("vowel");
				break;
				case 'U': System.out.println("vowel");
				break;
				default: System.out.println("consonent");
				break;
				}
				System.out.println("Do you want to check another then press y");
				ch1=scanner.next().charAt(0);
			}
			while(ch1=='y' || ch1=='Y');
				
		
		
		
	}

}
