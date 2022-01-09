package 실습14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

public class DigitalClock {

   public static void main(String[] args) {
	   new DigitalClockFrame(); //프로그램 실행

   }

}

class DigitalClockFrame extends JFrame {
	JLabel dayLabel; //dayLabel 레이블 생성
	JLabel clockLabel; //clockLabel 레이블 생성
   boolean flag = true; //마우스가 눌렸는지 확인하기 위한 논리형 변수 생성
   
   DigitalClockFrame() {
	   setSize(250,150); //크기 설정
	      setLayout(new FlowLayout()); //배치관리자 생성
	      
	      dayLabel = new JLabel("연월일"); //dayLabel 설정
	      dayLabel.setFont(new Font("Gothic", Font.ITALIC, 20)); //datLabel 스타일 설정
	      
	      clockLabel = new JLabel("시분초"); //clockLabel 설정
	      clockLabel.setFont(new Font("Gothic", Font.ITALIC, 20)); //clockLabel 스타일 설정
	      
	      add(dayLabel); //dayLabel 추가
	      add(clockLabel); //clockLabel 추가

      
      addMouseListener(new MouseAdapter() {

         @Override
         public void mousePressed(MouseEvent e) { //마우스가 눌렸을 경우
            if (flag)
               flag = false; //flag를 true로 설정
            else
               flag = true; //flag를 false로 설정
            
         }
         
      });
      
      setVisible(true); //보이게 하기
      
      ClockThread th = new ClockThread(); //스레드 객체 생성
      th.start(); //타이머 스레드가 실행 시작

      
   }
   
   private void updateDayTimeLabel() { //현재 날짜와 현재 시간 값을 알아오는 
      Calendar c = Calendar.getInstance();
      int year = c.get(Calendar.YEAR);
      int month = c.get(Calendar.MONTH);
      int day = c.get(Calendar.DAY_OF_MONTH);
      int hour = c.get(Calendar.HOUR_OF_DAY);
      int min = c.get(Calendar.MINUTE);
      int second = c.get(Calendar.SECOND);

      String dayText = String.format("%4d년 %2d 월 %2d 일",year,month+1,day); //변수 dayText를 생성 및 설정
      String clockText = String.format("%2d:%2d:%2d", hour, min, second); //변수 clockText를 생성 및 설정

      
      dayLabel.setText(dayText); //dayLabel 글을 dayText로 설정
      clockLabel.setText(clockText); //clockLabel 글을 clockText로 설정
   }
   
   class ClockThread extends Thread { //Thread 클래스 상속

      @Override
      public void run() {
         while (true) { //무한루프
            if (flag) //마우스가 눌렸다면
               updateDayTimeLabel(); //현재 날짜와 현재 시간 값 출력
         }
      }
      
   }
}
