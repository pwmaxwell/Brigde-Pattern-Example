
public class Shirt extends ClothingType{
	public String type = "";
	public Shirt(ClothingColor newColor) {
		super(newColor);
		type = "Shirt";
	}
	@Override
	public void listClothingType() {
		System.out.println("The Clothing Type is " + type);
	}

}
