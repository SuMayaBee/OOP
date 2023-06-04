
public class AgeSearcher implements ISearcher{

	@Override
	public boolean checkCondition(Person p) {
		return p.age>18;
	}

}
