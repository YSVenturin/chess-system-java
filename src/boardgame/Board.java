package boardgame;

public class Board {
    private int rows;
    private int cols;
    private Piece[][] pieces;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.pieces = new Piece[rows][cols];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}
