package genlib;



public class Stringmanupulation {

	public static void main(String[] args) {
		
		
	/*	String str= "hello";
		StringBuilder tu= new StringBuilder(str);
		tu.reverse();
		System.out.println(tu);    */
		
		
		int num=256  ;
		int rev=0;
		while(num!=0){
			rev = rev*10 +num%10;
			num=num/10;
			System.out.println(rev);
					
			
			
		}
	}
}
		    
