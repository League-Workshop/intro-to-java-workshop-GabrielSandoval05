
int horizontal = 390;
int vertical = 321;
int horizontal2 = 262;
int vertical2 = 329;
int acceleration= 5;
PImage catPic;
void setup (){
  size(600,600);
  catPic =
  loadImage("cat.jpg");
  catPic.resize(width,height);
  background(catPic);
  
}
void draw (){
  if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
noStroke();
ellipse(horizontal,vertical,70, 70);
ellipse(horizontal2,vertical2,70,70);
fill( 200,10,0);
}
  void keyPressed() {
    vertical+=2*acceleration;
    horizontal+=2*acceleration;
   
    
       horizontal++;
    vertical++;
    
     vertical2+=2*acceleration;
    horizontal2+=2*acceleration;
    
    horizontal2++;
    vertical2++;
    if(horizontal>width){
      horizontal=390;
      vertical=321;
      horizontal2=262;
      vertical2=329;
      background(catPic);
      acceleration=1;
      
      
    
      
  }


  }