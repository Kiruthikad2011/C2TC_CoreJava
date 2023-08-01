package day5;

public class Multilevelinheritance {
	void happy() {
		System.out.println("Main layer");
}
}
class Multilevel1 extends Multilevelinheritance{
	void happier() {
		System.out.println("sublayer");
}
}
class Multilevel2 extends Multilevel1{
	void happiest() {
		System.out.println("subsublayer");
}
}
