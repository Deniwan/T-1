import javax.swing. *;
import java.awt. *;
import java.util.Objects;

public class Testing {
    int page = 1;
    double mark = 0;
    public void test(){
        JFrame window = new JFrame("Тестування");

        JPanel oneOfMany = new JPanel();
        JPanel manyOfMany = new JPanel();

        JLabel ask1 = new JLabel("<html><body>1. Що таке блог?</body></html>");
        ask1.setFont(new Font("Times New Roman", Font.BOLD,24));

        JLabel ask2 = new JLabel("<html><body>5. Які платформи можна використовувати для створення блогу?</body></html>");
        ask2.setFont(new Font("Times New Roman", Font.BOLD,24));

        JLabel ask3 = new JLabel("<html><body>9. Відповідність теми блогу та його опису</body></html>");
        ask3.setFont(new Font("Times New Roman", Font.BOLD,24));
        JLabel accord1 = new JLabel("<html><body>1) Подорожницький блог</body></html>");
        accord1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        JLabel accord2 = new JLabel("<html><body>2) Кулінарний блог </body></html>");
        accord2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        JLabel accord3 = new JLabel("<html><body>3) Модний блог</body></html>");
        accord3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        JLabel accord4 = new JLabel("<html><body>4) Фотоблог</body></html>");
        accord4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        JLabel accord5 = new JLabel("<html><body>a) Рецепти страв з усього світу</body></html>");
        accord5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        JLabel accord6 = new JLabel("<html><body>b) Фотографії з різних країн</body></html>");
        accord6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        JLabel accord7 = new JLabel("<html><body>c) Огляди модних трендів та подій</body></html>");
        accord7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        JLabel accord8 = new JLabel("<html><body>d) Краса та здоров'я - поради та рекомендації</body></html>");
        accord8.setFont(new Font("Times New Roman", Font.PLAIN, 22));

        String[] options = {"a)", "b)", "c)", "d)"};
        JComboBox<String> answ1 = new JComboBox<>(options);
        answ1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        JComboBox<String> answ2 = new JComboBox<>(options);
        answ2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        JComboBox<String> answ3 = new JComboBox<>(options);
        answ3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        JComboBox<String> answ4 = new JComboBox<>(options);
        answ4.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        JPanel fin = new JPanel();
        JPanel fin1 = new JPanel();
        JPanel fin2 = new JPanel();
        JPanel fin3 = new JPanel();
        fin.setLayout(new BoxLayout(fin, BoxLayout.X_AXIS));
        fin1.setLayout(new BoxLayout(fin1, BoxLayout.Y_AXIS));
        fin2.setLayout(new BoxLayout(fin2, BoxLayout.Y_AXIS));
        fin3.setLayout(new BoxLayout(fin3, BoxLayout.Y_AXIS));

        fin1.add(accord1);
        fin1.add(Box.createVerticalStrut(40));
        fin1.add(accord2);
        fin1.add(Box.createVerticalStrut(40));
        fin1.add(accord3);
        fin1.add(Box.createVerticalStrut(40));
        fin1.add(accord4);

        fin2.add(answ1);
        fin2.add(Box.createVerticalStrut(10));
        fin2.add(answ2);
        fin2.add(Box.createVerticalStrut(10));
        fin2.add(answ3);
        fin2.add(Box.createVerticalStrut(10));
        fin2.add(answ4);

        fin3.add(accord5);
        fin3.add(Box.createVerticalStrut(40));
        fin3.add(accord6);
        fin3.add(Box.createVerticalStrut(40));
        fin3.add(accord7);
        fin3.add(Box.createVerticalStrut(40));
        fin3.add(accord8);

        fin.add(fin1);
        fin.add(Box.createHorizontalStrut(10));
        fin.add(fin2);
        fin.add(Box.createHorizontalStrut(10));
        fin.add(fin3);

        ask3.setBounds(5, 10, 600, 50);
        fin.setBounds(5, 60, 600, 300);
        ask3.setVisible(false);
        fin.setVisible(false);

        JRadioButton a = new JRadioButton("а) Фотографічний альбом");
        JRadioButton b= new JRadioButton("b) Журнал, в якому публікують свої думки та ідеї");
        JRadioButton c = new JRadioButton("c) Книга ресептів");
        a.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        c.setFont(new Font("Times New Roman", Font.PLAIN, 22));

        oneOfMany.setLayout(new BoxLayout(oneOfMany, BoxLayout.Y_AXIS));
        oneOfMany.add(ask1);
        oneOfMany.add(Box.createVerticalStrut(20));
        oneOfMany.add(a);
        oneOfMany.add(Box.createVerticalStrut(10));
        oneOfMany.add(b);
        oneOfMany.add(Box.createVerticalStrut(10));
        oneOfMany.add(c);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(a);
        buttonGroup.add(b);
        buttonGroup.add(c);
        oneOfMany.setBounds(5, 10, 600, 400);

        JCheckBox a1 = new JCheckBox("a) Facebook, Instagram, Twitter");
        JCheckBox b1 = new JCheckBox("b) Wordpress, Blogger, Tumblr");
        JCheckBox c1 = new JCheckBox("c) Google, Yahoo, Bing");
        a1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        c1.setFont(new Font("Times New Roman", Font.PLAIN, 22));

        manyOfMany.setLayout(new BoxLayout(manyOfMany, BoxLayout.Y_AXIS));
        manyOfMany.add(ask2);
        manyOfMany.add(Box.createVerticalStrut(10));
        manyOfMany.add(a1);
        manyOfMany.add(Box.createVerticalStrut(10));
        manyOfMany.add(b1);
        manyOfMany.add(Box.createVerticalStrut(10));
        manyOfMany.add(c1);
        manyOfMany.setBounds(5, 10, 600, 400);
        manyOfMany.setVisible(false);

        JButton next = new JButton("Наступне");
        next.setSize(100, 50);
        next.setFont(new Font("Times New Roman", Font.BOLD, 24));
        next.setBackground(Color.gray);
        next.setActionCommand("Give answer and move to next");
        next.addActionListener(e->{
            switch (page){
                case 1:
                    if (b.isSelected()) mark++;
                    page++;
                    ask1.setText("<html><body>2. Яку тематику можна вести в блозі?</html></html>");
                    a.setText("a) Тільки про своє особисте життя");
                    b.setText("b) Тільки про культуру та мистецтво");
                    c.setText("c) Будь-яку, яка цікавить автора");
                    buttonGroup.clearSelection();
                    window.revalidate();
                    window.repaint();
                    break;
                case 2:
                    if (c.isSelected()) mark++;
                    page++;
                    ask1.setText("<html><body>3. Який з наведених варіантів не є типовим блогом?</body></html>");
                    a.setText("a) Фотоблог");
                    b.setText("b) Кулінарний блог");
                    c.setText("c) Телевізійний серіал");
                    buttonGroup.clearSelection();
                    window.revalidate();
                    window.repaint();
                    break;
                case 3:
                    if (c.isSelected()) mark++;
                    page++;
                    ask1.setText("<html><body>4. Яка мета ведення блогу?</body></html>");
                    a.setText("a) Заради популярності");
                    b.setText("b) Для заробітку грошей");
                    c.setText("c) Для висловлення своїх думок та ідеї");
                    buttonGroup.clearSelection();
                    window.revalidate();
                    window.repaint();
                    break;
                case 4:
                    if (c.isSelected())mark++;
                    page++;
                    oneOfMany.setVisible(false);
                    manyOfMany.setVisible(true);
                    window.revalidate();
                    window.repaint();
                    break;
                case 5:
                    if (b1.isSelected() && !c1.isSelected() && a1.isSelected()) mark++;
                    else if (b1.isSelected() && !c1.isSelected() && !a1.isSelected()) mark = mark+0.5;
                    else if (!c1.isSelected() && !b1.isSelected() && a1.isSelected()) mark = mark+0.5;
                    page++;
                    ask2.setText("<html><body>6. Які теми можна обговорювати в коментарях до постів на блозі?</body><html>");
                    a1.setText("a) Тільки теми, пов'язані з постом");
                    b1.setText("b) Будь-які теми");
                    c1.setText("c) Теми, які згадані у профілі автора блогу");
                    a1.setSelected(false);
                    b1.setSelected(false);
                    c1.setSelected(false);
                    window.revalidate();
                    window.repaint();
                    break;
                case 6:
                    if (b1.isSelected() && !a1.isSelected() && !c1.isSelected()) mark++;
                    page++;
                    ask2.setText("<html><body>7. Які переваги має ведення блогу?</body></html>");
                    a1.setText("a) Збільшення доходів");
                    b1.setText("b) Розвиток письмових навичок");
                    c1.setText("c) Вільне спілкування з читачами та іншими блогерами");
                    a1.setSelected(false);
                    b1.setSelected(false);
                    c1.setSelected(false);
                    window.revalidate();
                    window.repaint();
                    break;
                case 7:
                    if (b1.isSelected() && c1.isSelected() && !a1.isSelected()) mark++;
                    else if (b1.isSelected() && !c1.isSelected() && !a1.isSelected()) mark = mark+0.5;
                    else if (c1.isSelected() && !b1.isSelected() && !a1.isSelected()) mark = mark+0.5;
                    page++;
                    ask2.setText("<html><body>8. Як впливає якість контенту на успіх блогу?</body></html>");
                    a1.setText("a) Якість контенту не має значення");
                    b1.setText("b) Якість контенту має велике значення");
                    c1.setText("c) Якість контенту впливає тільки на кількість підписників");
                    a1.setSelected(false);
                    b1.setSelected(false);
                    c1.setSelected(false);
                    window.revalidate();
                    window.repaint();
                    break;
                case 8:
                    if (b1.isSelected() && !c1.isSelected() && !a1.isSelected()) mark++;
                    page++;
                    manyOfMany.setVisible(false);
                    ask3.setVisible(true);
                    fin.setVisible(true);
                    window.revalidate();
                    window.repaint();
                    break;
                case 9:
                    if(Objects.equals(answ1.getSelectedItem(), "b)")) mark += 0.5;
                    if(Objects.equals(answ2.getSelectedItem(), "a)")) mark += 0.5;
                    if(Objects.equals(answ3.getSelectedItem(), "c)")) mark += 0.5;
                    if(Objects.equals(answ4.getSelectedItem(), "d)")) mark += 0.5;
                    page++;
                    ask3.setText("<html><body>10. Відповідність формату блогу та його опису:</body></html>");
                    accord1.setText("<html><body>1) Груповий блог</body><html>");
                    accord2.setText("<html><body>2) Тематичний блог</body><html>");
                    accord3.setText("<html><body>3) Особистий блог</body><html>");
                    accord4.setText("<html><body>4) Новинний блог</body><html>");
                    accord5.setText("<html><body>a) Особисті роздуми та історії</body><html>");
                    accord6.setText("<html><body>b) Огляди новин та подій у світі</body><html>");
                    accord7.setText("<html><body>c) Спільне обговорення теми та обмін думками</body><html>");
                    accord8.setText("<html><body>d) Публікації на певну тему, пов'язану зі спеціалізацією</body><html>");
                    next.setText("Завершити");
                    window.revalidate();
                    window.repaint();
                    break;
                case 10:
                    if(Objects.equals(answ1.getSelectedItem(), "c)")) mark += 0.5;
                    if(Objects.equals(answ2.getSelectedItem(), "d)")) mark += 0.5;
                    if(Objects.equals(answ3.getSelectedItem(), "a)")) mark += 0.5;
                    if(Objects.equals(answ4.getSelectedItem(), "b)")) mark += 0.5;

                    System.out.print(mark);
                    Results show = new Results();
                    show.showResults(mark);
                    window.dispose();

            }
        });
        next.setBounds(150, 375, 300, 50);

        window.add(oneOfMany);
        window.add(manyOfMany);
        window.add(ask3);
        window.add(fin);
        window.add(next);
        window.setSize(600, 500);
        window.setLocationRelativeTo(null);
        window.setLayout(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
