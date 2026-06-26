package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

    private ChessMatch chessMatch;

    public King(Board board, Color color, ChessMatch chessMatch) {
        super(board, color);
        this.chessMatch = chessMatch;
    }

    @Override
    public String toString() {
        return "K";
    }

    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece)getBoard().piece(position);

        return p == null || p.getColor() != getColor();
    }

    private boolean testRookCastling(Position position) {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p instanceof Rook && p.getColor() == getColor() && p.getMoveCount() == 0;
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] moves = new boolean[getBoard().getRows()][getBoard().getCols()];

        Position p = new Position(0, 0);

        // above
        p.setValues(position.getRow()-1, position.getCol());
        if (getBoard().positionExists(p) && canMove(p)) {
            moves[p.getRow()][p.getCol()] = true;
        }

        // below
        p.setValues(position.getRow()+1, position.getCol());
        if (getBoard().positionExists(p) && canMove(p)) {
            moves[p.getRow()][p.getCol()] = true;
        }

        // left
        p.setValues(position.getRow(), position.getCol()-1);
        if (getBoard().positionExists(p) && canMove(p)) {
            moves[p.getRow()][p.getCol()] = true;
        }

        // right
        p.setValues(position.getRow(), position.getCol()+1);
        if (getBoard().positionExists(p) && canMove(p)) {
            moves[p.getRow()][p.getCol()] = true;
        }

        // nw
        p.setValues(position.getRow()-1, position.getCol()-1);
        if (getBoard().positionExists(p) && canMove(p)) {
            moves[p.getRow()][p.getCol()] = true;
        }

        // ne
        p.setValues(position.getRow()-1, position.getCol()+1);
        if (getBoard().positionExists(p) && canMove(p)) {
            moves[p.getRow()][p.getCol()] = true;
        }

        // sw
        p.setValues(position.getRow()+1, position.getCol()-1);
        if (getBoard().positionExists(p) && canMove(p)) {
            moves[p.getRow()][p.getCol()] = true;
        }

        // se
        p.setValues(position.getRow()+1, position.getCol()+1);
        if (getBoard().positionExists(p) && canMove(p)) {
            moves[p.getRow()][p.getCol()] = true;
        }

        // castle
        if (getMoveCount() == 0 && !chessMatch.getCheck()) {
            // king side
            Position posRook1 = new Position(position.getRow(), position.getCol() + 3);
            if (testRookCastling(posRook1)) {
                Position p1 = new Position(position.getRow(), position.getCol() + 1);
                Position p2 = new Position(position.getRow(), position.getCol() + 2);

                if (!getBoard().thereIsAPiece(p1) && !getBoard().thereIsAPiece(p2)) {
                    moves[position.getRow()][position.getCol()+2] = true;
                }
            }

            // queen side
            Position posRook2 = new Position(position.getRow(), position.getCol() - 4);
            if (testRookCastling(posRook2)) {
                Position p1 = new Position(position.getRow(), position.getCol() - 1);
                Position p2 = new Position(position.getRow(), position.getCol() - 2);
                Position p3 = new Position(position.getRow(), position.getCol() - 3);

                if (!getBoard().thereIsAPiece(p1) && !getBoard().thereIsAPiece(p2) && !getBoard().thereIsAPiece(p3)) {
                    moves[position.getRow()][position.getCol()-2] = true;
                }
            }
        }

        return moves;
    }
}
