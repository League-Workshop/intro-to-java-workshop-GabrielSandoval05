package section2;

import org.jointheleague.graphical.robot.Robot;

public class DrawSquare {
	public static void main(String[] args) {
		Robot hi= new Robot();
		hi.setX(300);
		hi.setY(300);
		hi.penDown();
		hi.miniaturize();
		hi.setRandomPenColor();
		hi.setSpeed(50);
		for(int i=0;i<4;i++) {
		hi.move(200);
		hi.turn(90);
		hi.setRandomPenColor();
		}
		hi.sparkle();
		hi.penUp();
		
	}

}
