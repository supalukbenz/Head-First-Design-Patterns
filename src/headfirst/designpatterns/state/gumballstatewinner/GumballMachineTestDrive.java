package headfirst.designpatterns.state.gumballstatewinner;

import java.util.Scanner;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GumballMachine gumballMachine = 
			new GumballMachine(100);

		System.out.println(gumballMachine);

		int num = 0;

		while(num != 5){
			System.out.println("1: Insert Quarter");
			System.out.println("2: Eject Quarter");
			System.out.println("3: Turn Crank");
			System.out.println("4: Try My Luck!!");
			System.out.println("5: Exit");
			System.out.println();
			System.out.print("Enter the number >> ");
			num = scan.nextInt();
			System.out.println();
			switch (num) {
				case 1:
					gumballMachine.insertQuarter();
					break;
				case 2:
					gumballMachine.ejectQuarter();
					break;
				case 3:
					gumballMachine.turnCrank();
					break;
				case 4:
					gumballMachine.tryMyLuck();
					break;
				default: break;
			}
			System.out.println(gumballMachine);

		}
	}
}
