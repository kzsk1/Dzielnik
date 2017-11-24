import java.util.Scanner;

public class Dzielnik {
	public static void main (String[] args){
		
		System.out.println("Podaj wielkość tablicy: ");
		Scanner odczyt = new Scanner(System.in);
		int N = odczyt.nextInt();
		
		int tab[] = new int[N];
		
		for (int i=1; i<=N; i++) {
			if (i%3==0) {
				System.out.print(i+" podzielne przez: Trzy");
				if (i%3==0 && i%5==0){
					System.out.print(" Pięć");
				}
				if (i%3==0 && i%7==0){
					System.out.print(" Siedem");
				}
				i = i+1;
				System.out.print("\n");
			}
			if (i%5==0) {
				System.out.print(i+" podzielne przez: Pięć");
				if (i%5==0 && i%7==0){
					System.out.print(" Siedem");
				}
				System.out.print("\n");
			}
			if (i%7==0) {
				System.out.print(i+" podzielne przez: Siedem");
				System.out.print("\n");
			}

			if (i%3 !=0 && i%5 !=0 && i%7 !=0) {
				System.out.print(i+"\n");
			}
		}
	}

}
