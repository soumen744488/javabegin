class MethodOverLoadingImpl{
	float area;
	int side;
	float radius;
	int width;
	int height;
	/*MethodOverLoadingImpl(){
		System.out.println("Default Constructor Invoked");
	}
	MethodOverLoadingImpl(int height,int width){
		this.height = height;
		this.width = width;
		this.area = this.height*this.width;
	}
	MethodOverLoadingImpl(int side){
		this.side = side;
		this.area = this.side * this.side;
	}
	MethodOverLoadingImpl(float radius){
		this.radius = radius;
		this.area = 3.14f*this.radius*this.radius;
	}*/	
	int area(int side){
		this.side = side;
		return side*side;
	}
	/*float area(int side){
		this.side = side;
		return side*side;
	}*/ //error cannot write same parameter and different return type 
	float area(float radius){
		this.radius = radius;
		return 3.14f*radius*radius;
	}
	int area(int width,int height){
		this.width = width;
		this.height = height;
		return width*height;
	}
}
public class MethodOverloading{
	public static void main(String args[]){
		MethodOverLoadingImpl def = new MethodOverLoadingImpl();
		/*MethodOverLoadingImpl rect = new MethodOverLoadingImpl(5,15);
		MethodOverLoadingImpl sqr = new MethodOverLoadingImpl(5);
		MethodOverLoadingImpl cir = new MethodOverLoadingImpl(14.7f);
		System.out.println(rect.area);
		System.out.println(sqr.area);
		System.out.println(cir.area);*/
		System.out.println(def.area(5));
		System.out.println(def.area(7,5));
		System.out.println(def.area(7.5f));
	}
}