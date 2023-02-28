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


    @Override
    public boolean move(Field.Direction dir) {
        Field temp=this.field.nextField(dir);
        temp.put(this);
        this.field.remove(this);
        this.field=temp;
        return true;
    }
}
