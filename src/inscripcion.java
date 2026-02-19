import java.util.ArrayList;
import java.util.List;

public class inscripcion {
    private String fecha;
    private estado estado;
    private double progreso;
    private List<leccion> leccionesCompletadas;

    public inscripcion(String fecha) {
        this.fecha = fecha;
        this.estado = estado.ACTIVA;
        this.progreso = 0.0;
        this.leccionesCompletadas = new ArrayList<>();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public estado getEstado() {
        return estado;
    }

    public void setEstado(estado estado) {
        this.estado = estado;
    }

    public double getProgreso() {
        return progreso;
    }

    public void setProgreso(double progreso) {
        this.progreso = progreso;
    }

    public List<leccion> getLeccionesCompletadas() {
        return leccionesCompletadas;
    }

    public void agregarLeccionCompletada(leccion leccion) {
        this.leccionesCompletadas.add(leccion);
    }
}