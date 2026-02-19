import java.util.ArrayList;
import java.util.List;

public class plataforma {
	private String nombre;
	private List<curso> cursos;
	private List<usuario> usuarios;

	public plataforma(String nombre) {
		this.nombre = nombre;
		this.cursos = new ArrayList<>();
		this.usuarios = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<curso> getCursos() {
		return cursos;
	}

	public void agregarCurso(curso curso) {
		this.cursos.add(curso);
	}

	public List<usuario> getUsuarios() {
		return usuarios;
	}

	public void agregarUsuario(usuario usuario) {
		this.usuarios.add(usuario);
	}
}
