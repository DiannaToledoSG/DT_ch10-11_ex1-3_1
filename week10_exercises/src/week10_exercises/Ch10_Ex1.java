//HEADER 
//Program Name: Ch10_Ex1
//Author: Dianna A.H.H. Toledo
//Class: CS160 Fall 2019
//Date: 11/26/2019
// Description: For the following program, draw a stack diagram showing the local variables and parameters of main and riddle just before riddle returns. Use arrows to show which objects each variable references.
// What is the output of the program?
// Is the blank object mutable or immutable? How can you tell?

package week10_exercises;

import java.awt.Point;

public class Ch10_Ex1 {


public static int riddle(int x, Point p) {
    x = x + 7;
    return x + p.x + p.y;
}
public static void main(String[] args) {
    int x = 5;
    Point blank = new Point(1, 2);

    System.out.println(riddle(x, blank));
    System.out.println(x);
    System.out.println(blank.x);
    System.out.println(blank.y);

//  main.x   [5]
//  main.blank[] -> Point[x[1] y[2]]
//  riddle.x [5]
//  riddle [x[5]  <-----|]
//  riddle [x[12] <-----|]

//  output: 15/5/1/2

//  mutable; It is possible to change the fields.

	}
}

/* FOOTER

 *15
 *5
 *1
 *2 */
