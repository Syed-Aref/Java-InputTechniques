package inputtchniques;


public class InputFileSplit{
	public static void main(String[]args)
	{
		String str="687 1234 -4785";
	    String[] ar=str.split(" ");
	    long[] arr = new long[ar.length];
	    for(int i=0;i<ar.length;i++)
	    {
	    	arr[i] = Long.parseLong(ar[i]);
	    	System.out.println( arr[i] );
	    }
	    
	}
}