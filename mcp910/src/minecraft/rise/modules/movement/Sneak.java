package rise.modules.movement;

import org.lwjgl.input.Keyboard;

import rise.events.Event;
import rise.events.listeners.EventUpdate;
import rise.modules.Module;

public class Sneak extends Module{
    
    public Sneak(){
        super("Sneak", Keyboard.KEY_LCONTROL, Category.MOVEMENT);
    }
    
    public void onEnable(){
        mc.thePlayer.setSneaking(true);
    }
    
    public void onDisable(){
        mc.thePlayer.setSneaking(false);
    }
}
