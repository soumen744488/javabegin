class ABC{
	int x = 5;
}
class InterfaceUse extends ABC implements MyInterface {
	public void func(){
		//var = 12;
		System.out.println(x*var);
	}
}
public class ImplInterface{
	public static void main(String args[]){
		InterfaceUse obj = new InterfaceUse();
		obj.func();
	}
}