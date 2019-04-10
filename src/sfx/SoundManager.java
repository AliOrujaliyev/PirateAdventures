package sfx;

import java.util.ArrayList;

public abstract class SoundManager {

	public static ArrayList<Sound> sounds = new ArrayList<Sound>();
	
	public SoundManager() {
		
		sounds = new ArrayList<Sound>();
		
	}
	
	public abstract void initAllSounds();
	
	public void addSound( Sound sound ) {
		
		sounds.add(sound);
		
	}
	
	public void removeSound( Sound sound ) {
		
		sounds.remove(sound);
		
	}


	public static void playSound( String name ) {
		
		for( Sound s : sounds ) {
			if(s.name.equals(name)) {
				s.play();
			}
		}
	}
	

	public static void loopSound( String name ) {
		
		for( Sound s : sounds ) {
			if(s.name.equals(name)) {
				s.loop();
			}
		}
	}
	

	public static void stopSound( String name ) {
		
		for( Sound s : sounds ) {
			if(s.name.equals(name)) {
				s.stop();
			}
		}
	}

	public void stopAllSounds( ) {
		
		for( Sound s : sounds ) {
				s.stop();
		}
	}
}