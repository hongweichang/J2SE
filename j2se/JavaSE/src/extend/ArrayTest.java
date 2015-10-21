package extend;

class Array {

	private int temp[] = null;
	private int foot = 0;

	public Array(int i) {
		if (i > 0) {
			this.temp = new int[i];
		} else {
			this.temp = new int[1];
		}
	}

	public boolean add(int i) {
		if (this.foot < this.temp.length) {
			this.temp[this.foot] = i;
			this.foot++;
			return true;
		} else {
			return false;
		}
	}

	public int[] getArray() {

		return this.temp;
	}

}

class SortArray extends Array{ //继承数组类
	
	public SortArray(int len){
		super(len);
	}
	public int[] getArray(){ //方法的覆写
		
		java.util.Arrays.sort(super.getArray()); //数组排序
		return super.getArray();
	}
}

class ReverseArray extends Array{ //数组翻转类
	
	public ReverseArray(int len){
		super(len);
	}
	public int[] getArray(){ //方法的覆写
		int count = super.getArray().length -1;
		int[] ra = new int[super.getArray().length];
		for (int i = 0; i < super.getArray().length; i++) {
			ra[count]=super.getArray()[i];
			count--;
		}
		return ra;
	}
}

public class ArrayTest {

	public static void main(String[] args) {
		ReverseArray array = new ReverseArray(4);
		System.out.println(array.add(12));
		System.out.println(array.add(33));
		System.out.println(array.add(2));
		System.out.println(array.add(222));
		for (int i : array.getArray()) {
			System.out.print(i + ",");
		}

	}
}
