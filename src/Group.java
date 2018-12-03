import java.awt.Graphics;
import java.util.LinkedList;

public class Group extends Box {
	protected final LinkedList<Box> list;
	
	Group() {
		this.list = new LinkedList<Box>();
	}
	
	double ascent = 0;
	double descent = 0;
	double width = 0;
	double stretchingCapacity = 0;
	
	void add(Box b) {
		this.list.addFirst(b);
	}
	
	public String toString() {
		String str = "[w=" + width + "]{\n";
		for (Box b: list) {
			str += b.toString() + "\n";
		}
		str.replaceAll("[", "     [");
		return str;
	}

	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return width;
	}

	@Override
	public double getAscent() {
		// TODO Auto-generated method stub
		return ascent;
	}

	@Override
	public double getDescent() {
		// TODO Auto-generated method stub
		return descent;
	}

	@Override
	public double getStretchingCapacity() {
		// TODO Auto-generated method stub
		return stretchingCapacity;
	}

	@Override
	protected void doDraw(Graphics graph, double x, double y, double w) {
		// TODO Auto-generated method stub
		
	}
}