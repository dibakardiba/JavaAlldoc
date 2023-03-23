package org.tcs.gaming;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball gameBall = new Ball();
		  Runnable playerOne = new Player("Pasha", gameBall);
		  Runnable playerTwo = new Player("Maxi", gameBall);

		  new Thread(playerOne).start();
		  new Thread(playerTwo).start();
		  System.out.println("dibakar");
	}

}
