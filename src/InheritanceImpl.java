import java.util.Scanner;
class Father{
	private int money;
	Father(){
		System.out.println("Inside Father's Constructor");
	}
	public int getMoney(){
		return money;
	}
	public void setMoney(int money){
		this.money = money;
	}
	void setBalance(int money){
		this.money -= money;
	}
}
class Mother extends Father{
	private int paisa;
	Mother(){
		System.out.println("Inside Mother's Constructor");
	}
	public int getPaisa(){
		return paisa;
	}
	public void setPaisa(int paisa){
		if(getMoney()>paisa){
			this.paisa = paisa;
			setBalance(paisa);
		}
		else{
			System.out.println("Iss baar ke liye maaf kardo");
		}
		
	}
	void setBalanceM(int paisa){
		this.paisa -= paisa;
	}
}
class Child extends Mother{
	private int pocketMoney;
	Child(){
		System.out.println("Inside Child's Constructor");
	}
	public int getPocketMoney(){
		return pocketMoney;
	}
	public void setPocketMoney(int pocketMoney){
		if(getPaisa()>pocketMoney){
			this.pocketMoney = pocketMoney;
			setBalanceM(pocketMoney);
		}
		else{
			System.out.println("Bhaad me jao");
		}
	}
}
public class InheritanceImpl{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Child obj = new Child();
		System.out.println("Enter Dad's Salary");
		int n = sc.nextInt();
		obj.setMoney(n);
		System.out.println("Dad's Salary is "+obj.getMoney());
		System.out.println("Enter Mummy ka kharcha ");
		n = sc.nextInt();
		obj.setPaisa(n);
		System.out.println("Mummy ka khajana "+obj.getPaisa());
		System.out.println("Dad ka bacha kucha paisa "+obj.getMoney());
		System.out.println("Enter Child's Maang ");
		n = sc.nextInt();
		obj.setPocketMoney(n);
		System.out.println("Child ka Wallet Balance "+obj.getPocketMoney());
		System.out.println("Mummy ka Kajana "+obj.getPaisa());
	}
}