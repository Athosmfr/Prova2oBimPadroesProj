
public class sisArrefecimentoDecorator extends ComponenteDecorator{

	public sisArrefecimentoDecorator(IComponente wrap, String nomeComp) {
		super(wrap, nomeComp);
	}

	@Override
	public double calculaValorTotal() {
		return this.wrap.calculaValorTotal() + 846.00;
	}

	@Override
	public String escrita() {
		return this.wrap.escrita() + nomeComp + ", ";
	}

}
