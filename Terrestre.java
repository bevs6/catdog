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
public class Terrestre extends Vehiculo {

    int kmHoraMax;

    public Terrestre(int kmHoraMax, String placa, String marca, float precio) {
        super(placa, marca, precio);
        this.kmHoraMax = kmHoraMax;
    }

    public Terrestre() {
        super();
        this.kmHoraMax = 0;
    }
    
    public void registrar(){
        System.out.println("placa:"); 
    }

    public void setKmHoraMax(int kmHoraMax) {
        this.kmHoraMax = kmHoraMax;
    }
    
    

    @Override
    public void Encender() {
    System.out.println("Se encendió el vehiculo terrestre \n" + this.Consultar());
    }

    @Override
    public void Apagar() {
        System.out.println("Se apagó el vehiculo terrestre -\n" + this.Consultar());
    }

    @Override
    public String Consultar() {
        return (super.Consultar() + "\n kmHoraMax:" + this.kmHoraMax);
    }

}
