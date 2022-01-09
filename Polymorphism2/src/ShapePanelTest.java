public class ShapePanelTest {
	 public static void main(String[] args) {
	        ShapePanel panel = new ShapePanel(); //ShapePanel 클래스에서 변수 panel 생성
	        panel.add(new Rectangle(20,20,3,4)); //Rectangle 객체 추가
	        panel.add(new Circle(10,10,10)); //Circle 객체 추가
	        panel.display(); //추가된 객체 출력하기
	        panel.add(new Rectangle(10,10,2,3)); //Rectangle 객체 추가
	        panel.add(new Rectangle(20,20,3,4)); //이미 배열에 추가된 객체와 동일한 객체 추가
	        panel.display(); //동일한 객체는 추가되지 않으므로 동일한 객체는 1번만 출력됨
	        panel.add(new Circle(100,100,2)); //Circle 객체 추가
	        panel.add(new Circle(10,10,10)); //이미 배열에 추가된 객체와 동일한 객체 추가
	        panel.delete(new Circle(10,10,10)); //Circle 객체 삭제
	        panel.display(); //삭제된 객체와 추가된 객체, 그리고 중복된 값이 추가 안되었는지 확인하기 위해 출력
	    }
}
