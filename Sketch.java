import processing.core.PApplet;

public class Sketch extends PApplet {
  // Declare Local Variables

  // Alien Variables
  float x = 100;
  float y = 100;
  float w = 60;
  float h = 60;
  float eyeSize = 18;
  float xspeed = 6;
  float yspeed = 3;

  // Ball Variables
  int a = 0;
  int speed = -2;

  public void settings() {
	// put your size call here
  size(400, 400);
  }

  public void setup() {
    background(0, 0, 0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */

  public void draw() {
   // Speed
  x = x + xspeed;
  y = y + yspeed;

  if ((x > width) || (x < 0)) {
    xspeed = xspeed * -1;
  }

  // Y-Movement of the Alien 
  if ((y > height) || (y < 0)) {
    yspeed = yspeed * -1;
  }

  background(224, 202, 200);  
  ellipseMode(CENTER);
  rectMode(CENTER); 

  // Alien's body
  stroke(5);
  fill(0, 55, 255);
  rect(x, y, w/6, h*2);

  // Alien's Head
  fill(0);
  ellipse(x, y-h/2, w, h); 

  // Alien's eyes
  fill(255, 25, 0); 
  ellipse(x-w/3+1, y-h/2, eyeSize, eyeSize*2); 
  ellipse(x+w/3-1, y-h/2, eyeSize, eyeSize*2);

  // Alien's legs
  stroke(10);
  line(x-w/12, y+h, x-w/4, y+h+10);
  line(x+w/12, y+h, x+w/4, y+h+10);

  // X-Movement of the ball
  a = a + speed;

  if ((x > width) || (x < 0)) {
    // If the object reaches either edge, multiply speed by -1 to turn it around.
    speed = speed * -1;
  }

  // Display circle at x location
  stroke(0);
  fill(175);
  ellipse(x,100,32,32);
}
}

      