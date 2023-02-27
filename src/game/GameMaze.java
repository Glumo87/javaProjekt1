package game;

import common.Field;
import common.Maze;

public class GameMaze implements Maze {
    private Field[][] fieldArray;
    private int rows;
    private int columns;
    public GameMaze(Field[][] fieldArray,int rows,int columns) {
        this.fieldArray=fieldArray;
        this.rows=rows;
        this.columns=columns;
    }

    public static GameMaze createGameMaze(String[] maze, int rows, int columns) {
        Field[][] fieldArray=new Field[rows+2][columns+2];
        for(int i=0;i<rows+2;i++) {
            for(int j=0;j<columns+2;j++) {
                if(i ==0||j==0||i==rows+1||j==columns+1) {
                    fieldArray[i][j]=new WallField(i,j);
                }
                else {
                    if (maze[i].charAt(j)=='X') {
                        fieldArray[i][j]=new WallField(i,j);
                    }
                    else {
                        fieldArray[i][j]=new PathField(i,j);
                    }
                }
            }
        }
        return new GameMaze(fieldArray,rows+2,columns+2);
    }

    @Override
    public Field getField(int row, int col) {
        return fieldArray[row][columns];
    }

    @Override
    public int numRows() {
        return this.rows;
    }

    @Override
    public int numCols() {
        return this.columns;
    }
}
