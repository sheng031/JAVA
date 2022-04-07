// 계산기 객체 
public class Calculator {
	
	public void powerOn() {
		System.out.println("전원을 킵니다.");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public void divide(int x, int y) {
		double result = (double)x / (double)y;
		System.out.println(x + " + " + y + " = " + result);
	}
	
	public int plus(int x, int y) {
		int result = x * y;
		System.out.println(x + " * " + y + " = " + result);
		return result;
	}
	
	public void plus1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		System.out.println("입력한 수들의 합은 : " + sum);
	}
	
	// 메소드에서 다른 메소드 호출 plus호출>> return 받아와야함
	public void plusminus(int x, int y) {
		int result1 = plus(x, y);
		result1 = result1 -1;
		System.out.println(x + " + " + y + " - 1 = " + result1);
	}
	
	// 정사각형의 넓이를 구하는 메소드
	public void areaRectangle(double width) {
		System.out.println("정사각형의 넓이는 = " + width * width );
	}
	// 직사각형의 넓이를 구하는 메서드 
	public void areaRectangle(double width, double height) {
		System.out.println("정사각형의 넓이는 = " + width * height );
	}
}
