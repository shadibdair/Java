Question 2
```
Shop.java


public class Shop {

	// Variables
	private String name;
	private float banana;
	private float apple;
	private float orange;
	//--------------------------------------
	//áðàé ùî÷áì ëàøâåîðè àú ëì äðúåðéí òáåø ëì äùãåú äôøèééí åîàúçì àú äùãåú ùì äîçì÷ä áäúàí
	public Shop(String name, float banana, float apple, float orange) {
		this.name = name;
		this.banana = banana;
		this.apple = apple;
		this.orange = orange;
	}
	//--------------------------------------
	// Getter & Setter
	
	//--------------------------------------
	//áðàé ùìà î÷áì ùåí òøê
	public Shop()
	{
		name=null;
		banana= 0;
		apple= 0;
		orange= 0;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBanana() {
		return banana;
	}

	public void setBanana(float banana) {
		this.banana = banana;
	}

	public float getApple() {
		return apple;
	}

	public void setApple(float apple) {
		this.apple = apple;
	}

	public float getOrange() {
		return orange;
	}

	public void setOrange(float orange) {
		this.orange = orange;
	}

	//--------------------------------------
	public void SetData(String name, float apple, float banana, float orange)
	{
		this.name=name;
		this.banana=banana;
		this.apple=apple;
		this.orange=orange;
		
	}
	
	public String toString() {
		return "[Name: "+this.name+" ,Banana: "+this.banana + " ,Apple:"+this.apple+" ,Orange:"+this.orange +"]";
	}
	
	public static void cheapest(Shop[] shopArr,int banana,int orange,int apple)
	{
		int max =0;
		int sum=0;
		int index=0;
		
		for (int i = 0; i < shopArr.length; i++) {
			sum += (shopArr[i].apple)*apple + (shopArr[i].banana)*banana + (shopArr[i].orange)*orange;
			
			if(sum>max)
			{
				max=sum;
				index=i;
			}
		}
		System.out.println("Cheapest shop: "+ shopArr[index].getName()+" Price: "+max);
	}
	
}
```

