package clases;



public class CapacidadEndeudamiento {
	
	private double ingretotales;
	private double gastosfijos;
	
	//Constructor con parámetros
	public CapacidadEndeudamiento(double ingretotales, double gastosfijos) {
		
		this.ingretotales = ingretotales;
		this.gastosfijos = gastosfijos;
	}

	public double getIngretotales() {
		return ingretotales;
	}

	public void setIngretotales(double ingretotales) {
		this.ingretotales = ingretotales;
	}

	public double getGastosfijos() {
		return gastosfijos;
	}

	public void setGastosfijos(double gastosfijos) {
		this.gastosfijos = gastosfijos;
	}
	
	//Calculo capacidad de endeudamiento
	public double calcularCapaEndeu() {
		double capaendeuda = (ingretotales - gastosfijos) * 0.35;
		return capaendeuda;
	}

}
