import javax.swing.*; //���� ������Ʈ Ŭ�������� ��θ�
import java.awt.*; //�׷��� ó���� ���� Ŭ�������� ��θ�
public class FigureEditor extends JFrame { //JFrame�� ��ӹ޴� FigureEditor ����
	PanelA panelA = new PanelA(); //panelA ��ü ����
	PanelC panelC = new PanelC(panelA); //panelA�� �޴� panelC ��ü ����
	FigureEditor(){ //FigureEditor ����
		setTitle("MyFrame"); //�������� ���� ����
		setSize(800,400); //�������� ũ�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//�����ư�� ������ �����Ӱ� �Բ� ���α׷��� �����ϵ��� ����
		Container contentPane = getContentPane(); //����Ʈ���� �˾Ƴ���
		contentPane.setLayout(new BorderLayout()); //��ġ�� borderlayout���� ����
		contentPane.add(panelA,BorderLayout.CENTER); //�߾ӿ� PanelC����
		contentPane.add(panelC,BorderLayout.WEST); //������ PanelA����
		setVisible(true); //�������� ȭ�鿡 ���
	}
	public static void main(String []args) {
		FigureEditor f = new FigureEditor(); //������ ���
	}
}
