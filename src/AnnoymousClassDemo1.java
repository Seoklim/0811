
public class AnnoymousClassDemo1 {
	public static void main(String[] args) {
		AnnoymousClassDemo1 acd = new AnnoymousClassDemo1();
//		acd.exec(acd.new MyPlus());
		//acd.exec(acd.new MyMultiple());
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {
				return a+b;
			}
			
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {
				return a*b;
			}
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {
				return a/b;
			}
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {
				return a-b;
			}
		});
	}
	
	
	
	void exec(MyInterface mi) {       //멤버 메소드
		int result = mi.calculate(5, 9);
		System.out.println("result = " + result);
	}
	
//	class MyMultiple implements MyInterface{
//		@Override
//		public int calculate(int front, int back) {
//			return front * back;
//	}
//	}
//	class MyPlus implements MyInterface{ //멤버 클래스
//		@Override
//		public int calculate(int front, int back) {
//			return front + back;
//		}
//	}
}



@FunctionalInterface //람다로 사용하려면 해당하는 인터페이스에는 메소드가 하나만있어야한다.
interface MyInterface{
	int calculate(int front, int back);    
}


