package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Rook;

public class ChessMatch {
    private final Board board;

    public ChessMatch() {
        this.board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] pieces = new ChessPiece[board.getRows()][board.getCols()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getCols(); j++) {
                pieces[i][j] = (ChessPiece) board.piece(i, j);
            }
        }

        return pieces;
    }

    private void initialSetup() {
        board.placePiece(new Rook(board, Color.WHITE), new Position(7, 0));
    }
}
