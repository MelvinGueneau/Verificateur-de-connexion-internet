package connexion_internet;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Connexion extends Thread{
	
	private int wait;
	private boolean internet;
	
	public Connexion(int wait) throws IOException {
		this.wait = wait;
	}
	
	@Override
	public void run() {
		boolean internet = true;
		while(internet == true) {
			 try {
		            URL url = new URL("http://www.google.com");
		            URLConnection connection = url.openConnection();
		            connection.connect();
		            System.out.println("Internet est connecté");
		        } catch (MalformedURLException e) {
		            System.out.println("Internet n'est pas connecté");
		            this.internet = false;
		        } catch (IOException e) {
		            System.out.println("Internet n'est pas connecté");
		            this.internet = false;
		        }
			 try {
				Thread.sleep(this.wait);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public boolean isInternet() {
		return internet;
	}

	public static void main(String[] srgs) throws IOException, InterruptedException {
		Connexion cx = new Connexion(10000);
		cx.start();
	}
}
