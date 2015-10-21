package Link;

class Node {

	String name;
	Node next;
	Node previous;

	public Node(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

}

public class LinkNode {

	public static void main(String[] args) {

		Node root = new Node("���ڵ�");
		Node n1 = new Node("��һ���ڵ�");
		Node n2 = new Node("�ڶ����ڵ�");
		Node n3 = new Node("�������ڵ�");

		root.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);

		LinkNode.print(root);
	}

	public static void print(Node node) {

		if (node != null) {
			System.out.print(node.getName() + " --> ");
		} else {
			System.out.print("End");
			return;
		}

		print(node.getNext());

	}

}
