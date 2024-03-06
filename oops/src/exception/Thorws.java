package exception;
public class Thorws {
static void sha (int s)throws Exception{
	System.out.println(20/s);
}
public static void main(String[]args) {
	try {
	
		sha(10);
		sha(0);
	}
	catch (Exception e) {
		
		System.out.println("can't be  divided by zero");
	}
}
}

