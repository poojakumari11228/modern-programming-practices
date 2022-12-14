package lesson5.lecture.intfaces2;

public class EquilateralTriangle implements Polygon {
    private double side;

    EquilateralTriangle(double side){ this.side = side;}

    
    public void setSides(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public  double[] getSides(){
              return new double[]{side, side, side};
    }
}
