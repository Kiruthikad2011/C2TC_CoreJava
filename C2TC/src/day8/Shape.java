package day8;

abstract class Shape {
	abstract void draw();
}
class Circle extends Shape {

	@Override
	void draw() {
		
			System.out.println("Draw the circle");
		
		
	}
}
	class Square extends Shape {

		@Override
		void draw() {
			System.out.println("Draw the square");
			
		}
	}
		class TestMain{
			public static void main(String[] args) {
				Shape S;
				S = new Circle();
				System.out.println ("S.draw()");
				S = new Square();
				System.out.println ("S.draw()");
			}
		}

