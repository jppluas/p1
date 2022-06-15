package Modelo;

public class Personaje{

    private String nombre;
    private int puntosGanados;
    private boolean esPrincipal;

    public Personaje(String n){
        nombre=n;
    }
    public Personaje(String n, boolean princ){
        nombre=n;
        esPrincipal=princ;
    }

    public String getNombre(){
        return nombre;
    }
    public int getPuntosGanados(){
        return puntosGanados;
    }
    public boolean getEsPrincipal(){
        return esPrincipal;
    }

    public void setPuntosGanados(int puntos){
        puntosGanados = puntos;
    }

    public void mostrarInformacion(){
        System.out.println("Personaje"+"{nombre: "+nombre+ " esPrincipal: "+esPrincipal+" puntosGanados: "+puntosGanados+"}");
    }

    public int recolectar(Fruta f){
        if (esPrincipal){
            puntosGanados=f.getCalorias()*2;
        } else{
            puntosGanados=f.getCalorias();
        }
        return puntosGanados;
    }

}