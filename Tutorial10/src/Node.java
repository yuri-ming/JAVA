
public class Node {
	
	private int x;
	private int y;

	public int getX() {
		return x;
	}
	public void setX(int x) {
		// �����ִ� private x�� �Էµ� x�� �ٲ��ְڴ�!
		this.x =x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		// �����ִ� private y�� �Էµ� y�� �ٲ��ְڴ�!
		this.y =y;
	}
	
	
	//������ -> class�� ������ �̸��� ����, ��ü�� ���鶧 �ڵ����� ���� �ʱ�ȭ
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	//���1�� �ٸ� ����ϳ�(���2)�� �޾Ƽ� ���� ���߾Ӱ��� ��ȯ
	public Node getCenter(Node other) {
		return new Node((this.x + other.getX()) / 2,(this.y+other.getY())/2);
	}
}
