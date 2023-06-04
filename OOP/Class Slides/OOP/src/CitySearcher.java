
public class CitySearcher implements ISearcher {
	@Override
	public boolean checkCondition(Person p) {
		return p.city=="dhaka";
	}
}
