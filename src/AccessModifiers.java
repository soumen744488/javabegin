class ImplAccess{
	private int i = 20;
	private String name = "Gagandeep";
	
	public int getI(){
		return i;
	}
	public String getName(){
		return name;
	}
	public void setI(int i){
		this.i = i;
	}
	public void setName(String Name){
		this.name=name;
	}
}
public class AccessModifiers {
	public static void main(String args[]){
		ImplAccess obj = new ImplAccess();
		System.out.println("I is "+obj.getI());
		System.out.println("Name is "+obj.getName());
	}
}