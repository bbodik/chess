public class Piese {
    private char cordX;
    private int cordY;
    private boolean isAlive = true;

    public Piese(char cordX, int cordY) {
        this.cordX = cordX;
        this.cordY = cordY;
    }

    public char getCordX() {
        return cordX;
    }

    public void setCordX(char cordX) {
        this.cordX = cordX;
    }

    public int getCordY() {
        return cordY;
    }

    public void setCordY(int cordY) {
        this.cordY = cordY;
    }

    public void move() {
    }
}
