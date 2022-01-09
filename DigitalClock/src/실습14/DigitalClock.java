package �ǽ�14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

public class DigitalClock {

   public static void main(String[] args) {
	   new DigitalClockFrame(); //���α׷� ����

   }

}

class DigitalClockFrame extends JFrame {
	JLabel dayLabel; //dayLabel ���̺� ����
	JLabel clockLabel; //clockLabel ���̺� ����
   boolean flag = true; //���콺�� ���ȴ��� Ȯ���ϱ� ���� ���� ���� ����
   
   DigitalClockFrame() {
	   setSize(250,150); //ũ�� ����
	      setLayout(new FlowLayout()); //��ġ������ ����
	      
	      dayLabel = new JLabel("������"); //dayLabel ����
	      dayLabel.setFont(new Font("Gothic", Font.ITALIC, 20)); //datLabel ��Ÿ�� ����
	      
	      clockLabel = new JLabel("�ú���"); //clockLabel ����
	      clockLabel.setFont(new Font("Gothic", Font.ITALIC, 20)); //clockLabel ��Ÿ�� ����
	      
	      add(dayLabel); //dayLabel �߰�
	      add(clockLabel); //clockLabel �߰�

      
      addMouseListener(new MouseAdapter() {

         @Override
         public void mousePressed(MouseEvent e) { //���콺�� ������ ���
            if (flag)
               flag = false; //flag�� true�� ����
            else
               flag = true; //flag�� false�� ����
            
         }
         
      });
      
      setVisible(true); //���̰� �ϱ�
      
      ClockThread th = new ClockThread(); //������ ��ü ����
      th.start(); //Ÿ�̸� �����尡 ���� ����

      
   }
   
   private void updateDayTimeLabel() { //���� ��¥�� ���� �ð� ���� �˾ƿ��� 
      Calendar c = Calendar.getInstance();
      int year = c.get(Calendar.YEAR);
      int month = c.get(Calendar.MONTH);
      int day = c.get(Calendar.DAY_OF_MONTH);
      int hour = c.get(Calendar.HOUR_OF_DAY);
      int min = c.get(Calendar.MINUTE);
      int second = c.get(Calendar.SECOND);

      String dayText = String.format("%4d�� %2d �� %2d ��",year,month+1,day); //���� dayText�� ���� �� ����
      String clockText = String.format("%2d:%2d:%2d", hour, min, second); //���� clockText�� ���� �� ����

      
      dayLabel.setText(dayText); //dayLabel ���� dayText�� ����
      clockLabel.setText(clockText); //clockLabel ���� clockText�� ����
   }
   
   class ClockThread extends Thread { //Thread Ŭ���� ���

      @Override
      public void run() {
         while (true) { //���ѷ���
            if (flag) //���콺�� ���ȴٸ�
               updateDayTimeLabel(); //���� ��¥�� ���� �ð� �� ���
         }
      }
      
   }
}
