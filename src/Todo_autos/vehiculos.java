package Todo_autos;

public class vehiculos {
	public String placa;
	public String marca;
	public String modelo;
	public String color;
	public int tarifa_dia;
	public vehiculos(String placa, String marca, String modelo, String color, int tarifa_dia) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tarifa_dia = tarifa_dia;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getTarifa_dia() {
		return tarifa_dia;
	}
	public void setTarifa_dia(int tarifa_dia) {
		this.tarifa_dia = tarifa_dia;
	}
	
	
}
