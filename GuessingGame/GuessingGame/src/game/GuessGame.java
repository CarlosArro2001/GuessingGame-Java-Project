package game;

public class GuessGame {
	//GuessGame has three instance variables for three player objects.
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		
	//Creates three players pertaining to the three instance variables.	
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
	
	//declaring three variables to hold the number of guesses 
	//the players make during the game  
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0; 
		
	//declaring three booleans to determine whether the answer is right or not
	//based on true or false
		boolean p1isRight = false ;
		boolean p2isRight = false ; 
		boolean p3isRight = false ; 
	
	//declaring a target number that players need to guess 
	int targetNumber = (int) (Math.random() * 10);	
	System.out.println("The number I am thinking of is between 0 and 9 ...");
	
	while(true) {
		
	//each player calls the guess method 	
		p1.guess();
		p2.guess();
		p3.guess();
	
	//each players guess variable gets the players number ( number is from the player class)
	// stored in them by accessing the number variable of each player 
		guessp1 = p1.number;
		System.out.println("Player 1 guessed " + guessp1);
		
		guessp2 = p2.number;
		System.out.println("Player 2 guessed " + guessp2);
		
		guessp3 = p3.number;
		System.out.println("Player 3 guessed " + guessp3);
	//checking if each guess is right and if it is , the isRight variable will turn true
		if (guessp1 == targetNumber) {
			p1isRight = true;
		}
		if(guessp2 == targetNumber) {
			p2isRight = true;
		}
		if(guessp3 == targetNumber) {
			p3isRight = true;
		}
	//if all of them are correct it will end the whole program via "break;"
				if(p1isRight || p2isRight || p3isRight) {
					System.out.println("We have a winner");
					System.out.println("Player 1 got it right?" + p1isRight);
					System.out.println("Player 2 got it right?" + p2isRight);
					System.out.println("Player 3 got it right?" + p3isRight);
					System.out.println("Game over");
					break;//game over, so break out of loop
				} else {
					System.out.println("Players will have to try again , sadly");
			}
		}
	}
}
