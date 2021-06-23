/*
 * * To change this template, choose Tools | Templates
 * and open the template in the editor. 
 */
package lottokone;

import java.util.Random;

/**
 * 
 * @author Mikko
 *
 */

public class Lottokone {

	/**
	 * 
	 * @param args the command line arguments
	 */
	
	public static void main(String[] args) {
		
		int[] numerot = new int[7];
		Random r = new Random();
		for (int i = 0; i < 7; i++) {
			boolean ok = true;
			int x = r.nextInt(39)+1;
			for (int a = 0; a < i; a++) {
				if (x==numerot[a]) {
					i--;
					ok = false;
					break;
				}
			}
			if (ok) {
				numerot[i] = x;
			}
			System.out.println(r.nextInt(39)+1);
		}

	}

}
