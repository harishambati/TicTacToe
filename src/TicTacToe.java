import java.util.LinkedList;
import java.util.Scanner;

import Models.Game;

public class TicTacToe {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey, Enter the Size of the Board");
		int size = sc.nextInt();
		System.out.println("Hey, Enter of Players");
		int noOfPlayers = sc.nextInt();
		
		
		Game game = Game.getBuilder().
				setBoardSize(size).
				setPlayers(new LinkedList<>()).
				buildGame();
		
		

		while(true) {
				System.out.println("Game is in progress");
				
				break;
		}
	}
	

}
