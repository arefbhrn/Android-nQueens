package co.arsatech.nqueens.nQueensGA;

//	This class is used to simulate the ability to pass arguments by reference in Java.
public final class RefObject<T> {
	public T value;

	public RefObject(T refArg) {
		value = refArg;
	}
}