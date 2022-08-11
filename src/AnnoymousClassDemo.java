
public class AnnoymousClassDemo {
	public static void main(String[] args) {
		Demo d = new Demo() {      //Demo자체를 재정의 : 익명객체
			@Override
			public void display() {
				System.out.println("나는 재정의된 메소드");
			}
			public void print() {       //원형인 Demo에 print()라는 메소드가 없어서 안뜬다. --> 원래있던 클래스에서 재정의만가능하고 새로운기능추가xx
				System.out.println("나는 새로운 메소드");
			}
		}; //매우 주의할것 ; 붙이기
		d.display();
//		d.print();  //재정의 하려는 클래스의 멤버가 아니기 때문에
		
	}
}

class Demo{    //상속은받기싫은데 메소드를 재정의하고싶을때 :익명
	public void display() {
		System.out.println("나는 원형 메소드");
	}
}