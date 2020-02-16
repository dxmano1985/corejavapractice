import java.net.URL;
import java.net.HttpURLConnection;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class JiraApiTest{

public static void main(String args[]){

String baseURL = "";
String loginURL = "auti/1/session";
String loginUserName = "";
String loginPassword = "";


String loginReponse = "";
URL url = null;
HttpURLConnection conn = null;
String input = "";
OutputStream os = null;
BufferedReader br = null;
String output = null;


try{
url = new URL(baseURL + loginURL);
conn = (HttpURLConnection)url.openConnection();

conn.setDoOutput(true);
conn.setRequestMethod("POST");
conn.setRequestProperty("Content-Type", "application/json");

input = "{\"username\":" + loginUserName + "\", \"password\":" + loginPassword + "\"}";

os = conn.getOutputStream();
os.write(input.getBytes());
os.flush();

String loginResponse = null;

if(conn.getResponseCode() == 200){
	br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	while((output = br.readLine()) != null){
		loginResponse += output;
	}
	conn.disconnect();
 
}
}catch(Exception e){

System.out.println(e.getMessage());
}

}
}