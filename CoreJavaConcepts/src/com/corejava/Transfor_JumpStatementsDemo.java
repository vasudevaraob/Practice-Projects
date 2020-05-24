package com.corejava;

/*
 * continue - will skip that particular iteration one
 * break - Brake will brake the left of iteration
 * return
 * 
 */

public class Transfor_JumpStatementsDemo {

	public static void main(String[] args) {

		/*
		 * continue
		 */

		for (int a = 0; a < 10; a++) {

			if (a == 7) {

				continue;
			}
			System.out.println("Example for continue   "+a);
		}
		
		/*
		 * break
		 * 
		 */
		
		for (int b = 0; b <10; b++) {
			
			if (b==5) {
				break;
			}
			System.out.println("Example for continue for B  "+b);
		}
	}

}
