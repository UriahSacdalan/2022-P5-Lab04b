// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        g.drawLine(50,50,50,225);
        g.drawLine(50,50,225,50);
        g.drawLine(50,50,125,125);
        g.drawLine(50,225,125,300);
        g.drawLine(125,125,125,300);
        g.drawLine(125,300,300,300);
        g.drawLine(125,125,300,125);
        g.drawLine(225,50,300,125);
        g.drawLine(300,125,300,300);
        g.drawLine(225,50,225,225);
        g.drawLine(225,225,50,225);
        g.drawLine(225,225,300,300);

        // DRAW SPHERE
        g.drawOval(550,50,200,200);
        g.drawOval(575,50,150,200);
        g.drawOval(600,50,100,200);
        g.drawOval(625,50,50,200);
        g.drawOval(550,125,200,50);
        g.drawOval(550,100,200,100);
        g.drawOval(550,75,200,150);

        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
        g.drawOval(750,500,100,100);
        g.drawLine(700,525,925,465);
        g.drawLine(925,465,807,625);
        g.drawLine(807,625,700,525);
        g.drawOval(699,400,238,225);

        // DRAW APCS

        //A
        g.fillRect(50,425,25,125);
        g.fillRect(75,425,25,25);
        g.fillRect(100,425,25,125);
        g.fillRect(75,475,25,25);

        //P
        g.fillRect(150,425,25,125);
        g.fillRect(175,425,50,25);
        g.fillRect(200,450,25,50);
        g.fillRect(175,475,25,25);

        //C
        g.fillRect(250,425,25,125);
        g.fillRect(275,425,50,25);
        g.fillRect(275,525,50,25);

        //S
        g.fillRect(350,425,75,25);
        g.fillRect(350,450,25,25);
        g.fillRect(350,475,75,25);
        g.fillRect(400,500,25,25);
        g.fillRect(350,525,75,25);

        // DRAW PACMEN FLOWER
        g.fillArc(525,330,100,100,135,270);
        g.fillArc(450,395,100,100,-135,270);
        g.fillArc(600,395,100,100,-45,-270);
        g.fillArc(525,460,100,100,-135,-270);


    }

}


