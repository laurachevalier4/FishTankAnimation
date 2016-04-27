/*
 * Laura Chevalier
 * Intro to Computer Science with Professor Versoza
 */
import processing.core.PApplet;
import java.util.ArrayList;
import java.util.Random;
public class MyAnimation extends PApplet {
	//animates a fish tank
	Random random = new Random();
	ArrayList<Bubble> bubbles = new ArrayList<>();
	ArrayList<Fish> fish = new ArrayList<>();
	ArrayList<Seaweed> seaweed = new ArrayList<>();
	FishTank fishTank = new FishTank();
	
	public static void main(String[] args) {
	PApplet.main("DrawTank");
	}
		
	public void setup() {
		size(500, 500);
		for (int i = 0; i < fish.size(); i++) {
			this.fish.get(i).render();
			this.fish.get(i).move();
		}
	}
	
	public void draw() {
		background(10, 10, 100);
		drawFish();
		drawBubble();
		drawSeaweed();
	}
	
	public void drawFish() {
		for (int i = 0; i < fish.size(); i++) {
			this.fish.get(i).render();
			this.fish.get(i).move();
		}
	}
	
	public void drawSeaweed() {
		for (int i = 0; i < seaweed.size(); i++) {
			this.seaweed.get(i).render();
			this.seaweed.get(i).move();
		}
	}
	
	public void drawBubble() {
		for (int i = 0; i < bubbles.size(); i++) {
			this.bubbles.get(i).render();
			this.bubbles.get(i).move();
		}
	}
	
	public void keyPressed() {
		//draw a fish for f, a bubble for b, seaweed for s
		if (key == 'f') {
			Fish f = new Fish(this);
			fish.add(f);
		} else if (key == 's') {
			Seaweed s = new Seaweed(this);
			seaweed.add(s);
		} else if (key == 'b') {
			Bubble b = new Bubble(this);
			bubbles.add(b);
		}
	}	
}
