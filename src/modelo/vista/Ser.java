package modelo.vista;

public abstract class Ser {

	private String nombre;
	private int numeroIdentificacion; // es unico y no var�a
	private int esperanzaVida; // aleatorio
	private float necesidadVital;
	private int edad;

	public Ser(String nombre, int numeroIdentificacion, int esperanzaVida) {
		super();
		this.nombre = nombre;
		this.numeroIdentificacion = numeroIdentificacion;
		this.esperanzaVida = esperanzaVida;
		this.edad = 0;
	}

	public int getEsperanzaVida() {
		return esperanzaVida;
	}

	public void setEsperanzaVida(int esperanzaVida) {
		this.esperanzaVida = esperanzaVida;
	}

	public float getNecesidadVital() {
		return necesidadVital;
	}

	public void setNecesidadVital(float necesidadVital) {
		this.necesidadVital = necesidadVital;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public boolean morir() {
		return edad >= esperanzaVida;
		//en Estado si es true, se elimina de colecciones.
	}

}
