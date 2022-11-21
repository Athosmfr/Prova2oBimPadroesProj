
public class PainelCtrlAnalogDecorator extends ComponenteDecorator {

	public PainelCtrlAnalogDecorator(IComponente wrap, String nomeComp) {
		super(wrap, nomeComp);
	}

	@Override
	public double calculaValorTotal() {
		return this.wrap.calculaValorTotal() + 667.00;
	}

	@Override
	public String escrita() {
		return this.wrap.escrita() + nomeComp + ", ";
	}

}
