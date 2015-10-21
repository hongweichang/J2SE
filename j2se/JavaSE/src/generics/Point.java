package generics;

public class Point<T > {//泛型类型的extends 上限是Number 直接已知子类： 
	//AtomicInteger, AtomicLong, BigDecimal, BigInteger, Byte, Double, Float, Integer, Long, Short
	T x;
	T y;
	/*public Point(T x,T y){
		this.setX(x);
		this.setY(y);
	}*/
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}

}
