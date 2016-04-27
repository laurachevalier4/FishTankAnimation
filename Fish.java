/*
 * Laura Chevalier
 * Intro to Computer Science with Professor Versoza
 */
import processing.core.PApplet;
public class Fish extends FishTank {
	//draws fish
	float vx = r.nextInt(2) + 1;
	public Fish(PApplet p) {
		super(p);
		this._p = p;
	}
	
	@Override
	public void render() {
		//the fish draws itself
		_p.stroke(0);
		_p.fill(red, green, blue);
		//Fish body
		_p.ellipse(this.x, this.y, size * 2, size);
		//Fish tail
		//changes sides based on direction of swimming
		if (vx > 0) {
			_p.triangle(this.x - 3 * size / 2, this.y + size / 2, this.x - size, 
					this.y, this.x - 3 * size / 2, this.y - size / 2);
		} else if (vx < 0) { 
			_p.triangle(this.x + size * 3 / 2, this.y + size / 2, this.x + size, 
					this.y, this.x + size * 3 / 2, this.y - size / 2);
		}
		//fish eye (changes sides based on direction of swimming)
		_p.fill(0);
		if (vx < 0) {
			_p.ellipse(this.x - size / 2, this.y - size / 5, 4, 4);
		} else {
			_p.ellipse(this.x + size / 2, this.y - size / 5, 4, 4);
		}
	}
	
	public void move() {
		//fish moves horizontally, changes direction when it reaches edge
		this.x += vx;
		if (this.x >= _p.width || this.x <= 0) {
			vx *= -1;
		}
	}
}

