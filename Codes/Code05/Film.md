import javax.sound.midi.VoiceStatus;

@SuppressWarnings("unused")
public class Films {
	
	// Variables
	private String name;
	private String director;
	private int copies;
	
	// Constructor
	public Films(String name, String director, int copies) {
		super();
		this.name = name;
		this.director = director;
		this.copies = copies;
		
	}
	
	// Empty Constructor
	public Films()
	{
		
	}

	// Getter
	public String getName() {
		return name;
	}

	public String getDirector() {
		return director;
	}


	public int getCopies() {
		return copies;
	}
	
	

	// function Set
	public void Set(String name,String director,int copies)
	{
		 this.name = name;
		 this.director = director;
		 this.copies=copies;

	}

	@Override
	public String toString() {
		return "Name:"+this.name+", Director:"+this.director+", Copies"+this.copies;
	}
	
	
	// function Print
	//public String Print()
	//{
		//return "Name:"+this.name+", Director:"+this.director+", Copies"+this.copies;
	//}
	
	// function Insert
	public String insert()
	{
		return "Name of Film"+getName();
	}
	
	// function Check
	public void check()
	{
		if (this.copies > 0) {
			
			System.out.println(this.copies);
		}
	}
	
	
	// function Remove
	public void remove()
	{
		this.copies --;
	}
	
	
	
	
	
	
	
}







