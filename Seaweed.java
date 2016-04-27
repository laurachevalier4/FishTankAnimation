/*
 * Laura Chevalier
 * Intro to Computer Science with Professor Versoza
 */
import processing.core.PApplet;
public class Seaweed extends FishTank {
	//draws seaweed
	double count = 0;
	float height = r.nextInt(100) + 50;
	double vy = .2;
	public Seaweed(PApplet p) {
		super(p);
		this._p = p;
	}
	
	@Override
	public void render() {
		//seaweed draws itself
		_p.stroke(0);
		y = screenSize;
		_p.fill(50, green + 100, 50);
		_p.ellipse(this.x, this.y, size, height);
		_p.fill(0, 0, 0, 100);
	}
	
	public void move() {
		//seaweed changes length to show movement
		this.height += vy;
		count += vy;
		if (count >= 25 || count <= 0) {
			vy *= -1;
		}
	}
}
