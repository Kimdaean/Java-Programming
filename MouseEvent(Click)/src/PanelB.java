import javax.swing.*; //���� ������Ʈ Ŭ�������� ��θ�
import java.awt.*; //�׷��� ó���� ���� Ŭ�������� ��θ�
import java.awt.event.*; //�̺�Ʈ ó���� ���� Ŭ�������� ��θ�
public class PanelB extends JPanel{	//JPanel �����̳�
	PanelA panelA; //���۷��� ���� panelA����
	PanelB(PanelA panelA){ //�Ķ���ͷ� panelA�� �޴� PanelB ����
		this.panelA = panelA; //�Ķ���ͷ� ���� panelA�� ���� ��ü panelA�� ����
		setBackground(Color.BLUE); //������ �Ķ������� ����
		setLayout(new GridLayout(3,1,5,5));	//3�� 1���� �迭�ϰ� ������Ʈ ������ ������ �����¿�� 5�ȼ��� ����
		JButton btn1 = new JButton("�簢"); //"�簢" ��ư ����
		btn1.addActionListener(new MyActionListener()); //�簢��ư�� ������ ActionEvent �߻�
		add(btn1); //�簢��ư �߰�
		JButton btn2 = new JButton("����"); //"����" ��ư ����
		btn2.addActionListener(new MyActionListener()); //������ư�� ������ ActionEvent �߻�
		add(btn2); //������ư �߰�
		JButton btn3 = new JButton("Ÿ��"); //"Ÿ��" ��ư ����
		btn3.addActionListener(new MyActionListener()); //Ÿ����ư�� ������ ActionEvent �߻�
		add(btn3); //Ÿ����ư �߰�
	}
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) { //ActionEvent�� �߻��� ���
				String actionCmd = e.getActionCommand(); //��ư�� ������ �ش� ��ư�� Ŀ�ǵ带 �ޱ�
				panelA.label.setText(actionCmd); //label�� �ش� ��ư�� Ŀ�ǵ�� ����
			}
		}
	}