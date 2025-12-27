package IntheritanceTv;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	static Television tv;

	public static void main(String[] args) {

		showMenu();
		boolean quit = false;
		while (quit == false) {
			System.out.println("Your coice :  (Press 8 to see the menu.) ");
			int coice = input.nextInt();
			switch (coice) {
			case 1:
				openTv();
				break;
			case 2:
				setupTVAndCreateChannels();
				break;
			case 3:
				voiceIncrease();
				break;
			case 4:
				voiceReduce();
				break;
			case 5:
				changeChannel();
				break;
			case 6:
				showInfo();
				break;
			case 7:
				closeTv();
				break;
			case 8:
				showMenu();
				break;
			case 0:
				System.out.println("Logging out of the system...");
				quit = true;
				break;
			default:
				System.out.println("Enter a number between 0 and 8.");
			}
		}

	}

	private static void showInfo() {

		System.out.println("Which channel would you like information about?");
		int channelWhereInformationIsRequested = input.nextInt();
		tv.showActiceChannel();
	}

	private static void changeChannel() {
		if (tv != null) {
			System.out.println("Press the button for the channel you want to open.");
			int desiredChannel = input.nextInt();
			tv.changeChannel(desiredChannel);
		} else {
			System.out.println("Firstly setup TV and change channel.");
		}

	}

	private static void voiceReduce() {
		if (tv != null) {
			tv.voiceReduce();
		} else {
			System.out.println("Tv is off");
		}

	}

	private static void voiceIncrease() {
		if (tv != null) {
			tv.voiceIncrease();
		} else {
			System.out.println("Tv is off");
		}

	}

	private static void closeTv() {
		if (tv != null) {
			tv.closeTv();
		} else {
			System.out.println("First, set up the TV and create the channels.");
		}
	}

	private static void openTv() {
		if (tv != null) {
			tv.openTv();
		} else {
			System.out.println("First, set up the TV and create the channels.");
		}
	}

	private static void setupTVAndCreateChannels() {

		if (tv == null) {
			input.nextLine();
			System.out.println("Enter the TV brand.");
			String brand = input.nextLine();
			System.out.println("Enter the TV size ( in inch type)");
			int size = input.nextInt();
			tv = new Television(brand, size);

		} else {
			System.out.println(tv);
		}

	}

	private static void showMenu() {
		System.out.println("------------ MENU ------------\n");

		System.out.println(
				"0 -- Quit\n" + "1 -- Open TV\n" + "2 -- Setup TV\n" + "3 -- Insraense Voice\n" + "4 -- Reduce Voice\n"
						+ "5 -- Change Channel\n" + "6 -- Info Channel\n" + "7 -- Close Tv\n" + "8 -- Show Menu");
	}
}
