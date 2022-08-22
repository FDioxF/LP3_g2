import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		int vida, rp=0;
		vida=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Numero?");
		vida = sc.nextInt();
		System.out.println("numeró ingresado: "+vida);
		System.out.println("Hola mundo");
		
		for (int i=1; i<=vida; i++)
			rp +=1;
		System.out.println("La suma es: "+ rp);
		
		for (int i=1; i<=12; i++)
		System.out.println(vida + " x " + i + " = " + (vida*i));
	}
}
