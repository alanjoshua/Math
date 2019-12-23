package Math;

public class Vector {
	
	private float[] data;
	private int size;
	
	public int getSize() {
		return size;
	}
	
	public Vector(float[] data) {
			this.data = data;
			this.size = data.length;
	}
	
	public Vector(int size) {
		this.size = size;
		data = new float[size];
		for(int i = 0;i < size; i++) {
			data[i] = 0;
		}
	}
	
	public Vector(int size, float val) {
		this.size = size;
		data = new float[size];
		for(int i = 0;i < size; i++) {
			data[i] = val;
		}
	}
	
	public Vector add(Vector v) {
		float[] res;
		if(getSize() == v.getSize()) {
			res = new float[getSize()];
			for(int i = 0;i < v.getSize();i++) {
				res[i] = v.getData()[i] + this.getData()[i];
			}
			return new Vector(res);
		}
		else {
			System.err.println("The vectors dont match in size. Returning same vector");
			return new Vector(getData());
		}
		
	}
	
	public static Vector add(Vector u,Vector v) {
		float[] res;
		if(u.getSize() == v.getSize()) {
			res = new float[u.getSize()];
			for(int i = 0;i < v.getSize();i++) {
				res[i] = v.getData()[i] + u.getData()[i];
			}
			return new Vector(res);
		}
		else {
			System.err.println("The vectors dont match in size. Returning same vector");
			return new Vector(u.getData());
		}
		
	}
	
	public Vector sub(Vector v) {
		float[] res;
		if(getSize() == v.getSize()) {
			res = new float[getSize()];
			for(int i = 0;i < v.getSize();i++) {
				res[i] = v.getData()[i] - this.getData()[i];
			}
			return new Vector(res);
		}
		else {
			System.err.println("The vectors dont match in size. Returning same vector");
			return new Vector(getData());
		}
		
	}
	
	public static Vector sub(Vector u,Vector v) {
		float[] res;
		if(u.getSize() == v.getSize()) {
			res = new float[u.getSize()];
			for(int i = 0;i < v.getSize();i++) {
				res[i] = v.getData()[i] - u.getData()[i];
			}
			return new Vector(res);
		}
		else {
			System.err.println("The vectors dont match in size. Returning same vector");
			return new Vector(u.getData());
		}
		
	}
	
	public Vector mul(Vector v) {
		float[] res;
		if(getSize() == v.getSize()) {
			res = new float[getSize()];
			for(int i = 0;i < v.getSize();i++) {
				res[i] = v.getData()[i] * this.getData()[i];
			}
			return new Vector(res);
		}
		else {
			System.err.println("The vectors dont match in size. Returning same vector");
			return new Vector(getData());
		}
		
	}
	
	public static Vector mul(Vector u,Vector v) {
		float[] res;
		if(u.getSize() == v.getSize()) {
			res = new float[u.getSize()];
			for(int i = 0;i < v.getSize();i++) {
				res[i] = v.getData()[i] * u.getData()[i];
			}
			return new Vector(res);
		}
		else {
			System.err.println("The vectors dont match in size. Returning same vector");
			return new Vector(u.getData());
		}
		
	}
	
	public Vector divide(Vector v) {
		float[] res;
		if(getSize() == v.getSize()) {
			res = new float[getSize()];
			for(int i = 0;i < v.getSize();i++) {
				res[i] = v.getData()[i] + this.getData()[i];
			}
			return new Vector(res);
		}
		else {
			System.err.println("The vectors dont match in size. Returning same vector");
			return new Vector(getData());
		}
		
	}
	
	public static Vector divide(Vector u,Vector v) {
		float[] res;
		if(u.getSize() == v.getSize()) {
			res = new float[u.getSize()];
			for(int i = 0;i < v.getSize();i++) {
				res[i] = v.getData()[i] / u.getData()[i];
			}
			return new Vector(res);
		}
		else {
			System.err.println("The vectors dont match in size. Returning same vector");
			return new Vector(u.getData());
		}
		
	}
	
	public Vector scalarAdd(float v) {
		float[] res;
		
			res = new float[getSize()];
			for(int i = 0;i < getSize();i++) {
				res[i] = getData()[i] + v;
			}
			return new Vector(res);
		
	}
	
	public static Vector scalarAdd(Vector v,float x) {
		float[] res;
		
			res = new float[v.getSize()];
			for(int i = 0;i < v.getSize();i++) {
				res[i] = v.getData()[i] + x;
			}
			return new Vector(res);
		
	}
	
	public Vector scalarMul(float v) {
		float[] res;
		
			res = new float[getSize()];
			for(int i = 0;i < getSize();i++) {
				res[i] = getData()[i] * v;
			}
			return new Vector(res);
		
	}
	
	public static Vector scalarMul(Vector v,float x) {
		float[] res;
		
			res = new float[v.getSize()];
			for(int i = 0;i < v.getSize();i++) {
				res[i] = v.getData()[i] * x;
			}
			return new Vector(res);
		
	}


	
	public float[] getData() {
		return data;
	}
	
	public void setData(float[] data) {
		this.data = data;
		this.size = data.length;
	}
	
	public float dot(Vector v) {
		float res = 0;
		if(size == v.getSize()) {
			for(int i = 0;i < v.getSize();i++) {
				res += v.getData()[i] * this.getData()[i];
			}
			return res;
		}
		else {
			System.err.println("The vectors dont match in size. Returning 0");
			return 0f;
		}
	}
	
	public static float dot(Vector u,Vector v) {
		float res = 0;
		if(u.getSize() == v.getSize()) {
			for(int i = 0;i < v.getSize();i++) {
				res += v.getData()[i] * u.getData()[i];
			}
			return res;
		}
		else {
			System.err.println("The vectors dont match in size. Returning 0");
			return 0f;
		}
	}
	
	public void display() {
		for(int  i = 0;i < getSize();i++) {
			System.out.println(getData()[i]);
		}
	}
	
	public static void display(Vector v) {
		for(int  i = 0;i < v.getSize();i++) {
			System.out.println(v.getData()[i]);
		}
	}
	
}
