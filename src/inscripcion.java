import java.util.ArrayList;
import java.util.List;

public class inscripcion {
    public String Fecha;
    private estado estado;
    private double progreso;
    private List<leccion> leccionesCompletadas;

    public inscripcion (String fecha) {
        this.Fecha = fecha;
        this.estado = estado.ACTIVA;
        this.progreso = 0.0;
        this.leccionesCompletadas = new ArrayList<>();
    
        }

}