package ifExample;

public class Switchcase {

	public static void main(String[] args) {
		int rank = 10;
		char medalColor;
		
		switch(rank) {
			case 1: medalColor = 'G';
				break;
			case 2: medalColor = 'S';
				break;
			case 3: medalColor = 'B';
				break;
			default: medalColor = 'A';
		} // break�� ������ ����!
		System.out.println(rank +"�� �޴��� ������ " + medalColor + "�Դϴ�.");

	}

}
