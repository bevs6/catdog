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
public class PickUp  extends Terrestre {
   private  float capacidadCarga;

    public PickUp(float capacidadCarga, int kmHoraMax, String placa, String marca, float precio) {
        super(kmHoraMax, placa, marca, precio);
        this.capacidadCarga = capacidadCarga;
    }
    public PickUp(){
    super();
    this.capacidadCarga = 0.0f;
    
    }

    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

  
    
    
    @Override 
    public void Encender(){
    System.out.println("Se encendió la pich up-\n"+this.Consultar());
    }
   @Override
    public void Apagar(){
    System.out.println("Se apagó la pick up-\n"+this.Consultar());
    }
    @Override
    public String Consultar(){
    return(super.Consultar()+"\n capacidad carga:"+this.capacidadCarga);
    }
}
