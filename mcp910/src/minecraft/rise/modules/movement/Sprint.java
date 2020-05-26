package rise.modules.movement;

import org.lwjgl.input.Keyboard;

import rise.events.Event;
import rise.events.listeners.EventUpdate;
import rise.modules.Module;

public class Sprint extends Module{
	
	public Sprint(){
		super("Sprint", Keyboard.KEY_LSHIFT, Category.MOVEMENT);
	}
	
	public void onEnable(){
		
	}
	
	public void onDisable(){
		mc.thePlayer.setSprinting(false);
	}
	
	public void onEvent(Event e){
		if(e instanceof EventUpdate){
			if(e.isPre()){
				mc.thePlayer.setSprinting(true);
			}
		}
	}
	
}
