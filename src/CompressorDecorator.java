
public class CompressorDecorator extends ComponenteDecorator {

	public CompressorDecorator(IComponente wrap) {
		super(wrap);
	}

	@Override
	public double calculaValorTotal() {
		return this.wrap.calculaValorTotal() + 793.00;
	}
	
}
