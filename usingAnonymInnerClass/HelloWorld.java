package usingAnonymInnerClass;
@FunctionalInterface
interface A{
	public void methodA(int i);
}
class HelloWorld
{
	public static void main(String[] args){
		// using anonymous inner class:
		A a = new A(){
			@Override
			public void methodA(int i) {
				System.out.println("in methodA: " + i);
			}
		};
		a.methodA(5);
	}
}