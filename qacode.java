package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;

public class qacode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		URL url = new URL("https://restcountries.eu/rest/v2/all");
		
		String query = ("united");
		
		//make connection
		URLConnection urlc = url.openConnection();
		
		//use post mode
		urlc.setDoOutput(true);
		urlc.setAllowUserInteraction(false);
		
		//send query
		PrintStream ps = new PrintStream(urlc.getOutputStream());
		ps.print(query);
		ps.close();
		
		//get results
		BufferedReader br = new BufferedReader(new InputStreamReader(urlc.getInputStream()));
		String s = null;
		while ((s = br.readLine())!=null)
		{
			System.out.println(s);
		}
		br.close();	
	
	}

}
