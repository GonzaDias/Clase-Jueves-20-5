package ejemplo1;

public class Auto
{
    private String color;
    private int velocidad;
    private int modelo;
    private String marca;
    
    public Auto(String color, int velocidad, int modelo, String marca){
        this.color = color;
        this.velocidad = velocidad;
        this.modelo = modelo;
        this.marca = marca;
    }
    
    public String getMostrarDatos(){
        return "El color del auto es:"+color+"la velocidad es:"+velocidad+"el modelo es:"+ modelo+"y la marca es:"+marca;
    }
    
    public void setVelocidad(){
        velocidad = velocidad + 10;
        System.out.println(velocidad);
    }
}
