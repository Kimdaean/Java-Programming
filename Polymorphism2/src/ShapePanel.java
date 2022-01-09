public class ShapePanel {
	private Shape ArrayShape[]; //ArrayShape 배열 생성
	private int numOfShape; //객체 배열에 저장된 객체의 수를 나타내기 위한 변수 numOfShape 생성
	private int count; //배열의 순서를 받기 위한 변수 x 생성
	public ShapePanel() {
		ArrayShape = new Shape[100]; //크기 100의 배열로 ArrayShape 초기화
		numOfShape = 0; //변수 numOfShape를 0으로 초기화
		count = 0;
	}
	public void add(Shape s) {
		for (int i = 0; i<numOfShape; i++) { //처음 인덱스부터 numOfShape만큼 반복
			if(ArrayShape[i].equals(s)) { //배열의 인덱스 값과 파라미터로 입력된 Shape 객체 s의 값이 같다면
				return; //추가하지 않기
				}
			}
		ArrayShape[numOfShape++] = s; //현재 자리에 하나를 추가하고 numOfShape하나 추가
		}
	public void delete(Shape s) {
		for (int i = 0; i<numOfShape; i++) { //처음 인덱스부터 numOfShape만큼 반복
			if(ArrayShape[i].equals(s)) { //배열의 객체와 파라미터로 입력된 Shape 객체 s의 값이 같다면
				count = i; //값이 같은 배열의 순서를 변수 x에 저장
				ArrayShape[i] = null; //객페의 값을 지우기
				numOfShape -= 1; //배열에 저장된 객체의 수 하나 감소
				return;
			}
		}
		for(;count<numOfShape;count++) { //지워진 객체부터 배열의 마지막까지
			ArrayShape[count] = ArrayShape[count+1]; //삭제된 위치 바로 다음부터 Shape 객체 배열의 내용을 앞으로 이동.
	}
	}
	public void display() { //ArrayShpae 배열을 출력하기 위한 함수 생성
		System.out.println("********** ShapePanel에 등록된 모든 도형 **********"); 
		for (int i = 0; i<numOfShape; i++) { //처음 인덱스부터 numOfShape만큼 반복
			if(ArrayShape[i] != null) { //인덱스 값이 존재하면
				System.out.println(ArrayShape[i]); //그 인덱스 값을 출력하기
			}
		}
	}
}