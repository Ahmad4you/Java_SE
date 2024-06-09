package For_complex_Exsemple;


public class Ast_Projekt {
//#58 ----Hassouna
	public static void main(String[] args) {
		int row, sp, ast, roundSp, roundAst, discount = 0;
		for(row =1 ; row <= 9; row++) {
			roundSp = (row <= 5)? 5-row : row-5;
			for(sp=1; sp <= roundSp; sp++) 
				System.out.print(" ");
				if(row>5) discount +=4;
				roundAst = (row<=5)? row*2-1 : row*2-1-discount;
			for(ast=1 ; ast <= roundAst; ast++)
				System.out.print("*");
			System.out.println();
		}

	}

}
