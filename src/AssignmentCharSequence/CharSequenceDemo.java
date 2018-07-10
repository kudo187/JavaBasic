package AssignmentCharSequence;

public class CharSequenceDemo implements CharSequence {
	private String s;

	@Override
	public char charAt(int i) {
		if ((i < 0) || (i >= s.length())) {
			throw new StringIndexOutOfBoundsException(i);
		}
		return s.charAt(i);
	}

	@Override
	public int length() {
		return s.length();
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		if (start < 0) {
			throw new StringIndexOutOfBoundsException(start);
		}
		if (end > s.length()) {
			throw new StringIndexOutOfBoundsException(end);
		}
		if (start > end) {
			throw new StringIndexOutOfBoundsException(start - end);
		}
		StringBuilder sub = new StringBuilder(s.subSequence(start, end));
		return sub;
	}

	public CharSequenceDemo(String s) {
		this.s = s;
	}

	public String toString() {
		StringBuilder s = new StringBuilder(this.s);
		return s.reverse().toString();
	}

	public static void main(String[] args) {
		CharSequenceDemo s = new CharSequenceDemo(
				"Tôi quét nhà và rửa chén bát mỗi ngày.");

		// exercise charAt() and length()
		int lengthString = s.length();
		System.out.println("Số ký tự của chuỗi: " + lengthString);
		System.out.println("Chuỗi ban đầu:");
		for (int i = 0; i < lengthString; i++) {
			System.out.print(s.charAt(i));
		}
		System.out.println("");
		// example subSequence
		System.out.println("Chuỗi được khi cắt: " + s.subSequence(0, 6));
		// example reverse;
		System.out.println("Chuỗi đảo ngược: ");
		System.out.println(s.toString());

	}

}
