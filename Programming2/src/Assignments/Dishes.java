package Assignments;

public class Dishes {
    private String name;
    private String type;
    private int quantity;
    private double price;
    private String description;

    public Dishes(String name, String type, int quantity, double price, String description) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + "," + type + "," + quantity + "," + price + "," + description;
    }

	public void add(Dishes dish) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setQuantity(double newWeight) {
		// TODO Auto-generated method stub
		
	}

	public String getQuantity() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getType() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getImagePath() {
		// TODO Auto-generated method stub
		return null;
	}
}