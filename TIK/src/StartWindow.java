import javax.swing.*;
import java.awt.*;

public class StartWindow {
    public static void window (){
        JFrame w = new JFrame("Введення");
        JButton b = new JButton("Почати тестування");
        JLabel l1 = new JLabel("Вітаю, це программа-тестування на тему:");
        JLabel l2 = new JLabel("Ведення блогів");
        JLabel l3 = new JLabel("Тест складається з 10 питань різного типу");

        b.setBounds(170 , 350 , 230 , 50);
        b.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        b.setActionCommand("Start Testing");

        b.addActionListener(e -> {
            if ("Start Testing".equals(e.getActionCommand())){
                Testing test = new Testing();
                test.test();
                w.dispose();
            }
        });

        l1.setBounds(87, 50, 425, 50);
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 24));

        l2.setBounds(220, 120, 210, 50);
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 24));

        l3.setBounds(77, 190, 450, 50);
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 24));

        w.add(b);
        w.add(l1);
        w.add(l2);
        w.add(l3);
        w.setSize(600, 500);
        w.setLocationRelativeTo(null);
        w.setLayout(null);
        w.setVisible(true);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
