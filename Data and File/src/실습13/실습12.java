package �ǽ�13;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class �ǽ�12 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>(); //students �迭 ����
        students.add(new UnderGraduate("100","Lee","�繰���ͳ�",21,"�״Ͻ�")); //�迭�� �߰�
        students.add(new UnderGraduate("101","Kim","���ɽý���",21,"�䰡")); //�迭�� �߰�
        students.add(new UnderGraduate("102","Park","���̹�����",24,"��")); //�迭�� �߰�
        students.add(new UnderGraduate("103","Kim","ICT���տ������θ�Ʈ",21,"�߱�")); //�迭�� �߰�
        students.add(new Graduate("G100","Jung","�����ý���",26,"����","�ΰ�����")); //�迭�� �߰�
        students.add(new Graduate("G101","Lee","�����ý���",26,"����","����")); //�迭�� �߰�
        students.add(new Graduate("G200","Han","������ǻ�Ͱ���",28,"�ڻ�","�Ӻ����ý���")); //�迭�� �߰�

        saveDataToFile(students, "output.txt"); //students ������ ���� data�� ���Ͽ� �����ϱ� ���� �Լ�
        System.out.println(loadDataFromFile("output.txt")); //���Ͽ� ������ data�� ��� 

        saveObjectToFile(students, "output.dat"); //��ü�� ���Ͽ� �����ϱ� ���� �Լ�
        System.out.println(loadObjectFromFile("output.dat")); //���Ͽ� ������ ��ü�� ���

    }
    
    public static void saveDataToFile(ArrayList<Student> students, String fileName)  {
    	PrintWriter out = null; //PrintWriter ��ü out ����
    	try {
			out = new PrintWriter(new FileWriter(fileName)); //PrintWriter ��ü out ����
			for (int i=0; i<students.size(); i++) { //students �迭 ũ�⸸ŭ �ݺ�
				Student s = students.get(i); //students �迭�� ������ �ε����� ��ü s�� ����
				out.println(s); //��� �ҽ��� ���ڷ� ���
			}
			out.close(); //��� ��Ʈ���� �ݰ� ���õ� �ý��� �ڿ� ����
		} catch (IOException e) { //ó���� ���� Ÿ�� ����
			e.printStackTrace(); //������ �߻��ٿ����� ã�Ƽ� �ܰ躰�� ������ ���
		}
    }
    
    public static ArrayList<Student> loadDataFromFile(String fileName) {
    	BufferedReader inputStream = null; //BufferedReader ��ü inputStream ����
		try {
			inputStream = new BufferedReader(new FileReader(fileName)); //���� ��Ʈ���� ����
		} catch (FileNotFoundException e) { //ó���� ���� Ÿ�� ����
			e.printStackTrace(); //������ �߻��ٿ����� ã�Ƽ� �ܰ躰�� ������ ���
		}
		ArrayList<String> str = new ArrayList<String>(); //���ڿ����� �ӽ÷� ������ str �迭 ����
		ArrayList<Student> result = new ArrayList<Student>(); //��ȯ�� �����
		String s; //���ڿ��� �Է¹ޱ� ���� ���� ����
		try {
			while((s = inputStream.readLine())!=null) //���پ� �Է¹޾Ƽ� �� �� ���� �����ϴ� �� Ȯ��
				str.add(s); //str �迭�� ���� ����
		} catch (IOException e) { //ó���� ���� Ÿ�� ����
			e.printStackTrace(); //������ �߻��ٿ����� ã�Ƽ� �ܰ躰�� ������ ���
		}
		for(int i=0;i<str.size();i++) {	//�����ϴ� ���� �� ��ŭ �ݺ�
			ArrayList<String> str_token = new ArrayList<String>(); //str �ȿ� �ִ� ���ڿ� ������ �����ϱ� ���� �迭 str_token ����
			StringTokenizer sample = new StringTokenizer(str.get(i), " ", false); //str�� ����� �����ϱ� ���� StringTokenizer����
			while(sample.hasMoreTokens())
				str_token.add(sample.nextToken()); //���� ���� ��ū�� �ӽ÷� str_token�� ����
			if(str_token.size()==5) { //���� �� ����� 5��� UnderGraduate
				result.add(new UnderGraduate(str_token.get(0),str_token.get(1),str_token.get(2),Integer.parseInt(str_token.get(3)),str_token.get(4)));	//result�� UnderGraduate����
			}
			else { //�ƴ϶�� Graduate
				result.add(new Graduate(str_token.get(0),str_token.get(1),str_token.get(2),Integer.parseInt(str_token.get(3)),str_token.get(4),str_token.get(5)));	//result�� Graduate����
			}
		}		
		return result; //������� �� ��ȯ
	}

    public static void saveObjectToFile(ArrayList<Student> students, String fileName) {
    	try {
			ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream(fileName)); //��ü ������ �����͸� ���Ϸ� �����ϱ� ���� ��� ��Ʈ��
			out.writeObject(students); //��ü out�� students �迭 ����
			out.close(); //��� ��Ʈ���� �ݰ� ���õ� �ý��� �ڿ� ����
		} catch (IOException e) { //ó���� ���� Ÿ�� ����
			e.printStackTrace(); //������ �߻��ٿ����� ã�Ƽ� �ܰ躰�� ������ ���
		}
    }
    
    public static ArrayList<Student> loadObjectFromFile(String fileName) {
    	
    	ArrayList<Student> result = null; //�迭 result ����
    	try {
			ObjectInputStream in = new ObjectInputStream (new FileInputStream(fileName));
			result = (ArrayList<Student>)in.readObject();
			in.close();	//��� ��Ʈ���� �ݰ� ���õ� �ý��� �ڿ� ����
		} catch (IOException e) { //ó���� ���� Ÿ�� ����
			e.printStackTrace(); //������ �߻��ٿ����� ã�Ƽ� �ܰ躰�� ������ ���
		} catch (ClassNotFoundException e) { //ó���� ���� Ÿ�� ����
			e.printStackTrace(); //������ �߻��ٿ����� ã�Ƽ� �ܰ躰�� ������ ���
		}
    	return result; 
    }
}