package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class du�manMovement {
	
	Timer timer;
	
	public du�manMovement(){
		
		timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if(Label.ballX >= Label.sizeWidthScreenValue /2 -10){
					
				if(Label.ballY == Label.du�manY){
					
				}else if (Label.ballY > Label.du�manY + 75) {
					
					if (Label.du�manY <= Label.sizeHeightScreenValue - 200) {
						Label.du�manY += 2;
					}
					
				

				} else if (Label.ballY < Label.du�manY + 75) {
					
					if (Label.du�manY >= 20) {
						Label.du�manY -= 2;
					}

				} 
				}
				
			}
		}, 0, 6);
		
	}

}
