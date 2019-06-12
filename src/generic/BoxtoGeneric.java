package generic;

public class BoxtoGeneric<T> {
	private T obj;
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return this.obj;
	}
}
