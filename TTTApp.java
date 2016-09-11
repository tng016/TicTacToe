import java.util.Scanner;

public class TTTApp
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		int round = 0; //current round, used to tell who's turn it is
		int in,in2; //temp storage of input
		Board board1 = new Board();

		while (round<9){
			System.out.println(round);
			System.out.println("It is " + xo(round) +"'s Turn");
			board1.printBoard();

			do{
				System.out.println("row:");//gets row and column from user
				in = sc.nextInt();
				System.out.println("column");
				in2 = sc.nextInt();
			} while(board1.checkMark(in,in2) == -1);
			
			board1.setMark(xo(round),in,in2);//puts user input onto board

			if (board1.gameover(xo(round)) == 1){//gameover mechanism
				board1.printBoard();
 				System.out.println("Gameover");
 				System.out.println(xo(round) + " Wins!");
 				break;
			}
			round++;
		}
	}

	public static char xo(int round){//even rounds are x turn, odd rounds are o turn
		if (round%2 == 0)
			return 'x';
		else
			return 'o';
	}
}