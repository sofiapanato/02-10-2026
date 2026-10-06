public class Vehiculo {
    String color;
    String placa;
    int numeroPuertas;
    //metodo constructor SIN PARAMETROS
    public Vehiculo(){
        
    }
    //metodo constructor con parametros
    public Vehiculo(String color, String placa, int numeroPuertas){
        this.color = color;
        this.placa = placa;
        this.numeroPuertas = numeroPuertas;
    }
    //metodos getter
    public String getColor(){
        return color;
    }
    public String getPlaca(){
        return placa;
    }
    public int getNumeroPuertas(){
        return numeroPuertas;
    }
    //metodos setter
    public void setColor(String color){
        this.color = color;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setNumeroPuertas(int numeroPuertas){
        this.numeroPuertas = numeroPuertas;   
    }
    /*metodo toString*/
    @overwrite
    public String toString(){
        return "placa"+ getPlaca()+
                " color " +getColor()+
                " #Puertas " +getNumeroPuertas();
    }
}