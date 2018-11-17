PImage creeper;
PImage minecraft;
int X=100;
int Y=100;
void setup(){
size(900, 980);
 minecraft = loadImage("123.jpg");     //in setup method
minecraft.resize(width, height);          //in setup method
background(minecraft); 
creeper=loadImage("Creeper.png");
}



void draw(){
  background(minecraft); 
image(creeper,X, Y);
creeper.resize(20, 30); 




if(isNear(mouseX,X)==true){
fill(#06B718);
ellipse(15,15,15,15);
delay(500);
X=X+10;
Y=Y+50;
if(X>500){
X=15;
}
if(Y>500){
X=15;
}

}
else{
fill(#DE020A);
ellipse(15,15,15,15);

}
}
boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     
     return true;
else
     return false;
}