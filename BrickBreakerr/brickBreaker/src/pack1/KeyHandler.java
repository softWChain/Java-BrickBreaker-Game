package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_W){
			Label.moveup = true;
		}
		else if(e.getKeyCode() == KeyEvent.VK_S){
			Label.movedown = true;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_W){
			Label.moveup = false;
		}
		else if(e.getKeyCode() == KeyEvent.VK_S){
			Label.movedown = false;
		}
		
		
	}
	@Override
	public void keyTyped(KeyEvent e) {}
}
