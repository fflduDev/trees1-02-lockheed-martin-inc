package tree;
import java.util.ArrayList;

public class GenericTreeNode<E> {
	E data;
	ArrayList<GenericTreeNode<E>> children;
	public GenericTreeNode(E theItem) {
		data = theItem;
		children = new ArrayList<GenericTreeNode<E>>();
	}
	public void addChild(GenericTreeNode<E> theItem) {
		if (children == null) {
			children = new ArrayList<GenericTreeNode<E>>();
		}
		children.add(theItem);
	}
	public void removeChild(E theItem) {
	}
}