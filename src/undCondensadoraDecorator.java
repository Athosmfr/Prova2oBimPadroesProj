
public class undCondensadoraDecorator extends ComponenteDecorator{

	public undCondensadoraDecorator(IComponente wrap, String nomeComp) {
		super(wrap, nomeComp);
	}

	@Override
	public double calculaValorTotal() {
		return this.wrap.calculaValorTotal() + 297.00;
	}

	@Override
	public String escrita() {
		return this.wrap.escrita() + nomeComp + ", ";
	}

}
