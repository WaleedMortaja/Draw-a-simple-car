
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class Car extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        Line2D.Double l1 = new Line2D.Double(200, 200, 300, 200);
        Line2D.Double l2 = new Line2D.Double(200, 200, 150, 250);
        Line2D.Double l3 = new Line2D.Double(150, 250, 100, 250);
        Line2D.Double l4 = new Line2D.Double(100, 250, 100, 300);
        Line2D.Double l5 = new Line2D.Double(100, 300, 400, 300);
        Line2D.Double l6 = new Line2D.Double(400, 300, 400, 250);
        Line2D.Double l7 = new Line2D.Double(400, 250, 350, 250);
        Line2D.Double l8 = new Line2D.Double(350, 250, 300, 200);
        Ellipse2D.Double e1 = new Ellipse2D.Double(275,275,50,50);
        Ellipse2D.Double e2 = new Ellipse2D.Double(175,275,50,50);
       
        gr.draw(l1);
        gr.draw(l2);
        gr.draw(l3);
        gr.draw(l4);
        gr.draw(l5);
        gr.draw(l6);
        gr.draw(l7);
        gr.draw(l8);
        gr.draw(e1);
        gr.draw(e2);

    }
}
