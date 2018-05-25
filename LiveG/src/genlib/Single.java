package genlib;

public class Single {

	 
	
	static Single sl=new Single();
	
	private Single()
	{
		System.out.println("login to gmail");
	 }
	 public static Single getinstance()
	 {
		 return sl;
	 }
}
