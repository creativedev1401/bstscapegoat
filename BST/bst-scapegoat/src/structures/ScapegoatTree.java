package structures;

import java.util.Iterator;

public class ScapegoatTree<T extends Comparable<T>> extends BinarySearchTree<T> {
  private int upperBound;


  @Override
  public void add(T t) {
    // TODO
	BSTNode<T> node = new BSTNode<T>(t, null, null);
	root = addToSubtree(root, node);
	upperBound += 1;
	if (height() > 3) {
		node = node.getParent();
		while (3*subtreeSize(node) <= 2*subtreeSize(node.getParent())) {
			node = node.getParent();
		}
		BSTNode<T> parent = node.getParent();
		BinarySearchTree<T> tempTree = new BinarySearchTree<T>();
		Iterator<T> iter = inorderIterator(node);
		while (iter.hasNext()) {
			tempTree.add(iter.next());
		}
		tempTree.balance();
		BSTNode<T> tempRoot = tempTree.getRoot();
		if (parent.getRight() == node) {
			parent.setRight(tempRoot);
		} else {
			parent.setLeft(tempRoot);
		}
	}
  }

  @Override
  public boolean remove(T element) {
    // TODO
	 if (super.remove(element)) {
		 if (2*size() < upperBound) {
			 this.balance();
			 upperBound = size();
		 }
		 return true;
	 }
    return false;
  }
}
