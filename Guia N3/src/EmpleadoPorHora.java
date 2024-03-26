public class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;
    public EmpleadoPorHora(String nombre, double salario,int horasTrabajadas) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }


    @Override
    public double calcularPago() {
        return (double) (this.horasTrabajadas * getSalario());
    }
}