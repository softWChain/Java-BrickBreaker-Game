package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class duþmanMovement {
	
	Timer timer;
	
	public duþmanMovement(){
		
		timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if(Label.ballX >= Label.sizeWidthScreenValue /2 -10){
					
				if(Label.ballY == Label.duþmanY){
					
				}else if (Label.ballY > Label.duþmanY + 75) {
					
					if (Label.duþmanY <= Label.sizeHeightScreenValue - 200) {
						Label.duþmanY += 2;
					}
					
				

				} else if (Label.ballY < Label.duþmanY + 75) {
					
					if (Label.duþmanY >= 20) {
						Label.duþmanY -= 2;
					}

				} 
				}
				
			}
		}, 0, 6);
		
	}

}
