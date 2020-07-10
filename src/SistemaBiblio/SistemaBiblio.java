package SistemaBiblio;
import javax.swing.JOptionPane;

/* Objetivo 
 * 
 *  A Classe SistemaBiblio tem por objetivo fazer a interação com o usuário (seja através de
 *  Scanner/println ou mesmo JOPtionPane), de modo que a classe Livro não tenha nenhuma emissão de
 *  mensagem ou leitura de teclado, tornado-a mais isolada possível da lógica do usuário
 *  
 *  
 *  USUARIO <--> SISTEMABIBLIO <--> LIVRO
 *  
 *  Versao 1 - Interação com o usuário através de Scanner (leitura) + System.out.println (exibição dos dados)
 *  Versao 2 - Interação com o usuário através de Interface Gráfica (JOptionPane)
 */


//import java.util.Scanner;

public class SistemaBiblio {

	public static void main(String[] args) {
		
		//Scanner teclado = new Scanner(System.in);
		int numLivro;
		Livro acervo[];   // aqui eu declaro uma lista de livros / um conjunto de livros / um array de livros
		// qual o tamanho deste conjunto?
		
		acervo = new Livro[10]; // isso aqui equivale a ter criado 10 variáveis do tipo Livro
		acervo[0] = new Livro("Java Basico", "Isidro", 2020, "Terror", 1, 1, true);
		acervo[1] = new Livro("Java Intermediario", "Isidro", 2020, "Terror Master", 1, 2, true);
		acervo[2] = new Livro("Bancos de Dados", "Jose", 2020, "Desenvolvimento", 2, 1, true);
		acervo[3] = new Livro("Desenvolvimento Web", "Pedro", 2019, "Desenvolvimento", 2, 2, true);
		acervo[4] = new Livro("Redes", "Tanembaum", 2000, "Infra", 3,1, true);
		acervo[5] = new Livro("Sistemas Operacionais", "Silberchatz", 2000, "Infra", 3,1, true);
		acervo[6] = new Livro("Inteligencia Artificial", "Charles", 2000, "Conceitos", 4,1, true);
		acervo[7] = new Livro("Compiladores", "Aho", 1978, "Conceito", 5,1, true);
		acervo[8] = new Livro("Algoritmos", "Cormen	", 1990, "Fundamentos", 6,1, true);
		acervo[9] = new Livro("Estruturas de Dados", "Tenembaum", 1980, "Fundmamentos", 6,2, true);
		
		do {
			//System.out.println("Qual livro? (0-9)");
			//numLivro = teclado.nextInt();
			String texto = JOptionPane.showInputDialog("Qual Livro (0-9)?");
			numLivro = Integer.parseInt(texto);
			if (numLivro < -1 || numLivro >= 10) {
				//System.out.println("Opcao Invalida!");
				JOptionPane.showMessageDialog(null, "Opcao Invalida!");
				continue;
			}
			if (numLivro == -1) {
				break;
			}
			
			boolean deuCerto = acervo[numLivro].emprestar();
			if (deuCerto) {
				JOptionPane.showMessageDialog(null, "Emprestimo Efetuado Com sucesso");
				JOptionPane.showMessageDialog(null, acervo[numLivro].exibirInfoDoLivro());
				//System.out.println("Emprestimo Efetuado com sucesso");
				//System.out.println(acervo[numLivro].exibirInfoDoLivro());
			}
			else {
				JOptionPane.showMessageDialog(null, "Lamento, mas o livro "+acervo[numLivro].getTitulo()+" está indisponível" );
				//System.out.println("Lamento, mas o livro "+acervo[numLivro].getTitulo()+" está indisponível");
			}
			
		} while (numLivro != -1);

	}

}