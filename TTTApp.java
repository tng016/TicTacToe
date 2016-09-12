import java.util.Scanner;

public class TTTApp
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		int round = 0; //current round, used to tell who's turn it is
		int rowInput=0 ,colInput=0; //temp storage of input
		Board board1 = new Board();

		while (round<9){
			System.out.println("This is round number: " + round);
			char playerTurn = xo(round);
			System.out.println("It is " + playerTurn +"'s Turn");
			board1.printBoard();

			do{
				System.out.println("row:");//gets row and column from user
				rowInput = sc.nextInt();
				System.out.println("column:");
				colInput = sc.nextInt();
			} while(board1.checkMark(rowInput,colInput) == -1);
			
			board1.setMark(playerTurn,rowInput,colInput);//puts user input onto board

			if (board1.gameover(playerTurn) == 1){//gameover mechanism
				board1.printBoard();
 				System.out.println("Gameover");
 				System.out.println(playerTurn + " Wins!");
 				break;
			}
			round++;
		}
		System.out.println("Gameover\nIt's a tie!");
	}

	public static char xo(int round){//even rounds are x turn, odd rounds are o turn
		
		return round%2 == 0 ? 'x' : 'o' ;
	
	}
}
