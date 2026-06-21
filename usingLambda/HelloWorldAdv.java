package usingLambda;
@FunctionalInterface
interface B{
	public void methodB(int i);
}
class HelloWorldAdv
{
	public static void main(String[] args){
		// using lambda expression:
		B b = i -> System.out.println("in methodB: " + i);
		b.methodB(5);
	}
}