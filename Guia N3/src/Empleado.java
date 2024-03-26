import javax.print.attribute.standard.PrinterInfo;

public abstract class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public abstract double calcularPago();


public void mostrarEmpleado()
    {
        System.out.println("NOMBRE: " + this.nombre);
        System.out.println("SALARIO: " + this.salario);

    }

}