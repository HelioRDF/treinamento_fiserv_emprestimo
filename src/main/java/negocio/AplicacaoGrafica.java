package negocio;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.Cliente;

/**
 * @author fabricio.paixao
 */

public class AplicacaoGrafica {
	private static JPanel Painel = new JPanel();
	private static JFrame Formulario = new JFrame();

	public static void main(String[] args) {
		// --[ TERMINAR A EXECUCAO SE O FORMULARIO FOR FECHADO ]--\\
		Formulario.setDefaultCloseOperation(Formulario.EXIT_ON_CLOSE);

		// --[ SETA O TITULO DO FORMULARIO ]--\\
		Formulario.setTitle("Solicitar emprestimo V2");

		// --[ SETA O TAMANHO DO FORUMLARIO ]--\\
		Formulario.setSize(400, 200);

		// --[ CENTRALIZA O FORMULARIO ]--\\
		Formulario.setLocationRelativeTo(null);

		// --[ DESLIGANDO O GERENCIADOR DE LAYOUT ]--\\
		Painel.setLayout(null);

		// --[ ADICIONA O PAINEL AO FORMULARIO ]--\\
		Formulario.add(Painel);

		// --[ CRIANDO OS LABEL'S ]--\\
		JLabel LabelNome = new JLabel("Nome");
		JLabel LabelIdade = new JLabel("Idade");
		JLabel LabelValor = new JLabel("Valor");

//	        //--[ CRIA UMA BORDA NO JLABEL ]--\\
//	        Label3.setBorder( BorderFactory.createTitledBorder( "" ) ) ;
//	        
//	        //--[ SETA O ALINHAMENTO CENTRAL ]--\\
//	        Label3.setHorizontalAlignment( SwingConstants.CENTER );

		// --[ CRIANDO OS CAMPOS DE TEXTO ]--\\
		JTextField campoNome = new JTextField("");
		JTextField campoIdade = new JTextField("");
		JTextField campoValor = new JTextField("");

		// --[ CRIANDO O BOTAO ]--\\
		JButton Botao = new JButton("Solicitar");

		// --[ ADICIONANDO OS COMPONENTES NO PAINEL DO FORMULARIO ]--\\
		Adiciona(LabelNome, 10, 10, 70, 25);
		Adiciona(campoNome, 80, 10, 230, 25);

		Adiciona(LabelIdade, 10, 40, 70, 25);
		Adiciona(campoIdade, 80, 40, 230, 25);

		Adiciona(LabelValor, 10, 70, 70, 25);
		Adiciona(campoValor, 80, 70, 230, 25);

		Adiciona(Botao, 80, 100, 230, 25);

		String nome = campoNome.getText();

		Formulario.setVisible(true);
		Botao.addActionListener(e -> {
			consultar(campoNome.getText().toString(), Integer.parseInt(campoIdade.getText()),
					Integer.parseInt(campoValor.getText()), campoNome, campoIdade, campoValor);
		});
	}

	public static void consultar(String nome, int idade, int valor, JTextField campoNome, JTextField campoIdade,
			JTextField campoValor) {

		Cliente cliente = new Cliente(nome, idade, valor);
		System.out.println(cliente.toString());
		Validar validar = new Validar();
		String resposta = validar.aprovarEmprestimo(cliente).toUpperCase();

		JOptionPane.showMessageDialog(null, cliente.getNome() + ", o emprestimo foi " + resposta, "Informação",
				JOptionPane.INFORMATION_MESSAGE);

		campoNome.setText("");
		campoIdade.setText("");
		campoValor.setText("");
		;

	}

	// --[ FUNCAO PARA ADICIONAR COMPONENTES NO PAINEL DO FORMULARIO ]--\\
	private static void Adiciona(Component Componente, int nColuna, int nLinha, int nLargura, int nAltura) {
		// --[ ADICIONA O COMPONENTE NO PAINEL ]--\\
		Painel.add(Componente);

		// --[ SETA A POSICAO EXATA DO COMPONENTE ]--\\
		Componente.setBounds(nColuna, nLinha, nLargura, nAltura);
	}
}