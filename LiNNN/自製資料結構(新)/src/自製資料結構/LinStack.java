package 自製資料結構;

import java.util.Comparator;
import java.util.Iterator;
import Exception.StackEmptyException;

public class LinStack<T> implements Iterable<T> {

	private Comparator<T> myComparator;
	private Object[] stack;
	private int index; // push陣列用
	private boolean turnToHead = true;
	private int firstIndex; // pop-頭
	private int lastIndex; // pop-尾

	public LinStack(Comparator<T> comparator) {
		myComparator = comparator;
		index = 0;
		firstIndex = 0;
		lastIndex = 0;
		stack = new Object[1000];
	}

	public void push(T t) {
		stack[index] = t;
		index++;
		lastIndex++;
		comparator(); // 排序用
	}

	public T pop() {

		T object;
		if (lastIndex - firstIndex == 0) {
			throw new StackEmptyException();
		}
		if (turnToHead) {
			object = (T) stack[firstIndex];
			firstIndex++;
		} else {
			object = (T) stack[--lastIndex];
		}

		turnToHead = !turnToHead;
		return object;
	}

	public void comparator() {
		for (int i = lastIndex - 1; i > 0; i--)
			for (int j = 0; j < i; j++)
				if (myComparator.compare((T) stack[i], (T) stack[j]) == 1) {
					T temp = (T) stack[i];
					stack[i] = (T) stack[j];
					stack[j] = temp;
				}
	}

	public LinStack<T> copy() {
		LinStack<T> linStack = new LinStack<T>(myComparator);
		linStack.stack = this.stack;
		linStack.firstIndex = this.firstIndex;
		linStack.lastIndex = this.lastIndex;
		return linStack;
	}

	public Iterator<T> iterator() {
		return new InnerIterator();
	}

	private class InnerIterator implements Iterator<T> {
		private LinStack<T> linStack;

		public InnerIterator() {
			linStack = LinStack.this.copy();
		}

		@Override
		public boolean hasNext() {
			return linStack.firstIndex < linStack.lastIndex;
		}

		@Override
		public T next() {
			return linStack.pop();
		}

	}

}
