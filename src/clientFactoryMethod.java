import java.io.*;

public class clientFactoryMethod {
	public static void main(String[] args) {
		int intNumberA = 0, intNumberB = 0;
		try {
			BufferedReader bufR = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("请输入数字A：");
			try {
				intNumberA = new Integer(bufR.readLine()).intValue();
			} catch (Exception e) {
				System.out.print(e);
				System.exit(0);
			}
			System.out.print("请输入数字B：");
			try {
				intNumberB = new Integer(bufR.readLine()).intValue();
			} catch (Exception e) {
				System.out.println(e);
				System.exit(0);
			}
			IFactory operFactory = new AddFactory();
			Operation oper = operFactory.CreateOperation();
			int result = oper.getResult(intNumberA, intNumberB);
			System.out.println("result = " + result);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
