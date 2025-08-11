import javax.swing.*;
import java.awt.*;
public class GridDrawer extends Canvas {
    public void paint(Graphics g) {
        int rows = 20;
        int cols = 20;
        int cellSize = 35;
        int offSetX = 10;
        int offSetY = 10;
        for (int i = 0; i <= cols; i++) {
            int x = offSetX + i * cellSize;
            g.drawLine(x, offSetY, x, offSetY + rows * cellSize);

        }
        for (int i = 0; i <= rows; i++) {
            int y = offSetY + i *cellSize;
            g.drawLine(offSetX, y, offSetX + cols * cellSize, y);
        }

    }
    public static void main (String [] args) {
        JFrame frame = new JFrame("20 x 20 Grid");
        GridDrawer grid = new GridDrawer();
        frame.add(grid);
        frame.setSize(720, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


}
