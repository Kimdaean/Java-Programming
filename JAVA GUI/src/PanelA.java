import javax.swing.*; //���� ������Ʈ Ŭ�������� ��θ�
import java.awt.*; //�׷��� ó���� ���� Ŭ�������� ��θ�
public class PanelA extends JPanel { //JPanel �����̳�
	JLabel label; //���۷��� ���� label ����
	PanelA(){ //PanelA ����
		setBackground(Color.YELLOW); //������ ��������� ����
		setLayout(new FlowLayout()); //FlowLayout ����
		label = new JLabel("���Ⱑ �׷��� ��ü�� �׸��� ���Դϴ�."); //���̺� ��µ� ���� ����
		add(label);	//���̺� ���� ���
	}
}