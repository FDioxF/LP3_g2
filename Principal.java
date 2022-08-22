import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		int suma;
		int vida, rp=0;
		boolean fl=false;
		vida=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Numero?");
		vida = sc.nextInt();
		System.out.println("numeró ingresado: "+vida);
		System.out.println("Hola mundo");
		
		for (int i=1; i<=vida; i++)
			rp +=1;
		System.out.println("La suma es: "+ rp);
	}
}
