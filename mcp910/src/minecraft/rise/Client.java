package rise;

import java.util.concurrent.CopyOnWriteArrayList;

import org.lwjgl.opengl.Display;

import rise.events.Event;
import rise.modules.Module;
import rise.modules.movement.Fly;
import rise.modules.movement.Sneak;
import rise.modules.movement.Sprint;
import rise.ui.HUD;

public class Client {
	
	public static String name = "Rise", version = "1";
	public static CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<Module>();
	public static HUD hud = new HUD();
	
	public static void startup(){
		System.out.println("Starting " + name + " -v " + version);
		Display.setTitle(name + " v" + version);
		
		modules.add(new Fly());
		modules.add(new Sprint());
		modules.add(new Sneak());
	}
	
	public static void onEvent(Event e){
		for(Module m : modules){
			if(!m.toggled)
				continue;
			
			m.onEvent(e);
		}
	}
	
	public static void keyPress(int key){
		for(Module m : modules){
			if(m.getKey() == key){
				 m.toggle();
			}
		}
	}

}
