
public class StringIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "helloWorld";
		  int index = str.indexOf( "World" );
			if( index != -1 ){
				
				str  = str.substring(index);
				
			}
				System.out.println(str);
			
			
	}

}
