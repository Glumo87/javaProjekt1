package game;

import common.Field;
import common.MazeObject;

public class PacmanObject implements MazeObject {
    private Field field;
    public PacmanObject(Field field) {
        this.field=field;
    }
    @Override
    public boolean canMove(Field.Direction dir) {
        return this.field.nextField(dir).canMove();
    }

    public void setField(Field field) {
        this.field=field;
    }
    @Override
    public boolean move(Field.Direction dir) {
        try {
            Field temp = this.field.nextField(dir);
            temp.put(this);
            this.field.remove(this);
            setField(temp);
        }
        catch(UnsupportedOperationException ex) {
            System.err.println(ex.getMessage());
        }
        return true;
    }
}
