package 실습13;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 실습12 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>(); //students 배열 생성
        students.add(new UnderGraduate("100","Lee","사물인터넷",21,"테니스")); //배열에 추가
        students.add(new UnderGraduate("101","Kim","지능시스템",21,"요가")); //배열에 추가
        students.add(new UnderGraduate("102","Park","사이버보안",24,"댄스")); //배열에 추가
        students.add(new UnderGraduate("103","Kim","ICT융합엔터테인먼트",21,"야구")); //배열에 추가
        students.add(new Graduate("G100","Jung","정보시스템",26,"석사","인공지능")); //배열에 추가
        students.add(new Graduate("G101","Lee","정보시스템",26,"석사","보안")); //배열에 추가
        students.add(new Graduate("G200","Han","정보컴퓨터공학",28,"박사","임베디드시스템")); //배열에 추가

        saveDataToFile(students, "output.txt"); //students 베열로 받은 data를 파일에 저장하기 위한 함수
        System.out.println(loadDataFromFile("output.txt")); //파일에 저장한 data를 출력 

        saveObjectToFile(students, "output.dat"); //객체를 파일에 저장하기 위한 함수
        System.out.println(loadObjectFromFile("output.dat")); //파일에 저장한 객체를 출력

    }
    
    public static void saveDataToFile(ArrayList<Student> students, String fileName)  {
    	PrintWriter out = null; //PrintWriter 객체 out 생성
    	try {
			out = new PrintWriter(new FileWriter(fileName)); //PrintWriter 객체 out 생성
			for (int i=0; i<students.size(); i++) { //students 배열 크기만큼 반복
				Student s = students.get(i); //students 배열의 각각의 인덱스를 객체 s에 저장
				out.println(s); //출력 소스에 문자로 출력
			}
			out.close(); //출력 스트림을 닫고 관련된 시스템 자원 해제
		} catch (IOException e) { //처리할 예외 타입 선언
			e.printStackTrace(); //에러의 발생근원지를 찾아서 단계별로 에러를 출력
		}
    }
    
    public static ArrayList<Student> loadDataFromFile(String fileName) {
    	BufferedReader inputStream = null; //BufferedReader 객체 inputStream 생성
		try {
			inputStream = new BufferedReader(new FileReader(fileName)); //버퍼 스트림의 연결
		} catch (FileNotFoundException e) { //처리할 예외 타입 선언
			e.printStackTrace(); //에러의 발생근원지를 찾아서 단계별로 에러를 출력
		}
		ArrayList<String> str = new ArrayList<String>(); //문자열들을 임시로 저장할 str 배열 생성
		ArrayList<Student> result = new ArrayList<Student>(); //반환할 결과값
		String s; //문자열을 입력받기 위한 변수 생성
		try {
			while((s = inputStream.readLine())!=null) //한줄씩 입력받아서 총 몇 줄이 존재하는 지 확인
				str.add(s); //str 배열에 변수 저장
		} catch (IOException e) { //처리할 예외 타입 선언
			e.printStackTrace(); //에러의 발생근원지를 찾아서 단계별로 에러를 출력
		}
		for(int i=0;i<str.size();i++) {	//존재하는 줄의 수 만큼 반복
			ArrayList<String> str_token = new ArrayList<String>(); //str 안에 있는 문자열 각각을 저장하기 위한 배열 str_token 생성
			StringTokenizer sample = new StringTokenizer(str.get(i), " ", false); //str을 띄어쓰기로 구분하기 위해 StringTokenizer설정
			while(sample.hasMoreTokens())
				str_token.add(sample.nextToken()); //각각 나눈 토큰을 임시로 str_token에 저장
			if(str_token.size()==5) { //만일 총 사이즈가 5라면 UnderGraduate
				result.add(new UnderGraduate(str_token.get(0),str_token.get(1),str_token.get(2),Integer.parseInt(str_token.get(3)),str_token.get(4)));	//result에 UnderGraduate저장
			}
			else { //아니라면 Graduate
				result.add(new Graduate(str_token.get(0),str_token.get(1),str_token.get(2),Integer.parseInt(str_token.get(3)),str_token.get(4),str_token.get(5)));	//result에 Graduate저장
			}
		}		
		return result; //만들어진 값 반환
	}

    public static void saveObjectToFile(ArrayList<Student> students, String fileName) {
    	try {
			ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream(fileName)); //객체 단위의 데이터를 파일로 저장하기 위한 출력 스트림
			out.writeObject(students); //객체 out에 students 배열 저장
			out.close(); //출력 스트림을 닫고 관련된 시스템 자원 해제
		} catch (IOException e) { //처리할 예외 타입 선언
			e.printStackTrace(); //에러의 발생근원지를 찾아서 단계별로 에러를 출력
		}
    }
    
    public static ArrayList<Student> loadObjectFromFile(String fileName) {
    	
    	ArrayList<Student> result = null; //배열 result 생성
    	try {
			ObjectInputStream in = new ObjectInputStream (new FileInputStream(fileName));
			result = (ArrayList<Student>)in.readObject();
			in.close();	//출력 스트림을 닫고 관련된 시스템 자원 해제
		} catch (IOException e) { //처리할 예외 타입 선언
			e.printStackTrace(); //에러의 발생근원지를 찾아서 단계별로 에러를 출력
		} catch (ClassNotFoundException e) { //처리할 예외 타입 선언
			e.printStackTrace(); //에러의 발생근원지를 찾아서 단계별로 에러를 출력
		}
    	return result; 
    }
}