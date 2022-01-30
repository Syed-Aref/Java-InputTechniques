package inputtchniques;

public class InputStreamReaderBufferedReader {
	/*
	public static void main(String[] args) {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		String s;
		try{
			s = br.readLine();
			System.out.println(s);
		}
		catch(Exception e) {
			
		}
		finally{
			r.close();
        		br.close();
		}
		
	}
	*/
	// Also
	/*
	public static void main(String[] args) throws Exception{
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		String s;
		s = br.readLine();
		System.out.println(s);
		r.close();
        	br.close();
	}
	*/
	// EOF
	/*
	public static void main(String[] args) {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
 
		String s;
		try{
			while( (s=br.readLine())!=null ) {
				System.out.println( s );
			}
		}
		catch(Exception e) {
 
		}
		finally{
			r.close();
        		br.close();
		}
 
	}
	
	*/
	
	

}
