
public class Zoo {
	
	public static void main(String[] args) {
		
		Animal Spa1 = new Sparrow (1, "m", 5);
		//Spa1.move();
	
	
	Animal fish1= new Fish (1, "f", 3);
	//fish1.move();
	
	moveAnimals(fish1);
	
	moveAnimals(Spa1);
	
	}
	
	public static void moveAnimals(Animal animal) {
		animal.move();
	}
}