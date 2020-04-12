
public class mainTest {
	public static void main(String[] args) {
		ClothingType testType1 = new Shirt(new Blue());
		ClothingType testType2 = new Pants(new Red());
		testType1.listClothingType();
		testType2.listClothingType();
	}
	
	
	//ClothingColor testColor1 = new Blue(new Pants(testColor1));
	
}
