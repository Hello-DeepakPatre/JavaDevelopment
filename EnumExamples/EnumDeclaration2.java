class TestColor2 {
	public static void main(String[] args) {
		enum Color {
			Blue, Yello, Red, Green, Black, White, Purple, DarkRed;
		}
		Color c1 = Color.Blue;
		System.out.println(c1);//Print name of the constant.
	}
}
//We can declare enum either inside class or outside of the class but not inside of the methods. If we are trying to declare inside a method we will get compile time error saying. CTE: enum types must not be local
