
public class PainelCtrlDgtlDecorator extends ComponenteDecorator {

	public PainelCtrlDgtlDecorator(IComponente wrap) {
		super(wrap);
	}

	@Override
	public double calculaValorTotal() {
		return this.wrap.calculaValorTotal() + 1206.00;
	}

}
