public class EmpleadoContratista {
        private String nombre;
    private int horas;
    private double salario;
    private double costoProyecto;

    public EmpleadoContratista(String nombre, int horas, double salario, double costoProyecto) {
        this.nombre = nombre;
        this.horas = horas;
        this.salario = salario;
        this.costoProyecto = costoProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getCostoProyecto() {
        return costoProyecto;
    }

    public void setCostoProyecto(double costoProyecto) {
        this.costoProyecto = costoProyecto;
    }

    public double calcularPago()
    {
        return (double) ((this.salario * this.horas)+ this.costoProyecto);

    }
}
