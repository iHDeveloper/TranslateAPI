package net.herozpvp.translateapi.server;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.ServerSocket;

import net.herozpvp.translateapi.until.Settings;

public class Server {

	/*
	 * Server System : 
	 * 
	 * |>> On Accept:
	 * | 1- Add client with uuid
	 * */
	
	private static ServerSocket server;		//Host
	//private static ByteArrayOutputStream out;	//Send stream
	//private static ByteArrayInputStream in;	//Receive stream
	
	public static void run() throws IOException{
		server = new ServerSocket(Settings.getPort());
	}
	
}
