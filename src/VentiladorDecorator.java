
public class VentiladorDecorator extends ComponenteDecorator{

	public VentiladorDecorator(IComponente wrap) {
		super(wrap);
	}

	@Override
	public double calculaValorTotal() {
		return this.wrap.calculaValorTotal() + 737.00;
	}

}
