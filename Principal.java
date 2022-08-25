import java.util.Scanner;

public class Principal {

    public static String elegir(int vida) {
        String gift = "";
        switch (vida) {
            case 1:
                gift = "Un pasaje al caribe";
                break;
            case 2:
                gift = "Una visita al museo más cercano a tu casa";
                break;
            case 3:
                gift = "Unsa entrada al cine";
                break;
        }
        return gift;
    }

    public static void main(String[] args) {
        int vida, rp = 0;
        boolean fl = false;
        vida = 0;
        Scanner sc = new Scanner(System.in);
        do {
            vida++;
            System.out.println("Vida:" + vida + "\t¿Cual es el número secreto?");
            rp = sc.nextInt();
            if (rp == 1234)
                fl = true;
        } while (vida < 3 && !fl);
        if (fl == true) {
            System.out.println("Adivinaste!!!!!");
            System.out.println("Ganaste!!!!");
            System.out.println(elegir(vida));
            elegir(vida);
        } else
            System.out.println("ups, perdiste...");
    }
}