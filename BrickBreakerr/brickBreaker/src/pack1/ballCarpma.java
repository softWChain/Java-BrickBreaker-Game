package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class ballCarpma {
	
	Timer timer;
	
	public ballCarpma(){
	
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {

				if(Label.ballY +50 >= Label.sizeHeightScreenValue){
					Label.balldirY = -1;
				}
				
				if(Label.ballY <= 0){
					Label.balldirY = 1;
				}
				
				if(Label.ballX +20 >= Label.sizeWidthScreenValue){
					
					Label.ballX = Label.sizeWidthScreenValue /2 -10;
					Label.ballY = Label.sizeHeightScreenValue /2 -10;
					
					Label.balldirX = -1;
					Label.benimPuaným += 1;
					
				}
				
				if(Label.ballX <= 0){
					
					Label.ballX = Label.sizeWidthScreenValue /2 -10;
					Label.ballY = Label.sizeHeightScreenValue /2 -10;
					
					Label.balldirX = 1;
					Label.duþmanPuaný += 1;
					
				}
				
				if(Label.ballX < Label.bordX +25 && Label.ballX > Label.bordX && Label.ballY -20 < Label.bordY + 150 &&  Label.ballY > Label.bordY){
					Label.balldirX = 1;
				}
				
				if(Label.ballX < Label.duþmanX && Label.ballX > Label.duþmanX -20 && Label.ballY -20 < Label.duþmanY + 150 &&  Label.ballY > Label.duþmanY){
					Label.balldirX = -1;
				}
				
				
				
			}
		}, 0, 8);
		
	}

}
