public class Main {
	public static void main(String[] args) {
		MathSheet mediana = new MathSheet();
		
		mediana.setNumber(1);
		mediana.setNumber(2);
		mediana.setNumber(4);
		mediana.setNumber(6);
		mediana.setNumber(9);
		
		System.out.println(mediana.calcMedian());
	}
}
