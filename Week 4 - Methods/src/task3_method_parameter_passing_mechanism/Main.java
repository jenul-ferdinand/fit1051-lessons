package task3_method_parameter_passing_mechanism;

public class Main {
	private void callingMethod(){
		int n1, n2;

		n1 = 100;
		n2 = 200;

		System.out.println("n1 in callingMethod: " + n1);
		System.out.println("n2 in callingMethod: " + n2);

		calledMethod(n1,n2);
	}

	private void calledMethod(int n2, int n1){
		System.out.println("n1 in calledMethod: " + n1);
		System.out.println("n2 in calledMethod: " + n2);
	}

	public static void main(String[] args) {

		Main main = new Main();

		//call your method here
		main.callingMethod();
	}
}
