import java.util.*;
class CTest{
	void test(int n) {
		if (n==0) {
			System.out.println("此數為0");
		}
		if(n%2==0) {
			System.out.println("此數為偶數");
		}
		else {
			System.out.println("此數為奇數");
		}
	}
}
public class class07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		CTest t=new CTest();
		t.test(n);
	}

}
