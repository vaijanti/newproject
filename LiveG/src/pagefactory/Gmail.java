package pagefactory;

public class Gmail {
static Gmail g= null;
private Gmail()
{
	
}
	public static  Gmail Get_instance(){
		if(g==null)
		{
			g= new Gmail();
		}
		return g;
	}
}
