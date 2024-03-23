package _12_online_practice_quiz;

public class Test {
	int larger (int x, int y) {
		if(x>y) {
			return x;
		}
		else {
			return y;
		}
	}
	
	int dec(float x) {
		return (int)x;
	}
	
	public static void main(String[] args) {
		int x = 5;
		double y = 5.1;
		if(x<y) {
			x= (int) y;
		}
	}
}
