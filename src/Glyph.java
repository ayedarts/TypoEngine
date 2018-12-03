import java.awt.Font;
import java.awt.Graphics;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;

public class Glyph extends Box {

	final private static FontRenderContext frc = new FontRenderContext(null, false, false);
	final private Font font;
	final private char[] chars;
	final private Rectangle2D bounds;

	Glyph(Font font, char c) {
		this.font = font;
		char[] chars = new char[1];
		chars[0] = c;
		TextLayout layout = new TextLayout(("" + chars[0]), font, frc);
		bounds = layout.getBounds();
		this.chars = chars;
	}

	public double getStretchingCapacity() {
		return 0;
	}

	public double getWidth() {
		double width = bounds.getWidth();
		return width;
	}

	public double getAscent() {
		double ascent = -bounds.getY();
		return ascent;
	}

	public double getDescent() {
		double descent = bounds.getHeight() + bounds.getY();
		return descent;
	}

	public String toString() {
		return "Glyph(" + chars[0] + ")" + "[" + super.toString() + "]";
	}

	protected void doDraw(Graphics graph, double x, double y, double w) {
		graph.setFont(this.font);
		graph.drawChars(this.chars, 0, 1, (int) (x-bounds.getX()), (int) (y-bounds.getY()));
	}
}




