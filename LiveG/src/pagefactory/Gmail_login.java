package pagefactory;

public class Gmail_login {

	public static void main(String[] args) {

		Gmail g1=Gmail.Get_instance();
		Gmail g2= Gmail.Get_instance();
		g1.equals(g2);
		System.out.println(g1);

	}

}
