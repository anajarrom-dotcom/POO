package Encapsulacion;

public class Libro {

	private String titulo;
	private String autor;
	private int pagina;
	
	public Libro(String titulo, String autor, int pagina) {
		this.titulo = titulo;
		this.autor = autor;
		this.pagina = pagina;
			
		}
	public boolean esLargo() {
		return pagina >= 300;
	}
	@Override
	public String toString() {
		return "Libro titulo=" + titulo + ", autor=" + autor + ", pagina=" + pagina ;
	}
	
	
}
