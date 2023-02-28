package game;

import common.Field;
import common.Maze;
import common.MazeObject;

public class PathField implements Field {

    private int row;
    private int column;
    private MazeObject mazeObject;
    private Maze maze;
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
        this.mazeObject=null;
        this.maze=null;
    }
    @Override
    public boolean canMove() {
        return true;
    }

    @Override
    public MazeObject get() {
        return this.mazeObject;
    }

    @Override
    public boolean isEmpty() {
        return this.mazeObject==null;
    }

    @Override
    public boolean remove(MazeObject object) {
        if (object!=this.mazeObject)
            return false;
        this.mazeObject=null;
        return true;
    }

    @Override
    public boolean put(MazeObject object) {
        if(this.isEmpty()) {
            this.mazeObject=object;
            return true;
        }
        return false;
    }

    @Override
    public Field nextField(Direction dirs) {
        if (this.maze==null)
            return null;
        switch (dirs) {
            case D:
                return this.maze.getField(this.row+1,this.column);
            case L:
                return this.maze.getField(this.row,this.column-1);
            case R:
                return this.maze.getField(this.row,this.column+1);
            case U:
                return this.maze.getField(this.row-1,this.column);
            default:
                return null;
        }
    }

    @Override
    public void setMaze(Maze maze) {
        this.maze=maze;
    }

}
