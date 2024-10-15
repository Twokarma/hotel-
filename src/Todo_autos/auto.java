package Todo_autos;

public class auto extends vehiculos {
	public int Capacidad;
	public String categoria;
	
	public auto(String placa, String marca, String modelo, String color, int tarifa_dia, int capacidad,String categoria) {
		super(placa, marca, modelo, color, tarifa_dia);
		this.Capacidad = capacidad;
		this.categoria = categoria;
	}
	public auto(String placa, String marca, String modelo, String color, int tarifa_dia) {
		super(placa, marca, modelo, color, tarifa_dia);
	}

	
	public int getCapacidad() {
		return Capacidad;
	}
	public void setCapacidad(int capacidad) {
		Capacidad = capacidad;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
