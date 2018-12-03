import java.awt.Graphics;

public class Space extends Box {
	
	double min;
	double etirement;
	
	Space(double min, double etirement) {
		this.min = min;
		this.etirement = etirement;
	}
	
	public double getAscent() {
		return 0;
	}

	public double getDescent() {
		return 0;
	}

	public String toString() {
		return "Space" + "[" + super.toString() + "]";
	}
	
	public void doDraw(Graphics graph, double x, double y, double w) {
		return;
	}

	@Override
	public double getWidth() {
		return (this.min + this.etirement);
	}

	@Override
	public double getStretchingCapacity() {
		return this.etirement;
	}
}