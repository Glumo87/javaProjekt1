package game;

import common.Field;
import common.Maze;
import common.MazeObject;

public class WallField implements Field {
    private int row;
    private int column;
    public WallField(int row, int column) {
        this.row=row;
        this.column=column;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof WallField) {
            if (((WallField) obj).column == this.column && ((WallField) obj).row == this.row)
                return true;
        }
        return false;
    }

    @Override
    public boolean canMove() {
        return false;
    }

    @Override
    public MazeObject get() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean remove(MazeObject object) {
        return false;
    }

    @Override
    public boolean put(MazeObject object) {
        return false;
    }

    @Override
    public Field nextField(Direction dirs) {
        return null;
    }

    @Override
    public void setMaze(Maze maze) {

    }
}
