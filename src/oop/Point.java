package oop;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        int xA = this.x;
        int yA = this.y;
        int xB = 0;
        int yB = 0;
        return Math.sqrt((xB-xA)*(xB-xA)+(yB-yA)*(yB-yA));
    }

    public double distance(int x, int y){
        int xA = this.x;
        int yA = this.y;
        int xB = x;
        int yB = y;
        return Math.sqrt((xB-xA)*(xB-xA)+(yB-yA)*(yB-yA));
    }

    public double distance(Point another){
        int xA = this.x;
        int yA = this.y;
        int xB = another.x;
        int yB = another.y;
        return Math.sqrt((xB-xA)*(xB-xA)+(yB-yA)*(yB-yA));
    }
}
