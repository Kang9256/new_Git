
public class Array_CharAt1 {		//charAt 예제 입니다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="강성우";
		char ch[]= new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			ch[i]=str.charAt(i);
			System.out.println(ch[i]);
		}
		
	}

}
