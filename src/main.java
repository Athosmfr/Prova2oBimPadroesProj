
public class main {

	public static void main(String[] args) {
		
		// Instanciando um novo Produto
		Produto teste1 = new Produto();
		
		// Passando o nome e o valor inicial caso necessario.
		teste1.nome = "HVAC - Arrefecimento e Compressor";
		teste1.valorTotal = 1;
		
		// Instanciando um Componente Concreto que sera a base da criação do Produto.
		ComponenteConcreto asb = new ComponenteConcreto(teste1);
		
		// Instanciando os decoradores (componentes).
		CompressorDecorator test = new CompressorDecorator(asb, "Compressor");
		sisArrefecimentoDecorator test2 = new sisArrefecimentoDecorator(test, "Sistema Arrefecimento");
		
		// Imprimindo a saida dos dados.
		System.out.println("Produto: " + test2.escrita() + "Valor Total: R$" + test2.calculaValorTotal() + "\n");
		
		
		// Exemplo 2
		
		Produto teste2 = new Produto();
		
		teste2.nome = "HVAC - Sistema Digital";
		
		ComponenteConcreto dig = new ComponenteConcreto(teste2);
		
		CompressorDecorator comp = new CompressorDecorator(dig, "Compressor");
		sisArrefecimentoDecorator sisa = new sisArrefecimentoDecorator(comp, "Sistema de arrefecimento");
		undCondensadoraDecorator unit = new undCondensadoraDecorator(sisa, "Unidade condensadora");
		VentiladorDecorator vent = new VentiladorDecorator(unit, "Ventilador");
		PainelCtrlDgtlDecorator dgt = new PainelCtrlDgtlDecorator(vent, "Painel controlador digital");
		
		// Imprimindo a saida dos dados.
		// Chamando o ultimo decorador instanciado pois sera o que tera armazenado os outros decoradores.
		System.out.println("Produto: " + dgt.escrita() + "Valor Total: R$" + dgt.calculaValorTotal());
		
		
		
	}
	
}
