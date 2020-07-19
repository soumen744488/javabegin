class UsingThis{
	private int num,pow;
	
	void setNum(int num){
		this.num = num;
	}
	void setPow(int pow){
		this.pow = pow;
	}
	int getNum(){
		return num;
	}
	int getPow(){
		return pow;
	}
	
}
public class ThisKeyword{
	public static void main(String args[]){
		UsingThis obj = new UsingThis();
		obj.setNum(5);
		obj.setPow(2);
		System.out.println(obj.getNum());
		System.out.println(obj.getPow());
	}
}