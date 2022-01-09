package �ǽ�13;

import java.io.Serializable;

public class Student implements Serializable{ //��ü�� ����ȭ �ϱ� ���� Serializable �������̽� ����
	private String �й�; //���ڿ� ���� �й� ����
	private String �̸�; //���ڿ� ���� �̸� ���� 
	private String �а�; //���ڿ� ���� �а� ����
	private int ����; //������ ���� ���� ����
	
	public Student(String �й�, String �̸�, String �а�, int ����) { //������ ȣ��
		this.�й� = �й�; //���� �й��� �Ķ���ͷ� ���� �й� �ֱ�
		this.�̸� = �̸�; //���� �̸��� �Ķ���ͷ� ���� �̸� �ֱ�
		this.�а� = �а�; //���� �а��� �Ķ���ͷ� ���� �а� �ֱ�
		this.���� = ����; //���� ���̿� �Ķ���ͷ� ���� ���� �ֱ�
	}
	public String toString() { //���ڿ��� ��ȯ
		return String.format("%s %s %s %d", �й�, �̸�, �а�, ����); 
	}
}
class UnderGraduate extends Student { //Student Ŭ������ ��ӹ޴� UnderGraduate Ŭ���� ����
	private String ���Ƹ�; //���� ���Ƹ� ����
	public UnderGraduate(String �й�, String �̸�, String �а�, int ����, String ���Ƹ�) { //������ ȣ��
		super(�й�, �̸�, �а�, ����); //�й�, �̸�, �а�, ���� �Ķ���ͷ� ���� ������ �ʱ�ȭ
		this.���Ƹ� = ���Ƹ�; //���� ���Ƹ��� �Ķ���ͷ� ���� ���Ƹ� �ֱ�
	}
	
	public String toString() { //���ڿ��� ��ȯ
		return String.format("%s %s", super.toString(), ���Ƹ�);
	}
}

class Graduate extends Student { //Student Ŭ������ ��ӹ޴� Graduate Ŭ���� ����
	private String ��������; //���� �������� ����
	private String ����; //���� ���� ����
	
	public Graduate(String �й�, String �̸�, String �а�, int ����, String ��������, String ����) { //������ ȣ��
		super(�й�, �̸�, �а�, ����); //�й�, �̸�, �а�, ���� �Ķ���ͷ� ���� ������ �ʱ�ȭ
		this.�������� = ��������; //���� ���������� �Ķ���ͷ� ���� �������� �ֱ�
		this.���� = ����; //���� ������ �Ķ���ͷ� ���� ���������� �ֱ�
	}
	
	public String toString() { //���ڿ��� ��ȯ
		return String.format("%s %s %s", super.toString(), ��������, ����);
	}
}
