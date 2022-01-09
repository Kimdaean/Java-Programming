package data;
import java.util.Arrays; //Array �ҷ�����
import java.util.Iterator; //Iterator �ҷ�����
import java.util.Scanner; //Scanner �ҷ�����
public class PhoneManager {	
	private Phone[] phoneArray; //phoneArray��� �迭 ����
	private int count; //phoneArray �迭�� ���� ���ʴ�� �ֱ� ���� ���� count ����
	public void add(String name, String number) { //�Է¹��� �̸��� ����ó�� �߰��ϱ�
		phoneArray[count] = new Phone(name,number); //�Է¹��� �̸��� ����ó�� phoneArray �迭�� �ֱ�
		count = 0; //ó������ �ֱ�
		count++; //���ʴ�� �ֱ�
		}
	public PhoneManager() {	
		System.out.print("�ο���>>"); //�ο����� �ޱ� ���� ���� ���
		Scanner scanner = new Scanner(System.in); //Scannner ����
		int number= scanner.nextInt();	//�Է¹��� �ο����� ���� number�� �ֱ�
		phoneArray = new Phone[number]; //�Է¹��� �ο�����ŭ�� �迭 �����
		for(int i=0; i<number;i++) {	//�Է¹��� Ƚ����ŭ ��ü �Է�
			System.out.print("�̸��� ��ȭ��ȣ (��ȣ�� ���������� �Է�)>>"); //Ű����κ��� �̸��� ��ȭ��ȣ�� �Է¹ޱ� ���� ���� ���
			String name = scanner.next(); //�Է¹��� �̸��� ���� name�� �ֱ�
			String tel = scanner.next(); //�Է¹��� ��ȭ��ȣ�� ���� tel�� �ֱ�
			add(name, tel);	//�Է¹��� tel�� name�� �Է�
			}
		System.out.print("����Ǿ����ϴ�...\n"); //�Է¹��� �̸��� ��ȭ��ȣ�� �����ߴٴ� ���� ���
		}
	public void searchByName (String name) { //����� ����ó���� �̸����� ã������ �Լ� ����
		boolean x=true;	//�˻��� ���� �ִ��� Ȯ���ϱ� ���� ���� ����
		Iterator<Phone> iterator = Arrays.asList(phoneArray).iterator(); //phonArray�迭�� iterartor�� ����
		while(iterator.hasNext()) {	//���� �迭�� ���� �����Ҷ����� �ݺ�
			Phone phone=iterator.next(); //����ؼ� �������� �Ѿ��
			if((phone.getName()).equals(name)) { //���� �˻��� �̸��� �迭�� �ִ� �̸��� ���ٸ�
				System.out.printf("%s�� ��ȣ�� %s�Դϴ�.\n",phone.getName(),phone.getTel()); //�̸��� ��ȣ�� ���
				x=false; //�˻��� ������ ã���� ��
			}
		}
		if(x) {	//�˻��� ������ �� ã���� ��
			System.out.printf("%s�� �����ϴ�.\n",name); //�˻��� �̸��� ���ٴ� ���� ���
		}
	}
}