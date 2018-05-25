package pagefactory;

public class Conversion {

	public static void main(String[] args) {
		String str= "COSmo";
		
		for(int i=0; i>=str.length();i++)
		{
			System.out.println((char)(int)str.charAt(i)-56);
		}

	}

}
