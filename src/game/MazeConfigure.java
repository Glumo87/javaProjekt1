package game;

public class MazeConfigure {
    private int rows;
    private int columns;
    private boolean canRead;
    private int linesRead;
    private String[] maze;
    public MazeConfigure() {
        linesRead=0;
        canRead=false;
    }
    public void startReading(int rows, int columns) {
        this.rows=rows;
        this.columns=columns;
        this.canRead=true;
        this.maze=new String[rows];
    }
    public boolean processLine(String line) {
        if(!canRead) {
            return false;
        }
        else {
            if (line.length()>this.columns||line.length()<this.columns) {
                return false;
            }
            else {
                char c;
                for(int i =0;i<this.columns;i++) {
                    c=line.charAt(i);
                    if(c!='.'&&c!='S' && c!='X')
                        return false;
                }
                maze[linesRead++]=line;
                return true;
            }
        }
    }
    public boolean stopReading() {
        this.canRead=false;
        return true;
    }

}

