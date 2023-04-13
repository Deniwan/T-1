import javax.swing.*;
import java.awt.*;

public class Results {
    public void showResults(double mark){
        double progress = mark/12*100;
        String text = String.format("Вітаю з проходженням тесту, Ви набрали: %.1f", progress);
        ImageIcon imageIcon = new ImageIcon("D://Works/TIK/src/sticker.png");
        JFrame window = new JFrame("Завершення");
        JLabel congr = new JLabel("<html><body>" + text +"% правильних відповідей</body><html>");

        JLabel sticker = new JLabel();
        JButton restart = new JButton("Спробувати ще раз");
        JPanel box = new JPanel();

        congr.setFont(new Font("Times New Roman", Font.BOLD, 24));
        congr.setSize(400, 100);

        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(400, 300, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
        sticker.setIcon(scaledImageIcon);

        restart.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        restart.setSize(400, 100);
        restart.setActionCommand("Start Testing");

        restart.addActionListener(e -> {
            if ("Start Testing".equals(e.getActionCommand())){
                Testing test = new Testing();
                test.test();
                window.dispose();
            }
        });

        box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));
        box.add(congr);
        box.add(Box.createVerticalStrut(5));
        box.add(sticker);
        box.add(Box.createVerticalStrut(5));
        box.add(restart);

        box.setBounds(100, 10, 400, 500);

        window.add(box);
        window.setSize(600, 500);
        window.setLocationRelativeTo(null);
        window.setLayout(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
