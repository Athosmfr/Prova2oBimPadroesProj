
public class CompressorDecorator extends ComponenteDecorator {
	
	public CompressorDecorator(IComponente wrap, String nomeComp) {
		super(wrap, nomeComp);
	}

	@Override
	public double calculaValorTotal() {
		return this.wrap.calculaValorTotal() + 793.00;
	}

	@Override
	public String escrita() {
		return this.wrap.escrita() + nomeComp + ", ";
	}
	
}
