int x =15;
void setup() {
  size(800, 200);
}
void draw() {
  background(#F2909F);
  fill(#90DEF2);
  ellipse(x,100,100,100);
  if (mousePressed){
   x = x+30;
  }
  if (x > 800){
    playSound();
  }
}
 import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding.wav");
        sound.trigger();
        soundPlayed = true;
    }
    }