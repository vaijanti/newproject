package program;

public class Encapmain {
	
	public static void main(String []args){
		
		encapsu en= new encapsu();
		en.setId(101);
		en.setAge(250);
		en.setname("ranu");
		System.out.println("emp id is :" +en.getId());
		System.out.println("emp age is:"+en.getAge());
		System.out.println("emp name is:"+en.getname());
	}

}
