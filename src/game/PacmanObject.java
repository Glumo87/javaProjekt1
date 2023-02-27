package game;

import common.Field;
import common.Maze;
import common.MazeObject;

public class PacmanObject implements MazeObject {
    private int row;
    private int column;
    private Maze maze;
    public PacmanObject(int row, int column, Maze maze) {
        this.row=row;
        this.column=column;
        this.maze=maze;
    }
    @Override
    public boolean canMove(Field.Direction dir) {

        return false;
    }

    @Override
    public boolean move(Field.Direction dir) {
        return false;
    }
}
