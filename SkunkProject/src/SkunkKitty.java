import edu.princeton.cs.introcs.*;

public class SkunkKitty {
	
	private static int kitty = 0;

	public static int getKitty(){ 
		return kitty; 
	} 
	public static void setKitty(int value){
		kitty = kitty + value;
	}
	public static void resetKitty(){
		kitty = 0;
	}
	public static void main(String[] args)	{
		StdOut.println("hello");
	}
}