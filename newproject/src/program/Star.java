package program;

import org.testng.annotations.Test;

public class Star {
	
	@Test
	public void star(){
	for (int i=1; i<=4;i++){
		
		for(int j=1; j<=i;j++){
			
			System.out.print("*");
			
		}
		System.out.println("");
	}

   }
	}
