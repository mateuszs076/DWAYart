package serwer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.*;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Scanner;

import data.Coment;
import data.Picture;
import data.SuperUser;

public class TestClient {
	public static void main(String args[]) {
		try {
			int port = 752;
			
			Socket socket = new Socket("127.0.0.1", port);
			
			socket.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	public static String sha256(String base) {
	    try{
	        MessageDigest digest = MessageDigest.getInstance("SHA-256");
	        byte[] hash = digest.digest(base.getBytes("UTF-8"));
	        StringBuffer hexString = new StringBuffer();
	        for (int i = 0; i < hash.length; i++) {
	            String hex = Integer.toHexString(0xff & hash[i]);
	            if(hex.length() == 1) hexString.append('0');
	            hexString.append(hex);
	        }

	        return hexString.toString();
	    } catch(Exception ex){
	       throw new RuntimeException(ex);
	    }
	}
}