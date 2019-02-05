package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="dashboardMB")
@ViewScoped
public class DashboardMB implements Serializable{
	
	private static final long serialVersionUID = -4679206604759152170L;

	public String teste;
	
	
	public String getTeste() {
		return teste;
	}


	public void setTeste(String teste) {
		this.teste = teste;
	}


	@PostConstruct
	public void init() {
		
		//Rest call to get IBOV index.
		URL url;
		try {
			url = new URL("https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=^BVSP&interval=60min&apikey=53J8R4F8I788FSBG");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
	
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}
	
			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));
	
			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
				teste = output;
				//JSONO
			}
	
			conn.disconnect();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
