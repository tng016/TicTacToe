import java.util.Scanner;

public class TTTApp
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		int round = 0;
		int out;
		Board board1 = new Board();

		while (round<10){
			if (round%2==0)
				System.out.println("It is X's Turn");
			else
				System.out.println("It is O's Turn");
			
			board1.printBoard();
			System.out.println("row:");
			out = sc.nextInt();
			System.out.println("column");
			board1.setMark(xo(round),out,sc.nextInt());

			if (board1.gameover(xo(round)) == 1){
				board1.printBoard();
 				System.out.println("Gameover");
 				System.out.println(xo(round) + " Wins!");
 				break;
			}
			round++;
		}
	}

	public static char xo(int round){
		if (round%2 == 0)
			return 'x';
		else
			return 'o';
	}
}