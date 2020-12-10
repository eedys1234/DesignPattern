package Command;

@FunctionalInterface
public interface UserInterface<T> {
	public void apply(T ...input);
	
}
