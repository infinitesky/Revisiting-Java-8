package interface_changes;

@FunctionalInterface
public interface FuncInterface {

	String functionMessage(String msg);
	
	default String getMessage(String message) {
		System.out.println("Hello "  + message);
		return "Hello "  + message;
	}
	
	/*
	 * static String formatMessage(String message) { System.out.println(
	 * "********Hello " + message + " **********"); return "********Hello " +
	 * message + " **********"; }
	 */
	
}
