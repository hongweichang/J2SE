package Link;

class LinkedNode {

	private Node root;

	public void show() {

		this.root.show();

	}

	public boolean find(String name) {

		if (this.root != null) {
			return this.root.search(name);
		} else {
			return false;
		}

	}

	public void addNode(String name) {

		Node newNode = new Node(name);
		// System.out.println(this.root);
		if (root == null) {
			this.root = newNode;
		} else {
			this.root.addInNode(newNode);
		}

	}

	public void delete(String name) {
		if (this.find(name)) {
			if (this.root.name.equals(name)) {

				if (this.root.next != null) {
					this.root = this.root.next; // 改变根节点
				} else {
					this.root = null; // 取消根节点
				}

			} else {
				if (this.root.next != null) {
					this.root.next.deleteNode(root, name);
				}

			}

		}

	}

	class Node {

		String name;
		Node next;
		Node previous;

		public void addInNode(Node newNode) {
			// System.out.println(this.name);
			// System.out.println(this.next);
			// this会根据调用addInNode方法的对象不同而不同
			if (this.next == null) {
				this.setNext(newNode);
			} else {
				// 递归调用
				this.next.addInNode(newNode);
			}

		}

		public void show() {

			System.out.print(this.name + "--> ");
			if (this.next != null) {
				this.next.show();
			}
		}

		public void deleteNode(Node preNode, String name) {

			if (this.name.equals(name)) {

				preNode.setNext(this.next);

			} else {

				this.next.deleteNode(this, name);

			}
		}

		public boolean search(String name) {

			if (this.name.equals(name)) {
				return true;
			} else {
				// System.out.println(this.next);
				if (this.next != null) {
					return this.next.search(name);
				}
				return false;
			}

		}

		public boolean find(String name) {

			if (this.name.equals(name)) {
				return true;
			}
			if (this.next != null) {
				this.next.find(name);
			}
			return false;

		}

		public Node(String name) {

			this.name = name;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}

public class Link {

	public static void main(String[] args) {

		LinkedNode ln = new LinkedNode();
		ln.addNode("111");
		ln.addNode("222");
		ln.addNode("333");
		ln.addNode("444");
		ln.addNode("555");

		// ln.show();
		if (ln.find("4") == true) {
			System.out.println("ok it has ");
		} else {
			System.out.println("no ");
		}

		ln.delete("111");
		ln.show();
	}

}
