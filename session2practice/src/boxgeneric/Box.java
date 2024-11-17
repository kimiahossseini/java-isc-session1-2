package boxgeneric;

public class Box<T> {
	private T item;
	
	public Box(T item) { //Generic can be used in method signature
	   this.item = item;
	}
	
	public T getItem() { //Generic can be used in return type
	   return item;
	}
	
	// Method to set a new item in the box
	public void setItem(T item) {
	   this.item = item;
	}

}
