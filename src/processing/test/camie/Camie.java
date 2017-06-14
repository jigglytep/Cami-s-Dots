package processing.test.camie;

import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Camie extends PApplet {

public void setup() {
  //size(500, 400);
  
  background(10, 80, 100);
  mouseX = -20;
  mouseY = -20;
}
float r = 0;
float g = 0;
float b = 0;


public void draw(){
    stroke(255);
//float radX = lerp(1, 100, .3);
//float radY = lerp(1, 100, .3);
if(pmouseX != mouseX){
  noStroke();
  fill(r, g, b);
  ellipse(mouseX, mouseY, 50, 50);
  
  r = random(0, 250);
  g = random(0, 250);
  b = random(0, 250);
}else{
  noStroke();
  fill(13, 34, 250);
  ellipse(mouseX, mouseY, 50, 50);
} 
  
}
  public void settings() {  fullScreen(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Camie" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
