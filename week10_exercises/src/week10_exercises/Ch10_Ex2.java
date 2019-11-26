//HEADER 
//Program Name: Ch10_Ex2
//Author: Dianna A.H.H. Toledo
//Class: CS160 Fall 2019
//Date: 11/26/2019
// Description: Draw a stack diagram showing the state of the program just before distance returns. Include all variables and parameters, and show the objects those variables refer to.
// What is the output of this program? 

package week10_exercises;

import java.awt.Point;
import java.awt.Rectangle;

public class Ch10_Ex2 {


public static double distance(Point p1, Point p2) {
    int dx = p2.x - p1.x;
    int dy = p2.y - p1.y;
    return Math.sqrt(dx * dx + dy * dy);
}

public static Point findCenter(Rectangle box) {
    int x = box.x + box.width / 2;
    int y = box.y + box.height / 2;
    return new Point(x, y);
}
public static void main(String[] args) {
    Point blank = new Point(5, 8);

    Rectangle rect = new Rectangle(0, 2, 4, 4);
    Point center = findCenter(rect);

    double dist = distance(center, blank);
    System.out.println(dist);
	}
}

// main.blank[] -> Point [x[5] y[8]]
// main.rect[] -> Rect [x[0] y[2] w[4] h[4]]
// main.center[] -> findCenter[rect[]-^ x[1] y[3]] -> Point [x[1] y[3]]
// main.dist[distance[p1[]->center p2[] -> blank dx[4] dy[3]]

//output: 5.0

/* FOOTER
5.0
 */