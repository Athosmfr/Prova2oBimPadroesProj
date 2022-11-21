
public class VentiladorDecorator extends ComponenteDecorator{

	public VentiladorDecorator(IComponente wrap, String nomeComp) {
		super(wrap, nomeComp);
	}

	@Override
	public double calculaValorTotal() {
		return this.wrap.calculaValorTotal() + 737.00;
	}

	@Override
	public String escrita() {
		return this.wrap.escrita() + nomeComp + ", ";
	}

}
