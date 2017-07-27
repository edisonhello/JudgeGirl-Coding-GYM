package �i�����U�t��;

import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);
		int selection;
		
		FileManager file = FileManager.getInstance();
		do {
			System.out.println("(0) �n�J (1) ���U�b�K (2) ���}:");
			selection = input.nextInt();
			if (selection == 0) {
				SignInSystem signInSystem = new SignInSystem();
				try {
					signInSystem.signIn();
				} catch (UserInformationNotFoundException e) {
					e.printStackTrace();
				}
			}
			else if (selection == 1) {
				SignUpSystem signUpSystem = new SignUpSystem();
				try {
					signUpSystem.signUp();
				} catch (UserAccountIsExistedException e) {
					e.printStackTrace();
				}
			}
			else if (selection == 2) {
				break;
			}
			else {
				System.out.println("��J���~");
			}
		} while (selection != 2);
		file.writeFile();
		
	}
	
}
