package HakerRank;

public class AsciiEx {
	public static StringBuilder encryption(String message, int key) {
		char[] letters=message.toCharArray();
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < letters.length; i++) {
			sb.append((char)(byte)(letters[i]+key));
		}
		System.out.println(sb);
		return sb;
	}
	public static void decryption(StringBuilder sb, int key)
	{
		String s= sb.toString();
		char[] let=s.toCharArray();
		StringBuilder sb1= new StringBuilder();
		for (int i = 0; i < let.length; i++) {
			sb1.append((char)(byte)(let[i]-key));
		}System.out.println(sb1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
decryption(encryption("hello",3),3);
	}

}
