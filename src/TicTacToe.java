import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Models.Game;
import Models.Player;

public class TicTacToe {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey, Enter the Size of the Board");
		int size = sc.nextInt();
		System.out.println("Hey, Enter of Players");
		int noOfPlayers = sc.nextInt();
		System.out.println("Do you want any bot in the game? y/n");
		String isBot  = sc.next();
		List<Player> listOfPalyers = new LinkedList<>();
		
		if(isBot.equals("y")) {
			 noOfPlayers--;
			System.out.println("Enter Name for Bot ");
			String name = sc.next();
			System.out.println("Enter Symbol for Bot ");
			String symbol = sc.next();
//			System.out.println("Enter difficulty for Bot ");
//			String symbol = sc.nextLine();
			listOfPalyers.add(new Player(name, symbol));
		}
		
		
	
		
		for(int i = 0 ; i < noOfPlayers; i++){
			System.out.println("Enter Name for Player "+ (i + 1));
			String name = sc.next();
			System.out.println("Enter Symbol for Player "+ (i + 1));
			String symbol = sc.next();
			listOfPalyers.add(new Player(name, symbol));
		}
		
		
		Game game = Game.getBuilder().
				setBoardSize(size).
				setPlayers(new LinkedList<>()).
				buildGame();
		
		

		while(true) {
				System.out.println("Game is in progress");
				System.out.println("Game in progress 2");
				break;
		}
	}
	

}
