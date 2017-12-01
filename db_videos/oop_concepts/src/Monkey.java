public class Monkey implements Living {
    
    private String name;
	private double weight;
	private String sound;
	private double speed;
	private String favFood;
	private double height;
	
	@Override
	public void setName(String newName) {
		name = newName;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setWeight(double newWeight) {
		// TODO Auto-generated method stub
        weight = newWeight;		
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	@Override
	public void setSound(String newSound) {
		// TODO Auto-generated method stub
		sound = newSound;
	}

	@Override
	public String getSound() {
		// TODO Auto-generated method stub
		return sound;
	}
	
	@Override
	public void setSpeed(double newSpeed)
	{
	    speed = newSpeed;
	}

    @Override
	public double getSpeed()
	{
	    return 0;
	}
		
	@Override
	public void setFavFood(String newFavFood) {
		favFood = newFavFood;
		
	}

	@Override
	public String getFavFood() {
		// TODO Auto-generated method stub
		return favFood;
	}
		
	@Override
	public void setHeight(double newHeight) {
		height = newHeight;
		
	}

	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return height;
	}
    
}