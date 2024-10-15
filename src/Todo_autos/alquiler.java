package Todo_autos;

public class alquiler {
	public String nombre;
	public int celular;
	public String usuario;
	public String fecha_inico;
	public String fecha_fin;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getFecha_inico() {
		return fecha_inico;
	}
	public void setFecha_inico(String fecha_inico) {
		this.fecha_inico = fecha_inico;
	}
	public String getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public alquiler(String nombre, int celular, String usuario, String fecha_inico, String fecha_fin) {
		super();
		this.nombre = nombre;
		this.celular = celular;
		this.usuario = usuario;
		this.fecha_inico = fecha_inico;
		this.fecha_fin = fecha_fin;
	}
	
	
	
	
}
