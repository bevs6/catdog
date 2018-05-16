/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author procopiagarcias.
 */
public class Vehiculo {
    private String placa;
    private String marca;
    private float precio;

    public Vehiculo(String placa, String marca, float precio) {
        this.placa = placa;
        this.marca = marca;
        this.precio = precio;
    }

    public Vehiculo() {
        this.placa = null;
        this.marca = null;
        this.precio = 0.0f;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public float getPrecio() {
        return precio;
    }
    
       
    public void Encender(){
        System.out.println("Se encendió el vehiculo-\n"+this.Consultar());
    }

    public void Apagar(){
      System.out.println("Se apagó el vehiculo-\n"+this.Consultar());}
    
    public String Consultar(){
        return ("placa :"+this.placa+"\n marca:"+this.marca+"\n precio:"+this.precio);
    }
    
    
}
