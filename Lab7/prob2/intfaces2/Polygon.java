package lesson5.lecture.intfaces2;

public interface Polygon extends ClosedCurve{

    double[] getSides();

    default double computePerimeter() {
        double[] lengths = getSides();
        double sum = 0.0;
        for(double len : lengths) {
            sum += len;
        }
        return sum;
    }
}
