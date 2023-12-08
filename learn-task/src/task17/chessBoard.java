package task17;

public class chessBoard {
	private ChessPiece[][] board;

	public chessBoard(ChessPiece[][] board) {
		this.board = board;
	}

	public void print(){
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) System.out.print(board[j][i].getRepresentation());

			System.out.println();
			
		}
	}
}

