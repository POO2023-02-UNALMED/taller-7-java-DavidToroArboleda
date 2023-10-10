package comunicacion;

import java.util.ArrayList;

public class Alfabeto extends Pictograma{

	private static String [] letras;
	private String interpretacion;
	
	
	public Alfabeto(String origen,String[] letras, String interpretacion) {
		super(origen);
		this.interpretacion = interpretacion;
		Alfabeto.letras = letras;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
	}
	
	public int cantidadLetras() {
		return letras.length;
	}

	
	
	//setters n getters


	public String getInterpretacion() {
		return interpretacion;
	}

	public static String[] getLetras() {
		return letras;
	}

	public static void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	
	
	
	
}
