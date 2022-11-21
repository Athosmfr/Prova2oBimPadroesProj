
public class ComponenteConcreto implements IComponente {

	protected String nomeComp;
	protected double valorComp;
	
	public ComponenteConcreto(String nomeComp, double valorComp) {
		this.nomeComp = nomeComp;
		this.valorComp = valorComp;
	}
	
	@Override
	public double calculaValorTotal() {
		return this.valorComp;
	}
	
}
