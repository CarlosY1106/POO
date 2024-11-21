/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VentaVehiculos;

/**
 *
 * @author Carlitos Chávez.
 */
public class Carros extends VentaVehiculos {
    private Integer Puertas;
    private Integer Asientos;

    public Carros(Integer Puertas, Integer Asientos, String Motor, String Color, Integer Llantas) {
        super(Motor, Color, Llantas);
        this.Puertas = Puertas;
        this.Asientos = Asientos;
    }

    public Integer getPuertas() {
        return Puertas;
    }

    public void setPuertas(Integer Puertas) {
        this.Puertas = Puertas;
    }

    public Integer getAsientos() {
        return Asientos;
    }

    public void setAsientos(Integer Asientos) {
        this.Asientos = Asientos;
    }

}
