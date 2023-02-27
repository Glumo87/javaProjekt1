package common;

public interface Field {
    boolean canMove();
    MazeObject get();
    boolean isEmpty();

    boolean remove(MazeObject object);

    boolean put(MazeObject object);

    Field nextField(Field.Direction dirs);

    void setMaze(Maze maze);
    static enum Direction {
        D,L,R,U;
       /* public int deltaRow();
        public int deltaCol();*/
    }
}
