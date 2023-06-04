
public interface ISearcher {
	boolean checkCondition(Person p);
	default void print() {
		System.out.println("this is a default method");
	}
}
