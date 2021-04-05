
public class Node {
	
	private int x;
	private int y;

	public int getX() {
		return x;
	}
	public void setX(int x) {
		// 원래있던 private x를 입력된 x로 바꿔주겠다!
		this.x =x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		// 원래있던 private y를 입력된 y로 바꿔주겠다!
		this.y =y;
	}
	
	
	//생성자 -> class와 동일한 이름을 가짐, 객체를 만들때 자동으로 값을 초기화
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	//노드1과 다른 노드하나(노드2)를 받아서 둘의 정중앙값을 반환
	public Node getCenter(Node other) {
		return new Node((this.x + other.getX()) / 2,(this.y+other.getY())/2);
	}
}
