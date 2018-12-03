import java.awt.Font;

public class Test {
	static void test1() {
	    Font f = new Font("SansSerif", Font.PLAIN, 70);
	    Glyph g = new Glyph(f, 'g');
	    System.out.println(g);
	}
	static void test2() {
	    Font f = new Font("SansSerif", Font.PLAIN, 70);
	    Glyph g = new Glyph(f, 'g');
	    System.out.println(g);
	    new Page(g, 150, 150);
	}
	static void test4() {
		Font f = new Font("SansSerif", Font.PLAIN, 70);
		Space E1 = new Space(1,1);
		Space E2 = new FixedSpace(5);
		Space E3 = new RelativeSpace(1.1, f);
		System.out.println(E1);
		System.out.println(E2);
		System.out.println(E3);
	}
	static void test5() {
		Font f = new Font("SansSerif", Font.PLAIN, 70);
		Space E1 = new Space(1,1);
		Space E2 = new FixedSpace(5);
		Space E3 = new RelativeSpace(1.1, f);
		Group gr = new Group();
		gr.add(E1);
		gr.add(E2);
		gr.add(E3);
		System.out.println(gr);
	}
}