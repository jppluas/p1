import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.print("Ingrese el nombre del personaje principal: ");
        String nombrePrinc=entrada.nextLine();
        Modelo.Personaje p1 = new Modelo.Personaje(nombrePrinc,true);

        System.out.print("Ingrese el nombre del zorro: ");
        String nombreZorro=entrada.nextLine();
        Modelo.Personaje p2 = new Modelo.Personaje(nombreZorro);

        System.out.print("Ingrese el nombre de la fruta: ");
        String nombref1= entrada.nextLine();
        System.out.print("Ingrese las calorias de la fruta: ");
        int calf1= entrada.nextInt();
        Modelo.Fruta f1 = new Modelo.Fruta(nombref1,calf1);
        entrada.nextLine();

        System.out.print("Ingrese el nombre de la fruta: ");
        String nombref2= entrada.nextLine();
        System.out.print("Ingrese las calorias de la fruta: ");
        int calf2= entrada.nextInt();
        Modelo.Fruta f2 = new Modelo.Fruta(nombref2,calf2);

        p1.setPuntosGanados(p1.recolectar(f1));
        p2.setPuntosGanados(p2.recolectar(f2));

        p1.mostrarInformacion();
        p2.mostrarInformacion();
    }

}