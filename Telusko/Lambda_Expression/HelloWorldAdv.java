package Lambda_Expression;
@FunctionalInterface
interface B{
	public void methodB(int i);
}
class HelloWorldAdv
{
	public static void main(String[] args){
		// using lambda expression:
		// Here:
		// 1. anonymous class is created that implements the interface B.
		// 2. methodB() is overridden in the anonymous class.
		// 3. methodB() is called with the argument 5.
		B b = i -> System.out.println("in methodB: " + i); 
		b.methodB(5);
	}
}