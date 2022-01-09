public class Figure {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 10, 100, 100); //Rectangle 클래스에서 r1 변수 생성
        Rectangle r2 = new Rectangle(0, 10, 100, 100); //Rectangle 클래스에서 r2 변수 생성
        Rectangle r3 = new Rectangle(10, 10, 10, 100); //Rectangle 클래스에서 r3 변수 생성
        Rectangle r4 = new Rectangle(10, 10, 100, 100); //Rectangle 클래스에서 r4 변수 생성
        r1.display(); //변수 r1 출력
        r2.display(); //변수 r2 출력
        System.out.println("두 Rectangle 객체는 동일한가? " + r1.equals(r2)); //두 변수가 같은지 판단하는 문구 출력
        System.out.println(); //한 줄 띄어쓰기
        r3.display(); //변수 r3 출력
        r4.display(); //변수 r4 출력
        System.out.println("두 Rectangle 객체는 동일한가? " + r3.equals(r4)); //두 변수가 같은지 판단하는 문구 출력
        System.out.println(); //한 줄 띄어쓰기
        r1.display(); //변수 r1 출력
        r4.display(); //변수 r4 출력
        System.out.println("두 Rectangle 객체는 동일한가? " + r1.equals(r4)); //두 변수가 같은지 판단하는 문구 출력
        System.out.println(); //한 줄 띄어쓰기
        Circle c1 =  new Circle(20,30,100); //Circle 클래스에서 c1 변수 생성
        Circle c2 =  new Circle(10,30,10); //Circle 클래스에서 c2 변수 생성
        Circle c3 =  new Circle(20,30,100); //Circle 클래스에서 c3 변수 생성
        c1.display(); //변수 c1 출력
        c2.display(); //변수 c2 출력
        System.out.println("두 Circle 객체는 동일한가?"+ c1.equals(c2)); //두 변수가 같은지 판단하는 문구 출력
        System.out.println(); //한 줄 띄어쓰기
        c1.display(); //변수 c1 출력
        c3.display(); //변수 c3 출력
        System.out.println("두 Circle 객체는 동일한가?"+ c1.equals(c3)); //두 변수가 같은지 판단하는 문구 출력
        System.out.println(); //한 줄 띄어쓰기
        r1.display(); //변수 r1 출력
        c1.display(); //변수 c1 출력
        System.out.println("Rectangle 객체와 Circle 객체는 동일한가?"+ r1.equals(c1)); //두 변수가 같은지 판단하는 문구 출력
        System.out.println("Circle 객체와 Rectangle 객체는 동일한가?"+ c1.equals(r1)); //두 변수가 같은지 판단하는 문구 출력
    }
}