package SistemaBiblio;

public class Livro {
	private String  titulo;
	private String  autor;
	private int     anoPub;
	private String  categoria;
	private int     posE;
	private int     posP;
	private boolean disponivel;
	
	public Livro(String titulo, String autor, int anoPub, String categoria, int posE, int posP, boolean disponivel) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPub = anoPub;
		this.categoria = categoria;
		this.posE = posE;
		this.posP = posP;
		this.disponivel = disponivel;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPub() {
		return anoPub;
	}
	public void setAnoPub(int anoPub) {
		this.anoPub = anoPub;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getPosE() {
		return posE;
	}
	public void setPosE(int posE) {
		this.posE = posE;
	}
	public int getPosP() {
		return posP;
	}
	public void setPosP(int posP) {
		this.posP = posP;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public boolean emprestar() {
		if (disponivel) {
			disponivel = false;
			return true;  // deu certo o empréstimo
		}
		else {
			return false;
		}
	}
	
	public void devolver() {
		disponivel = true;
	}
	
	public String exibirInfoDoLivro() {
		String texto = "Titulo:"+titulo+"("+autor+") / "+anoPub + "\n"+
	                   "Categoria: "+categoria+"\n"+
				       "Localizacao: E:"+posE+"  P:"+posP+"\n"+
				       ((disponivel)?"DISPONIVEL":"EMPRESTADO");
	    return texto;
	}
}