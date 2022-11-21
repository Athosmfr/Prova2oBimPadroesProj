
public class main {

	public static void main(String[] args) {
		
		Produto teste1 = new Produto();
		
		teste1.nome = "HVAC - Compressor";
		
		teste1.valorTotal = 1;
		
		ComponenteConcreto asb = new ComponenteConcreto(teste1);
		
		CompressorDecorator test = new CompressorDecorator(asb, "Compressor");
		sisArrefecimentoDecorator test2 = new sisArrefecimentoDecorator(test, "Sistema Arrefecimento");
		
		System.out.println("Produto: " + test2.escrita() + test2.calculaValorTotal() + "Reais");
		
//		CompressorDecorator test = new CompressorDecorator();
		
	}
	
}
