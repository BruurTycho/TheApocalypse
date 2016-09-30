package engineTest;

import org.lwjgl.opengl.Display;

import renderEngine.DisplayManager;

public class TestEngine {
	
	public static void main(String[] args) {
		DisplayManager.createDisplay();
		
		while(!Display.isCloseRequested()) {
			// hier is de game stuff
			
			DisplayManager.updateDisplay();
		}
		
		DisplayManager.closeDisplay();
	}
	
	

}
