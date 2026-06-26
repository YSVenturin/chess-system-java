package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {
    public Knight(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "N";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] moves = new boolean[getBoard().getRows()][getBoard().getCols()];

        Position p = new Position(0 ,0);

        // nw
        p.setValues(position.getRow()-1, position.getCol()-2);
        if (getBoard().positionExists(p) && (isThereOpponentPiece(p) || !getBoard().thereIsAPiece(p))) {
            moves[p.getRow()][p.getCol()] = true;
        }
        p.setValues(position.getRow()-2, position.getCol()-1);
        if (getBoard().positionExists(p) && (isThereOpponentPiece(p) || !getBoard().thereIsAPiece(p))) {
            moves[p.getRow()][p.getCol()] = true;
        }

        // ne
        p.setValues(position.getRow()-1, position.getCol()+2);
        if (getBoard().positionExists(p) && (isThereOpponentPiece(p) || !getBoard().thereIsAPiece(p))) {
            moves[p.getRow()][p.getCol()] = true;
        }
        p.setValues(position.getRow()-2, position.getCol()+1);
        if (getBoard().positionExists(p) && (isThereOpponentPiece(p) || !getBoard().thereIsAPiece(p))) {
            moves[p.getRow()][p.getCol()] = true;
        }

        // se
        p.setValues(position.getRow()+1, position.getCol()+2);
        if (getBoard().positionExists(p) && (isThereOpponentPiece(p) || !getBoard().thereIsAPiece(p))) {
            moves[p.getRow()][p.getCol()] = true;
        }
        p.setValues(position.getRow()+2, position.getCol()+1);
        if (getBoard().positionExists(p) && (isThereOpponentPiece(p) || !getBoard().thereIsAPiece(p))) {
            moves[p.getRow()][p.getCol()] = true;
        }

        // sw
        p.setValues(position.getRow()+1, position.getCol()-2);
        if (getBoard().positionExists(p) && (isThereOpponentPiece(p) || !getBoard().thereIsAPiece(p))) {
            moves[p.getRow()][p.getCol()] = true;
        }
        p.setValues(position.getRow()+2, position.getCol()-1);
        if (getBoard().positionExists(p) && (isThereOpponentPiece(p) || !getBoard().thereIsAPiece(p))) {
            moves[p.getRow()][p.getCol()] = true;
        }

        return moves;
    }
}
