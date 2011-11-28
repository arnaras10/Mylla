package is.marshmallow;

import java.io.*;
import java.lang.*;

public class Program
{
	public static void main(String[] args)
	{
		String player1 = "";
		String player2 = "";
		String lastPlayer = "";
		boolean continuePlay = true;

        System.out.println("=== TicTacToe ===");
        System.out.print("Choose a name for player 1: ");                           // spyrja um nofn
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            player1 = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("Choose a name for player 2: ");
        try {
            player2 = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        while (continuePlay){

			TicTacToe t = new TicTacToe(player1, player2);     // leikur byrjar

            System.out.println("---------");
			System.out.println(t.getBoard());

			while (!t.isWinner)
			{
				lastPlayer = t.currentPlayer;
				System.out.println("It is " + t.currentPlayer + "'s turn ");
				System.out.print("Select a number: ");

				try {
					String number = in.readLine();
                    int value = 0;
                    boolean isInputCorrect = false;

                    while ( !isInputCorrect )                       // kannar hvort ad slegid var inn tala minni en 2
                    {
                        if ( Character.isDigit(number.charAt(0)) && (number.length() < 2) )
                        {
                            value = Integer.parseInt(number);
                            isInputCorrect = true;
                        }

                        else
                        {
                            System.out.println();
                            System.out.print("Only use one digit! Try again: ");
                            number = in.readLine();
                        }

                    }



					if ( !(t.placeMarker(value, t.currentMarker)) ) {
                        System.out.println();
                        System.out.println("-- Square already used. Select another one. --");
                    }
				}

                catch (IOException e) {
					e.printStackTrace();
				}

                System.out.println();
                System.out.println("---------");
				System.out.println(t.getBoard());

				if (t.checkWinner())
				{
					System.out.println("-= Congrats " + lastPlayer + " You Won! =-");
				}

				else if (t.checkDraw())
				{
					System.out.println("-= It is a tie =-");
				}
			}

			System.out.println();

            // leikur endar - menu kemur upp
            try{
				System.out.print("(P)lay Again  (N)ew Game  (Q)uit: ");   // birta menu
				String choice = in.readLine();
                System.out.println();

                if (choice.equalsIgnoreCase("N")) {                    // New game - nyjir playerar skradir
                    System.out.print("Choose a name for player 1: ");
                    player1 = in.readLine();

                    System.out.print("Choose a name for player 2: ");
                    player2 = in.readLine();
                }

                else if (choice.equalsIgnoreCase("Q")) {                // haettir i leik - terminate program
                    continuePlay = false;
                }
			}
			catch(IOException e){
				continuePlay = false;
			}

		}
    }
}