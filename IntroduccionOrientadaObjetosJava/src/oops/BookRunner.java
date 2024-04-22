package oops;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();
		
		artOfComputerProgramming.setNoOfCopies(10);;
		effectiveJava.setNoOfCopies(5);;
		cleanCode.setNoOfCopies(3);
		
		artOfComputerProgramming.disminuirLibros(3);
		effectiveJava.disminuirLibros(2);
		cleanCode.disminuirLibros(1);
		
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
	}

}
