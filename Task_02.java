class Task_02 {
	public static void main(String[] args) {
		int summ = 40850;
		int cas1 = 1000;
		int cas2 = 500;
		int cas3 = 100;
		int cas4 = 50;

		int a = summ/cas1;
		int a2 = summ%cas1;
		System.out.println("1000 - " + a);
		
		int b = a2/cas2;
		int b2 = summ%cas2;
		System.out.println("500 - " + b);

		int c = b2/cas3;
		int c2 = summ%cas3;
		System.out.println("100 - " + c);

		int d = c2/cas4;
		int d2 = summ%cas4;
		System.out.println("50 - " + d);
	}
}