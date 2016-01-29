package java8homework;

@FunctionalInterface
public interface PasswordEncoder {
	public String Encode(String passord, String salt);
	//public String encodename();
	public default void encode(){
		System.out.println("This ist he first part");
	}

}
