public class Card {

	private int num;
	private Name name;

	//**toString helpers
	public String line1;
	public String line2;
	public String line3;
	public String line4;
	public String line5;
	public String line6;


	public int getNum(){
		return num;
	}

	public Card(){
		num = (int) (Math.random() * 25) - 5;
		name = new Name();

		line1 = "[//////////";
		line2 = "| " + name.first;
			for (int counter = name.first.length(); counter <= 8; counter ++)
					line2 += " ";
		line3 = "| [" + name.second + "]";
			for (int counter = name.second.length(); counter <= 6; counter ++)
					line3 += " ";
		line4 = "|==========";
		line5 = "| VALUE: " + this.getNum() + "";
			for (int counter = line5.length(); counter < 11; counter ++)
					line5 += " ";
		line6 = "[//////////";
	}

	public String toString() {

		

		return line1 + "\n" +
				line2 + "\n" +
				line3 + "\n" +
				line4 + "\n" +
				line5 + "\n" +
				line6;

	}

	// public static void main(String[] args){
	// 	Card jeff = new Card();
	// 	System.out.println(jeff);
	// }



}