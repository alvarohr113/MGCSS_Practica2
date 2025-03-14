package edu.uhu.monopoly;

public abstract class Cell {
	private String name;
	protected Player proprietary;
	private boolean available = true;

	public String getName() {
		return name;
	}

	public Player getOwner() {
		return proprietary;
	}
	
	public int getPrice() {
		return 0;
	}

	public abstract void playAction();

	void setName(String name) {
		this.name = name;
	}

	public void setOwner(Player owner) {
		this.proprietary = owner;
	}
    
    public String toString() {
        return name;
    }

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean availabl) {
		this.available = available;
	}
}
