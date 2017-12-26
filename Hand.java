public class Hand {

	public final int HAND_SIZE = 5;
	private Card[] set = new Card[HAND_SIZE];


	public Hand(){
		for(int counter = 0; counter < 5; counter ++) {
			set[counter] = new Card();
		}
	}

	public String toString(){
		String _line1 = "";
		String _line2 = "";
		String _line3 = "";
		String _line4 = "";
		String _line5 = "";
		String _line6 = "";

		for(Card locale : set) {
			_line1 += locale.line1;
			_line2 += locale.line2;
			_line3 += locale.line3;
			_line4 += locale.line4;
			_line5 += locale.line5;
			_line6 += locale.line6;
		}

		return _line1 + "\n" +
				_line2 + "\n" +
				_line3 + "\n" +
				_line4 + "\n" +
				_line5 + "\n" +
				_line6;
	}

	// public static void main(String[] args) {
	// 	Hand jeff = new Hand();
	// 	System.out.println(jeff);
	// }

}