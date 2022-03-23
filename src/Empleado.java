/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mateo
 */
public class Empleado {

    private String identificacion;
    private String nombre;
    private int edad;
    private boolean jornada;
    private int antiguedad;
    private int dctoTienda;
    private int dctoRecreacion;

    public Empleado(String nombre, int edad, String identificacion, boolean jornada, int antiguedad) {

        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.jornada = jornada;
        this.antiguedad = antiguedad;
        CalcularDescuentos();

    }

    public String GetNombre() {
        String nombre = this.nombre;

        return nombre;

    }

    public String GetID() {
        String ID = this.identificacion;

        return ID;

    }

    public String GetJornada() {
        String Jornada = "ERROR";
        if (this.jornada == true) {
            Jornada = "Diurna";
        } else {
            Jornada = "Nocturna";
        }
        return Jornada;

    }

    public String GetEdad() {
        String Edad = Integer.toString(this.edad) + " Años";

        return Edad;

    }

    public void CalcularDescuentos() {

        if (antiguedad < 1) {
            dctoTienda = 15;
            dctoRecreacion = 20;
        } else if (antiguedad >= 1 && antiguedad < 6) {
            dctoTienda = 30;
            dctoRecreacion = 30;
        } else if (antiguedad >= 6) {
            dctoTienda = 50;
            dctoRecreacion = 60;

        }

    }

    public String GetAntiguedad() {
        String Antiguedad = Integer.toString(this.antiguedad) + " Año(s)";

        return Antiguedad;

    }

    public String GetDctoTienda() {
        String dctoTienda = Integer.toString(this.dctoTienda) + "%";

        return dctoTienda;

    }

    public String GetDctoRecreacion() {
        String dctoRecre = Integer.toString(this.dctoRecreacion) + "%";

        return dctoRecre;

    }
}
