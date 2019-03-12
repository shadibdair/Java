
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Early Binding
		Car c=new Car();
		//Late Binding
		Lightable l1 = new Car();
		l1 = new Motor(); // Late Binding
		
		/*
		Lightable l1=new Lightable() {
			// we call all this anonymous object
			
			@Override
			public void ShutDownSwitch() {
				
			}
			
			@Override
			public void OpenSwitch() {
			
			}
			
			@Override
			public void IncreaseFreq() {
				
			}
		};*/
		
		
		//MoveOnWheels moveOnWheels=new MoveOnWheels() { // i cant do this because its abstruct class cant do instance
		//};
		MoveOnWheels mo=new Car(); // because i write extends to moveOnWheel... car means moveOnwheel and moveOnWheel mean car
		MoveOnWheels mo2=new Motor();
		
		mo.Rotet360();
		mo.Reverse();
		
		Object ob = new Car();
	    ((Car)ob).getColor();
		
		((Car)mo).getColor(); // to get the color we must do casting-down casting
		
		// c1 is as instance
		Car c1 = new Car();
		// access for instance variable
		c1.setColor("red");
		//c1.Move();
		//c1.ProductionYear=12;
		c1.OpenSwitch();
		
		Car c2=new Car();
		c2.setColor("green");
		c2.OpenSwitch();
		c2.ShutDownSwitch();
		
		Car c3=new Car();
		c3.setColor("yellow");
		c3.OpenSwitch();
		
		
		
		c1.PrintCarColor(); // red
		c2.PrintCarColor(); // green
		c3.PrintCarColor(); // yellow
		
		//access for class variable
		Car.NumberOfCars=9;
		
		System.out.print(Car.Brand);
		
		//Lightable.Frequency=23; // we can do this because its [final] its mean we can not give it new value
		System.out.print(Lightable.Frequency);
		
		
	}

}
