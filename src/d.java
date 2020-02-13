import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class d extends JFrame implements ChangeListener
{
    private int level;
    public d()
    {
        setTitle("Sierpinski Gasket");
        createComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,500);
    }

    private void createComponents()
    {
        setLayout(new BorderLayout());
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 20, 0);
        slider.addChangeListener(this);
        slider.setMajorTickSpacing(1);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        add(slider, BorderLayout.SOUTH);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        JSlider slider = (JSlider)e.getSource();
        level = slider.getValue();
        repaint();
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int w = getWidth();
        int h = getHeight();
//leave space on top and bottom of frame
        Point p1 = new Point(w/2, 30);
        Point p2 = new Point(10, h - 80);
        Point p3 = new Point(w-10, h- 80);
        drawGasket(g, level, p1, p2, p3);
    }

    private void drawGasket(Graphics g, int level, Point p1, Point p2, Point p3)
    {
        Graphics2D g2 = (Graphics2D)g;

        if(level > 0)
        {
//find the co-ordinates of the dividing triangle
            Point p4 = new Point((p1.x+p2.x)/2, (p1.y+p2.y)/2);
            Point p5 = new Point((p2.x+p3.x)/2, (p2.y+p3.y)/2);
            Point p6 = new Point((p3.x+p1.x)/2, (p3.y+p1.y)/2);


//draw the 3 triangles using the calculated points
            drawGasket(g2, level-1, p1, p4, p6);
            drawGasket(g2, level-1, p4, p2, p5);
            drawGasket(g2, level-1, p6, p5, p3);
        }

        g.drawLine(p1.x, p1.y, p2.x, p2.y);
        g.drawLine(p2.x, p2.y, p3.x, p3.y);
        g.drawLine(p3.x, p3.y, p1.x, p1.y);

    }

    public static void main(String[] args) {
        d g =new d();
        g.setVisible(true);
    }

}
