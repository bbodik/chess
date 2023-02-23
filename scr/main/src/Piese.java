import javax.swing.*;

public class Piese extends JButton {
    private boolean isAlive=true;
    private boolean isWhite;
    private char cordX,cordY;

    public Piese(Icon icon,char cordX,char cordY,boolean white) {
        super(icon);
        this.cordX=cordX;
        this.cordY=cordY;
        this.isWhite=white;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }



    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public char getCordX() {
        return cordX;
    }

    public void setCordX(char cordX) {
        this.cordX = cordX;
    }

    public char getCordY() {
        return cordY;
    }

    public void setCordY(char cordY) {
        this.cordY = cordY;
    }
}