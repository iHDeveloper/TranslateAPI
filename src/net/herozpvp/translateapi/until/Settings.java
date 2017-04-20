package net.herozpvp.translateapi.until;

public class Settings {

	/*		Default Settings	*/
	private final static int DEFAULT_PORT = 25075;
	
	
	private static int port = -1; // -1 = not found
	
	public static void loadDefault(){
		loadFromConfig(); //Load config
		if(port == -1) port = DEFAULT_PORT;
		
	}
	
	public static void loadFromConfig(){
		// TODO load from config
	}
	
	public static int getPort(){
		return port;
	}
	
}
