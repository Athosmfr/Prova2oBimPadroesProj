
public class sisArrefecimentoDecorator extends ComponenteDecorator{

	public sisArrefecimentoDecorator(IComponente wrap) {
		super(wrap);
	}

	@Override
	public double calculaValorTotal() {
		return this.wrap.calculaValorTotal() + 846.00;
	}

}
