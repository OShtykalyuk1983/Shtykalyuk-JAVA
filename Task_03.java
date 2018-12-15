class Task_03 {
	public static void main(String[] args) {
	int number = 233;

	/*116,5 - 1*/
	int a = number/2;
	int a1 = number%2;
	
	/*58 - 0*/
	int b = a/2;
	int b1 = a%2;

	/*29 - 0*/
	int c = b/2;
	int c1 = b%2;

	/*14,5 - 1*/
	int d = c/2;
	int d1 = c%2;
	
	/*7 - 0*/
	int e = d/2;
	int e1 = d%2;

	/*3,5 - 1*/
	int f = e/2;
	int f1 = e%2;

	/*1,5 - 1*/
	int g = f/2;
	int g1 = f%2;

	/*1*/
	int h = g/2;
	int h1= g%2;
	System.out.print(h1);
	System.out.print(g1);
	System.out.print(f1);
	System.out.print(e1);
	System.out.print(d1);
	System.out.print(c1);
	System.out.print(b1);
	System.out.print(a1);
	}
}