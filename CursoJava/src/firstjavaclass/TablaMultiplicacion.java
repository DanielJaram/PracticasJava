package firstjavaclass;

public class TablaMultiplicacion {
	//5*1=5
	//5-10=50
	
	void imprimir() {
		for(int i =1; i<=10; i++) {
			System.out.printf("%d * %d = %d", 5, i , 5*i).println();
		}
		
	}
	void imprimir(int table) {
		for(int i =1; i<=10; i++) {
			System.out.printf("%d * %d = %d", table, i , table*i).println();
		}
	}
	
	void imprimir(int table, int del, int hasta) {
		for(int i =del; i<=hasta; i++) {
			System.out.printf("%d * %d = %d", table, i , table*i).println();
		}
	}
	
}
