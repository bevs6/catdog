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
public class Motocicleta extends Terrestre {

    private String tipo;

    public Motocicleta(String tipo, int knHoraMax, String placa, String marca, float precio) {
        super(knHoraMax, placa, marca, precio);
        this.tipo = tipo;
    }

    public Motocicleta() {
        super();
        tipo = null;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    @Override
    public void Encender() {
        System.out.println("Se encendió el motocicleta -\n" + this.Consultar());
    }
   
    @Override
    public void Apagar() {
        System.out.println("Se apago el motocicleta -\n" + this.Consultar());
    }

    @Override
    public String Consultar() {
        return (super.Consultar() + "\n tipo:" + this.tipo);
    }
}
