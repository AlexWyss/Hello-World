package cs107;

public class Test {
public static void main(String[]args){
	String name = "test";
	if(args.length > 0){
		name = args[0];
	}
System.out.printf("Hello %s\n", name);
}

}
