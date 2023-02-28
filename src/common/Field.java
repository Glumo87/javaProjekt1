package common;

public interface Field {
    boolean canMove();
    MazeObject get();
    boolean isEmpty();

    boolean remove(MazeObject object) throws UnsupportedOperationException;

    boolean put(MazeObject object) throws UnsupportedOperationException;

    Field nextField(Field.Direction dirs) throws UnsupportedOperationException;

    void setMaze(Maze maze);
    enum Direction {
        D,L,R,U
    }
}
