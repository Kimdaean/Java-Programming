import javax.swing.*; //���� ������Ʈ Ŭ�������� ��θ�
public class PanelC extends JPanel{	//JPanel �����̳�
	PanelC(PanelA panelA){ //���۷��� ���� panelA�� �Ķ���ͷ� �޴� PanelC ����
		add(new PanelB(panelA)); //PanelC�� ���۷��� ���� panelA�� �Ķ���ͷ� �޴� PanelB�߰�
	}
}