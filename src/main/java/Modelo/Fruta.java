package Modelo;

public class Fruta{
    private String nombre;
    private int calorias;

    public Fruta(String n, int cal){
        nombre=n;
        calorias=cal;
    }
    public int getCalorias(){
        return calorias;
    }
}
