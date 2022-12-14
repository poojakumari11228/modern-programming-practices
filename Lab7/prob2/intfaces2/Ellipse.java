package lesson5.lecture.intfaces2;

public class Ellipse implements ClosedCurve {
	private double semiMajorAxisLength;
	private double ellipticIntegral;
	public Ellipse(double sma, double ei) {
		this.semiMajorAxisLength = sma;
		this.ellipticIntegral = ei;
	}

	public double getSemiMajorAxisLength() {
		return semiMajorAxisLength;
	}

	public double getEllipticIntegral() {
		return ellipticIntegral;
	}

	public void setSemiMajorAxisLength(double semiMajorAxisLength) {
		this.semiMajorAxisLength = semiMajorAxisLength;
	}

	public void setEllipticIntegral(double ellipticIntegral) {
		this.ellipticIntegral = ellipticIntegral;
	}

	@Override
	public double computePerimeter() {
		return 4 * semiMajorAxisLength * ellipticIntegral;
	}
}
