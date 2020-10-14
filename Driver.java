//Author: Youssof Lee
public class Driver {

	public static void main(String [] arg) {
		//Fish actually is a data type
		//Fish nemo; == int x;
		//nemo adalah object, Fish adalah kelas
		Fish nemo = new Fish(); 
		nemo.Swim();
		//nemo.color = "red"; //tuka color
		nemo.SetColor("red");
		nemo.Swim();

		//nemo.Eat(); //superclass call subclass method - not possible



		Shark fiery = new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.SetSharpTeeth(130);
		fiery.Eat();

		// Fish dory = new Fish();
		// dory.Swim();
		// //dory.color = "yellow";
		// dory.SetColor("yellow");
		// dory.Swim();

		// Aquarium fancyAquarium = new Aquarium();
		// fancyAquarium.fillFish();

	}
}