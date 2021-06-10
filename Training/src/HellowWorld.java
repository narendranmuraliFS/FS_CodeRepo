
public class HellowWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "asasd";

		System.out.println("Hello World !!!");
		System.out.println("Total Command Line Arguments Received : " + args.length);
		System.out.println("Command Line Argument 1 : " + args[0]);
		System.out.println("Command Line Argument 2 : " + args[1]);
		System.out.println("Concating with WhitSpace: " + args[0] + " " + args[1]);
		System.out.println("Concating with plus icon : " + args[0] + args[1]);
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.print("Addition Operation : ");
		System.out.println(a + b);

		System.out.print("Multiplication Operation : ");
		System.out.println(a * b);
		System.out.print("Division with Quotient Operation : ");
		System.out.println(a / b);
		System.out.print("Division with Remainder Operation : ");
		System.out.println(a % b);

		String aaa = "test";
		String bbb = new String("leaf");
		String ccc;
		// aaa.length();

		int one = 10;
		int two = 20;
		String concat = aaa.concat(bbb);
		char charAt = aaa.charAt(0);
		System.out.println(aaa + bbb);

		if (true) {

		}

	}

}
