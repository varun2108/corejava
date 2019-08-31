package strings;
import java.util.StringTokenizer;

public class TokensWithDelimiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String msg="http://10.123.43.67:80/";
			StringTokenizer st=new StringTokenizer(msg,"://.",false);
			while(st.hasMoreTokens()){
				System.out.println(st.nextToken());
			}
			String str = "http://10.123.43.67:80/"; 
	        String[] arr = str.split("//"); 
	        for(String token:arr){
	        	System.out.println(token);
	        }
	}

}
