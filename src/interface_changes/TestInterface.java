package interface_changes;


public class TestInterface {

	public static void main(String[] args) {

		// implementing FuncInterface abstract method here

		FuncInterface fun = (msg) -> {System.out.println("Hello " + msg); return "";};

		
		// old style anonymous inner implementation
		FuncInterface f = new FuncInterface() {

			@Override
			public String functionMessage(String msg) {
				System.out.println("Anonymous inner implementation ");
				return null;
			}
		};

		f.getMessage(" BuckEyes! ");
		
		f.functionMessage("");
		
		fun.functionMessage(" Wolverines! ");

	}





}
