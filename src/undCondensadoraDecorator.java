
public class undCondensadoraDecorator extends ComponenteDecorator{

	public undCondensadoraDecorator(IComponente wrap) {
		super(wrap);
	}

	@Override
	public double calculaValorTotal() {
		return this.wrap.calculaValorTotal() + 297.00;
	}

}
