/*
 * Laura Chevalier
 * Intro to Computer Science with Professor Versoza
 */
import processing.core.PApplet;
public class Bubble extends FishTank {
	//draws a bubble
	float vy = r.nextInt(2) + 2;
	float size = r.nextInt(50);
	float y = screenSize;
	
	public Bubble(PApplet p) {
		super(p);
		this._p = p;
	}
	
	@Override
	public void render() {
		//bubble draws itself
		_p.stroke(255);
		_p.fill(200, 200, 255, 100);
		_p.ellipse(x, y, size, size);
		_p.fill(255);
		_p.ellipse(x - size / 4, y - size / 4, size / 10, size / 10);
	}
	
	public void move() {
		//bubble moves vertically upward
		y -= vy;
		if (y + size / 2 <= 0) {
			y = screenSize + size;
		}
	}
}
