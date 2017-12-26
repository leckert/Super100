public class Name{

	public String first;
	public String second;

	public Name(){

		String output = "";

		int choose = (int) (Math.random() * 8);

		if 		(choose == 0) output += "Je";
		else if (choose == 1) output += "Lin";
		else if (choose == 2) output += "Nib";
		else if (choose == 3) output += "Bozo";
		else if (choose == 4) output += "Sike";
		else if (choose == 5) output += "Dav";
		else if (choose == 6) output += "Yo";
		else if (choose == 7) output += "Meme";

		choose = (int) (Math.random() * 8);

		if 		(choose == 0) output += "ff";
		else if (choose == 1) output += "da";
		else if (choose == 2) output += "cie";
		else if (choose == 3) output += "id";
		else if (choose == 4) output += "ffrey";
		else if (choose == 5) output += "vad";
		else if (choose == 6) output += "boi";
		else if (choose == 7) output += "bon";

		first = output;

		choose = (int)(Math.random() * 3);
		if (choose == 0) second = "fire";
		if (choose == 1) second = "water";
		if (choose == 2) second = "grass";
	}

	public String toString() {
		return first + ", " + second;
	}

	// public static void main(String[] args){
	// 	Name jeff = new Name();
	// 	System.out.println(jeff);

	// }
}