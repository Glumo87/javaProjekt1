package game;

import common.Field;
import common.Maze;
import common.MazeObject;

public class PathField implements Field {

    private int row;
    private int column;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof PathField) {
            if (((PathField) obj).column == this.column && ((PathField) obj).row == this.row)
                return true;
        }
        return false;
    }
    public PathField(int row, int column) {
        this.row=row;
        this.column=column;
    }
    @Override
    public boolean canMove() {
        return true;
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
