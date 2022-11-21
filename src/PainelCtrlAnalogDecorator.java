
public class PainelCtrlAnalogDecorator extends ComponenteDecorator {

	public PainelCtrlAnalogDecorator(IComponente wrap) {
		super(wrap);
	}

	@Override
	public double calculaValorTotal() {
		return this.wrap.calculaValorTotal() + 667.00;
	}

}
