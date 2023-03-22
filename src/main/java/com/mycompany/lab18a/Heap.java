/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

    public class Heap {
	private ArrayList<Integer> list;
        
        public Heap() {
            list = new ArrayList<Integer>();
	}

	public void add(int value) {
            list.add(value);
            swapUp(list.size()-1);
	}

        public void swapUp(int bot) {
            while( bot>0 ){
                int parent = (bot-1)/2;
                if (list.get(parent) < list.get(bot)){
                    swap(parent,bot);
                    bot = parent;
                }
                else{
                    return;
                }
            }
	}

	public void remove( )
	{
		list.set(0,list.get(list.size()-1));
		list.remove(list.size()-1);
		swapDown(list.size());
	}

	public void swapDown(int top)
	{
        int root = 0;
        while(root < list.size()){
            int max = 0;
            int left = (root * 2) + 1;
            int right = (root * 2) + 2;
            int rightVal;
            int leftVal;
            
            if(left < list.size()){
                leftVal = list.get(left);
                if (right < list.size()){
                    rightVal = list.get(right); 
                    if(rightVal > leftVal){
                        max  = right;
                    }
                    else if(rightVal < leftVal){
                         max  = left;
                    }
                }
                else{
                    max = left;
                }
                
             }
            else{
                return;
            }
            if (list.get(max) > list.get(root)){
                swap(max,root);
                //swap(root, max);
                  root = max;
            }
            else{
                return;
            }
            
        }
            



	}
	
	private void swap(int start, int finish)
	{
            int valStart = list.get(start);
            int valFinish = list.get(finish);
            list.set(start, valFinish);
            list.set(finish, valStart);
	}
        public void print()
        {
        out.println("\n\nPRINTING THE HEAP!\n\n");
        int size = list.size();
        int level = 1;
        int index = 0;
        int space = size;

        while (index < size) {
            for (int i = 0; i < space; i++) {
                System.out.print("  "); // print double spaces to align pyramid
            }
            for (int i = 0; i < level; i++) {
                if (index < size) { // Check if index is within bounds
                    System.out.print(list.get(index) + "  ");
                    index++;
                } else {
                    break;
                }
            }
            System.out.println();
            level *= 2;
            space--;
        }
        
    System.out.println();
}


	public String toString()
	{
		return list.toString();
	}
}

