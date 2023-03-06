package ija.ija2022.homework1.game;

import ija.ija2022.homework1.common.Maze;

public class MazeConfigure {
    private int rows;
    private int columns;
    private boolean canRead;
    private boolean isValid;
    private int linesRead;
    private String[] mazeMap;
    public MazeConfigure() {
        linesRead=0;
        canRead=false;
        isValid=true;
    }
    public void startReading(int rows, int columns) {
        this.rows=rows;
        this.columns=columns;
        this.canRead=true;
        this.mazeMap=new String[rows];
    }
    public boolean processLine(String line) {
        if(!canRead) {
            this.isValid=false;
            return false;
        }
        else {
            if (line.length()>this.columns||line.length()<this.columns) {
                this.isValid=false;
                return false;
            }
            else {
                char c;
                for(int i =0;i<this.columns;i++) {
                    c=line.charAt(i);
                    if(c!='.'&&c!='S' && c!='X') {
                        this.isValid=false;
                        return false;
                    }

                }
                mazeMap[linesRead++]=line;
                return true;
            }
        }
    }
    public boolean stopReading() {
        this.canRead=false;
        return true;
    }
    public Maze createMaze() {
        if (linesRead!=this.rows || !isValid)
            return null;
        return GameMaze.createGameMaze(this.mazeMap,this.rows,this.columns);
    }
}

