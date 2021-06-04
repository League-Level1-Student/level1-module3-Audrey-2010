package _02_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		new Backpack().packAndCheck();
		Backpack backpack = new Backpack();
		Pencil pencil = new Pencil();
		Ruler ruler = new Ruler();
		Textbook book = new Textbook();
		String writing="dog";
		backpack.putInBackpack(pencil);
		backpack.putInBackpack(ruler);
		backpack.putInBackpack(book);
		backpack.goToSchool();
		ruler.measure();
		pencil.write(writing);
		book.read();
	}
}
