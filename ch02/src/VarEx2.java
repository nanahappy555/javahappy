
public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4, y = 2;
		int tmp;
		
		tmp = x; // 1. x�� ���� tmp�� ����
		x = y; // 2. y�� ���� x�� ����
		y = tmp; // 3. tmp�� ���� y�� ����
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		
		System.out.println(x+y); // ����
		System.out.println(x-y); // ����
		System.out.println(x*y); // ����
		System.out.println(x/y); // ������
	}

}
