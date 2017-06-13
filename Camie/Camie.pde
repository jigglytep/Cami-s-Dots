void setup() {
  //size(500, 400);
  fullScreen();
  background(10, 80, 100);
  mouseX = -20;
  mouseY = -20;
}
float r = 0;
float g = 0;
float b = 0;


void draw(){
    stroke(255);
//float radX = lerp(1, 100, .3);
//float radY = lerp(1, 100, .3);
  fill(r, g, b);
  ellipse(mouseX, mouseY, 50, 50);
  
  r = random(0, 250);
  g = random(0, 250);
  b = random(0, 250);
  
  
}