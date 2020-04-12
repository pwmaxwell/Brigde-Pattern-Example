
public class Pants extends ClothingType{
	public String type = "";
	public Pants(ClothingColor newColor) {
		super(newColor);
		type = "Pants";
	}
	@Override
	public void listClothingType() {
		System.out.println("The Clothing Type is " + type);
		
	}
}
