//HEADER 
//Program Name: Ch10_Ex3
//Author: Dianna A.H.H. Toledo
//Class: CS160 Fall 2019
//Date: 11/26/2019
// Description: Draw a diagram that shows the state of the program just before the end of main. Include all local variables and the objects they refer to.
//What is the output of the program?
//At the end of main, are p1 and p2 aliased? Why or why not?

package week10_exercises;

import java.awt.Point;
import java.awt.Rectangle;

public class Ch10_Ex3 {


public static void printPoint(Point p) {
    System.out.println("(" + p.x + ", " + p.y + ")");
}

public static Point findCenter(Rectangle box) {
    int x = box.x + box.width / 2;
    int y = box.y + box.height / 2;
    return new Point(x, y);
}
public static void main(String[] args) {
    Rectangle box1 = new Rectangle(2, 4, 7, 9);
    Point p1 = findCenter(box1);
    printPoint(p1);

    box1.grow(1, 1);
    Point p2 = findCenter(box1);
    printPoint(p2);
    
	}	
}

// box1[] -> Rectangle[x[2] y[4] w[7] h[9]]
// p1[] -> findCenter[box[]->box1 x[5] y[8]] -> Point[x[5] y[8]]
// box1[] -> Rectangle[x[0] y[2] w[9] h[11]]
// p2[] -> findCenter[box[]->box1 x[5] y[8]] -> Point[x[5] y[8]]
 
// output (5, 8)/(5, 8)

// They are not. `new` creates a new object altogether

/* FOOTER
(5, 8)
(5, 8) */

