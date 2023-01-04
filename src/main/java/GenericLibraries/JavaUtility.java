package GenericLibraries;

import java.util.Random;

public class JavaUtility {
	
	/*
	 *this method is used to get random number
	 */
	public int getrandomnum() {
		Random ran = new Random();
		 int random = ran.nextInt(1000);
		 return random;
	}

}
