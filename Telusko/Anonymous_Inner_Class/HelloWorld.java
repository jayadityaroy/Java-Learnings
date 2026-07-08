package Anonymous_Inner_Class;
@FunctionalInterface
interface A{
	public void methodA(int i);
}
class HelloWorld
{
	public static void main(String[] args){
		// using anonymous inner class:
		// Here:
		// 1. anonymous class is created that implements the interface A.
		// 2. methodA() is overridden in the anonymous class.
		// 3. methodA() is called with the argument 5.
		A a = new A(){
			@Override
			public void methodA(int i) {
				System.out.println("in methodA: " + i);
			}
		};
		a.methodA(5);
	}
}