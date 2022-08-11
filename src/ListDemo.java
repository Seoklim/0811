import java.util.Stack;
/*
 * Stack : Last Input First Out
 */
public class ListDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		String[] array = { "박지민", "홍지민", "홍지민", "홍지민", "홍지민", "홍지민" };
		for(String str : array) {
			stack.push(str);
		}
		System.out.println(stack.search("박지민"));
//		System.out.println(stack.pop()); //System.out.println(stack.size());
//		System.out.println(stack.pop()); //System.out.println(stack.size());
//		System.out.println(stack.pop()); //System.out.println(stack.size());
//		System.out.println(stack.pop()); //System.out.println(stack.size());
//		System.out.println(stack.pop()); //System.out.println(stack.size());
//		System.out.println(stack.pop()); //System.out.println(stack.size());
//		System.out.println(stack.pop()); //System.out.println(stack.size());
//		System.out.println(stack.pop()); //System.out.println(stack.size());
//		System.out.println(stack.pop()); //System.out.println(stack.size());
//		System.out.println(stack.pop()); //System.out.println(stack.size());
//		System.out.println(stack.pop()); //System.out.println(stack.size());
		
	}
}
