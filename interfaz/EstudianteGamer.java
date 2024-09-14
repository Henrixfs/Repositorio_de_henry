package interfaz;

public class EstudianteGamer implements Persona{

    private String nombre;

    public EstudianteGamer(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mover() {
        System.out.println("Chavito se dirige a Lan Center");
    }

    @Override
    public void jugar() {
        System.out.println("cahvito juega Dota2");
    }

    @Override
    public void comer() {
        System.out.println("come comida");
    }

    @Override
    public String toString() {
        return "Nombre : " + nombre;
    }
}
