public class ¡÷ªÁ¿ß {
	int facevalue;
	int roll() {
		facevalue = (int)(Math.random()*6)+1;
		return facevalue;
	}
	void print() {
		System.out.println("facevalue="+facevalue);
	}
}