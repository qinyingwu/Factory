import java.io.*;

class clientSimpleFactory {
	public static void main(String[] args) {
		while(true) {
		int intNumberA = 0, intNumberB = 0;
		char[] operation1=new char[0];
		try {
			BufferedReader bufR = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("请输入数字A1：");
			try {
				intNumberA = new Integer(bufR.readLine()).intValue();
			} catch (Exception e) {
				System.out.println(e);
				System.exit(0);
			}
			System.out.print("请输入运算符：");
			try {
				operation1=bufR.readLine().toCharArray();
			} catch (Exception e) {
				System.out.println(e);
				System.exit(0);
			}
			System.out.print("请输入数字B1：");
			try {
				intNumberB = new Integer(bufR.readLine()).intValue();
			} catch (Exception e) {
				System.out.println(e);
				System.exit(0);
			}
			Operation oper = new OperationFactory().createOperate(operation1[0]);
			int result = oper.getResult(intNumberA, intNumberB);
			System.out.println("result = " + result);
		} catch (Exception e) {
			System.out.println(e);
		}
		}
	}
}