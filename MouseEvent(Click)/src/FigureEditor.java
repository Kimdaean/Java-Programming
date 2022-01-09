import javax.swing.*; //���� ������Ʈ Ŭ�������� ��θ�
import java.awt.*; //�׷��� ó���� ���� Ŭ�������� ��θ�
import java.awt.event.*; //�̺�Ʈ ó���� ���� Ŭ�������� ��θ�
public class FigureEditor extends JFrame { //JFrame�� ��ӹ޴� FigureEditor ����
	PanelA panelA = new PanelA(); //panelA ��ü ����
	PanelC panelC = new PanelC(panelA); //panelA�� �Ķ���ͷ� �޴� ��ü panelC ����
	FigureEditor(){ //FigureEditor ����
		setTitle("MyFrame"); //�������� ���� ����
		setSize(800,400); //�������� ũ�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//�����ư�� ������ �����Ӱ� �Բ� ���α׷��� �����ϵ��� ����
		Container contentPane = getContentPane(); //����Ʈ���� �˾Ƴ���
		this.addMouseListener(new MyMouseListener()); // ���콺������
		contentPane.setLayout(new BorderLayout()); //��ġ�� borderlayout���� ����
		contentPane.add(panelA,BorderLayout.CENTER); //�߾ӿ� PanelA����
		contentPane.add(panelC,BorderLayout.WEST); //���ʿ� PanelC����
		setVisible(true); //�������� ȭ�鿡 ���
	}
	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) { //���콺�� ������
			panelA.label.setLocation(e.getX(),e.getY()); //���콺�� ���� ��ġ�� label �̵�
			}
		public void mouseClicked(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	public static void main(String []args) {
		FigureEditor f = new FigureEditor(); //������ ���
	}
}