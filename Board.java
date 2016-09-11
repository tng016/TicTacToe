import java.util.Arrays;

public class Board{
	private final int LENGTH = 3;
	private char[][] board = new char[][] {{'_','_','_'},{'_','_','_'},{'_','_','_'}};


	public void printBoard(){
		System.out.println("=== Tic Tac Toe ===");
		System.out.println("|" + board[0][0] + "|" + board[0][1] + "|"+ board[0][2] + "|");
		System.out.println("|" + board[1][0] + "|" + board[1][1] + "|"+ board[1][2] + "|");
		System.out.println("|" + board[2][0] + "|" + board[2][1] + "|"+ board[2][2] + "|");
	}

	public void setMark(char c,int row,int col){
		board[row-1][col-1] = c;
	}

	public int gameover(char c){
		int count3=0;
		int count4=0;
		for (int i = 0; i<3; i++)
		{
			int count1 = 0;
			int count2 = 0;
			for (int j = 0; j<3; j++)
			{
				if (board[i][j] == c)
					count1++;
				if (board[j][i] == c)
					count2++;
			}
			if (count1 == 3 || count2 ==3)
				return 1;
			if (board[i][i] == c)
				count3++;
			if (board[i][2-i] == c)
				count4++;
		}
		if (count3 == 3 || count4 ==3)
			return 1;
		else
			return -1;
	}

}