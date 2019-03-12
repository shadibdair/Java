
public class Car extends MoveOnWheels implements Lightable{
	
	// instance variables
		public int ModelNumber;
		public String Name;
		public String Manufactor;
		private String Color;
		
		// getter & setter
		public String getColor() {
			return Color;
		}
		public void setColor(String color) {
			if(color=="red")
			{
				this.Color="fire";
			}
			else {
				this.Color=color;
			}
			
		}
		
		// class variable
		public static int NumberOfCars;

		public static String Brand="BMW";
		
		// default constructor
		public Car()
		{
			
		}
		
		public void PrintCarColor()
		{
			System.out.println(this.Color);
		}
		
		
		// implementation the function in Lightable 
		@Override
		public void OpenSwitch() {
			System.out.println("WeWe");
		}
		@Override
		public void ShutDownSwitch() {
			
			System.out.println("toto");
		}
		@Override
		public void IncreaseFreq() {

		}
		@Override
		public void Reverse() {
			System.out.println("Reverse methods in car");
		
		}
		
		/*@Override
		public void Rotet360()
		{
			System.out.println("Rote360 Method in car");
		}*/

}
