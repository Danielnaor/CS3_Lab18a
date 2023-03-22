/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab18a;

/**
 *
 * @author carmitnaor
 */
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.ArrayList;
import static java.lang.System.*;

public class Lab18a
{
	public static void main (String[] args)
	{
		Heap heap = new Heap();

		heap.add(1);
		heap.add(2);
		heap.add(8);
		heap.add(9);
		heap.add(10);
		heap.add(7);
		heap.add(75);
		heap.add(17);
		heap.add(5);

		heap.print();
		heap.remove();
		heap.print();
		heap.remove();
		heap.print();
		heap.remove();
		heap.print();
		heap.remove();
		heap.print();
		heap.remove();
		heap.print();
		heap.remove();
		heap.print();
		heap.remove();

		heap.print();
		heap.add(25);
		heap.print();
		heap.add(35);
		heap.print();
		heap.remove();
		heap.print();

                
                

	}
}