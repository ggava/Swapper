package classswapper;

public class Swapper {
    private double x,y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void swap(double x, double y){
        double aux;
        aux = this.x;
        this.x = this.y;
        this.y = aux;       
    }
}
