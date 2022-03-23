/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mateo
 */
public class Inventario {

    private String nombreProducto;
    private int tipoProducto;
    private int valorUnitario;
    private int nroUnidades;
    private int vlrIVA;

    public Inventario(String nombreProducto, int tipoProducto, int valorUnitario, int nroUnidades) {

        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
        this.valorUnitario = valorUnitario;
        this.nroUnidades = nroUnidades;

    }

    public double CalcularIVA() {
        
        int valorIva = 0;
        
        
         switch (this.tipoProducto) {
            case 0:
                valorIva = 19;
                break;
            case 1:
                    valorIva = 9;
                break;
            case 2:
                 valorIva = 15;
                break;
            case 3:
                 valorIva = 16;
                break;
            case 5:
                 valorIva = 10;
                break;
            default:

                  valorIva = 0;
                break;

        }


        return valorIva;
    }
    public double CalcularTotal() {
         double subtotal = valorUnitario*nroUnidades*CalcularIVA()/100;
         double total= (valorUnitario*nroUnidades) - subtotal ;
        return total;
    }

    public String GetNombre() {
        String nombre = this.nombreProducto;

        return nombre;

    }

    public String formatDecimal(float number) {
        float epsilon = 0.004f; // 4 tenths of a cent
        if (Math.abs(Math.round(number) - number) < epsilon) {
            return String.format("%10.0f", number); // sdb
        } else {
            return String.format("%10.2f", number); // dj_segfault
        }
    }

    public int GetUNDS() {
        int units = this.nroUnidades;

        return units;

    }

    public String GetVlrUNI() {
       String vlrUNI = formatDecimal(this.valorUnitario);

        return vlrUNI;

    }

    public String GetTipo() {
        String tipo = "ERROR";

        switch (this.tipoProducto) {
            case 0:
                tipo = "Aseo";
                break;
            case 1:
                tipo = "Papeleria";
                break;
            case 2:
                tipo = "Viveres";
                break;
            case 3:
                tipo = "Mascotas";
                break;
            case 5:
                tipo = "Otros";
                break;
            default:

                tipo = "ERROR";
                break;

        }

        return tipo;

    }

}
