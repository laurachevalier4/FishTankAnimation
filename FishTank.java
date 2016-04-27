/*
 * Laura Chevalier
 * Intro to Computer Science with Professor Versoza
 */
import processing.core.PApplet;
import java.util.Random;
public class FishTank {
	//fish tank superclass
	PApplet _p;
	float x;
	float y;
	int red;
	int green;
	int blue;
	int size;
	Random r;
	int screenSize = 500;
	
	public FishTank() {
	}
	
	public void render() {
	}
	
	public FishTank(PApplet _p) {
		r = new Random();
		this.x = r.nextInt(screenSize);
		this.y = r.nextInt(screenSize);
		red = r.nextInt(255);
		green = r.nextInt(255);
		blue = r.nextInt(255);
		this.size = r.nextInt(20) + 20;
	}
}
