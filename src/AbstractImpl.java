abstract class AbstractImpl{
	
	void driveBike(){
		System.out.printf("I know how to drive a bike");
	}
	
	abstract void driveCar();
	
}
abstract class Son extends Dad{
	void driveBike(){
		System.out.printf("I know to drive Super Bikes");
	}
    abstract void driveCar();
	
	/*void driveCar(){
		System.out.printf("Meroko aata hai car chalana");
	}*/
}
