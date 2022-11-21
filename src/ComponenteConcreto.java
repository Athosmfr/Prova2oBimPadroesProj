
public class ComponenteConcreto implements IComponente {

	protected Produto prod;
	protected String nomeComp;
	protected double valorComp;
	
	public ComponenteConcreto(Produto prod) {
		this.prod = prod;
	}
	
	@Override
	public double calculaValorTotal() {
		return this.prod.valorTotal;
	}

	@Override
	public String escrita() {
		return prod.nome + "\n";
	}
	
}
