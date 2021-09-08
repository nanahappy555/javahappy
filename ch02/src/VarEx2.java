
public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4, y = 2;
		int tmp;
		
		tmp = x; // 1. xÀÇ °ªÀ» tmp¿¡ ÀúÀå
		x = y; // 2. yÀÇ °ªÀ» x¿¡ ÀúÀå
		y = tmp; // 3. tmpÀÇ °ªÀ» y¿¡ ÀúÀå
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		
		System.out.println(x+y); // µ¡¼À
		System.out.println(x-y); // »¬¼À
		System.out.println(x*y); // °ö¼À
		System.out.println(x/y); // ³ª´°¼À
	}

}
