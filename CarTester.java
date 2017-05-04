/**
 *
 * @author Waleed Mortaja,
 *contact Email : <a href="mailto:waleed.mortaja@gmail.com">waleed.mortaja@gmail.com</a>
 */

import javax.swing.JFrame;

public class CarTester {
public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("my Car");
    frame.setSize(500,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.add(new Car());
    
}
    
}
