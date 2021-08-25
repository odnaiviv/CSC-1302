/*
 * Vivian Do
 * ID: 002-48-6640
 * June 29, 2021
 *
 * Homework 3: Task 2 (Drawing Patterns)
 */
//importing all classes for creating user interfaces, painting graphics and images
import java.awt.*;
public class hw3_task2 {
    public static void main(String[] args){
        //setting up drawing panel
        DrawingPanel drawing = new DrawingPanel(400, 400);
        //setting up graphics
        Graphics graphic = drawing.getGraphics();
        //setting background color to cyan
        drawing.setBackground(Color.CYAN);

        //drawing each circle; below provides a description on how each circle is supposed to be

        //top left circle; position is (0, 0); size of subfigures (width x height) is 100 x 100; number of circles is 10; numbers of rows/cols is 1 x 1
        CirclesAndRectangles(graphic, 0, 0, 10, 1, 1, 100, 100);

        //bottom left circle; position is (10, 180); size of subfigures (width x height) is 24 x 24; number of circles is 4; numbers of rows/cols is 6 x 6
        CirclesAndRectangles(graphic, 10, 180, 4, 6, 6, 24, 24);

        //top right circle; position is (170, 20); size of subfigures (width x height) is 40 x 40; number of circles is 5; numbers of rows/cols is 5 x 5
        CirclesAndRectangles(graphic, 170, 20, 5, 5, 5, 40, 40);

        //bottom right circle; position is (7, 240); size of subfigures (width x height) is 36 x 36; number of circles is 6; numbers of rows/cols is 4 x 4
        CirclesAndRectangles(graphic, 170, 240, 6, 4, 4, 36, 36);

    }

    //method to draw the circles and rectangles
    public static void CirclesAndRectangles (Graphics graphic, int x, int y, int circleNumber, int row, int column, int width, int height) {
        //nested for loop draws the circles from the y direction and the x direction (in that order)
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                //coloring the circles and rectangles with their respective colors
                //draws and colors a green rectangle
                graphic.setColor(Color.GREEN);
                graphic.fillRect(x + (j - 1) * width, y + (i - 1) * height, width, height);
                //draws and colors a yellow circle in front of the rectangle
                graphic.setColor(Color.YELLOW);
                graphic.fillOval(x + (j - 1) * width, y + (i - 1) * height, width, height);
            }
        }

        //setting color back to black
        graphic.setColor(Color.BLACK);
        //nest for loop for the number of rows and columns
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                //draws the outside of rectangle to the close out the subfigure
                graphic.drawRect(x + (j - 1) * width, y + (i - 1) * height, width, height);
                //initializing the x and y axis for each subfigure
                int xAxis = x + (j - 1) * width;
                int yAxis = y + (i - 1) * height;

                //calculating the spaces between each circle
                int spaces = (int) Math.ceil(width / 10);
                //decreases the space in the circle if the circle number is greater than 8
                if (circleNumber > 8)
                    spaces = spaces / 2;
                //increases the space in the circle if the circle number is less than 5
                else if (circleNumber > 5)
                    spaces--;

                //draws multiple circles with decreasing radius from the same center of each subfigure for eac circle
                for (int k = 0; k < circleNumber; k++) {
                    graphic.drawOval(xAxis + spaces * k, yAxis + spaces * k, width - spaces * 2 * k, height - spaces * 2 * k);
                }

                //draws the diagonal lines in each subfigure
                graphic.drawLine(x + (j - 1) * width, y + (i - 1) * height, x + j * width, y + i * width);
                graphic.drawLine(x + j * width, y + (i - 1) * height, x + (j - 1) * width, y + i * width);

                //draws the horizontal and vertical lines across each subfigure
                graphic.drawLine(x + (j - 1) * width + width / 2, y + (i - 1) * height, x + (j - 1) * width + width / 2, y + (i - 1) * height + height);
                graphic.drawLine(x + (j - 1) * width, y + (i - 1) * height + height / 2, x + (j - 1) * width + width, y + (i - 1) * height + height / 2);
            }
        }
    }
}
