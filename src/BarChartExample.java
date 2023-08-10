import javax.swing.*;
import java.awt.*;

public class BarChartExample extends JFrame {
    private int[] data;

    public BarChartExample(int[] data) {
        this.data = data;
        setTitle("Bar Chart Example");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();
        int barWidth = width / data.length;

        int maxData = getMaxData();

        for (int i = 0; i < data.length; i++) {
            int barHeight = (int) (((double) data[i] / maxData) * (height - 50));
            int x = i * barWidth + 50;
            int y = height - barHeight - 50;
            g2d.setColor(Color.BLUE);
            g2d.fillRect(x, y, barWidth - 10, barHeight);
        }
    }

    private int getMaxData() {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] data = {10, 25, 30, 15, 50, 20};
        SwingUtilities.invokeLater(() -> new BarChartExample(data).setVisible(true));
    }
}
