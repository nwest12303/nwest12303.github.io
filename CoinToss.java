import java.util.Scanner;
import java.util.Random;

public class CoinToss{
	public static void main(String[] args){
boolean z = true;
	while(z = true){
		Scanner in = new Scanner(System.in);
		System.out.println("Ready to run a coin toss simulation. Enter a number of rounds: ");
		int x = in.nextInt();




        //use boolean
		Random rand = new Random();
		

		String c = "";
		int counter = 0;

		System.out.println("Simulating Coin Tosses");

         int counth = 0;
         int countt = 0;

         int temph = 0;
         int tempt = 0;


		for(int i = 1; i <= x; i++){

                 System.out.print(i + "-");

					while(!(c.contains("H") && c.contains("T"))){
						boolean y = rand.nextBoolean();
						if(y == true){
						c = c + "H";
						System.out.print("H");
						temph++;

					   }
						else{
							c = c + "T";
							System.out.print("T");
							tempt++;
				       }

		        }		
				 c = "";
				 counth += temph;
				 countt += tempt;
				 temph = 0;
				 tempt = 0;
                 System.out.println();

			}


			double avg = ((double)counth + (double)countt) / x;

			System.out.printf("The average number of coin tosses was %.2f.\n",avg);
			System.out.printf("A total of %d heads and %d tails were tossed.\n", counth, countt);

			z = false;


			System.out.println("Would you like to run another simulation? (y/n)");
			Scanner in2 = new Scanner(System.in);
			String ans = in2.nextLine();

			if(ans.equals("y")){
				z = true;
			}
			else{
				return;
			}
	
		   }
	     }
	  }
