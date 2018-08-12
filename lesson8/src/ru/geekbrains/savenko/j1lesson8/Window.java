package ru.geekbrains.savenko.j1lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame {
    public Window() {
        setBounds(200, 200, 1024, 600);
        setTitle("GUI Dem window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));
        JPanel[] jp = new JPanel[4];
        for (int i = 0; i < 4; i++) {
            jp[i] = new JPanel();
            this.add(jp[i]);
            jp[i].setBackground(new Color(100 + i * 40, 100 + i * 40, 100 + i * 40));
        }

        jp[0].setLayout(new BorderLayout());
        JTextArea jta = new JTextArea();
        JScrollPane jsp = new JScrollPane(jta);
        jp[0].add(jsp);

        jp[1].setLayout(new FlowLayout());
        JRadioButton[] jrb = new JRadioButton[4];
        ButtonGroup bgr = new ButtonGroup();
        ButtonGroup bgr2 = new ButtonGroup();
        ButtonGroup bgr3 = new ButtonGroup();
        for (int i = 0; i < jrb.length; i++) {
            jrb[i] = new JRadioButton("Option #" + i);
            if (i < 2) {
                bgr.add(jrb[i]);
            } else {
                bgr2.add(jrb[i]);
            }
            jp[1].add(jrb[i]);
        }
        JCheckBox[] jcb = new JCheckBox[4];
        for (int i = 0; i < jcb.length; i++) {
            jcb[i] = new JCheckBox("Check #" + i);
            jp[1].add(jcb[i]);
        }


        jp[2].setLayout(new FlowLayout());
        String[] comboStr = {"Выбор #1", "Выбор #1"};
        String[] comboStr2 = {"Выбор #2", "Выбор #2"};
        JComboBox<String> jcombo1 = new JComboBox<>(comboStr);
        JComboBox<String> jcombo2 = new JComboBox<>(comboStr2);
        JButton button = new JButton("Кнопка");
        JLabel jLabel = new JLabel("Состояние выбора");
        jp[2].add(jcombo1);
        jp[2].add(jcombo2);
        jp[2].add(button);
        jp[2].add(jLabel);

        jcombo1.addActionListener(e -> jLabel.setText("Выбран первый селектор"));
        jcombo2.addActionListener(e -> jLabel.setText("Выбран второй селектор"));
        button.addActionListener(e -> jLabel.setText("Была нажата кнопка!"));

//        jcombo1.addActionListener(e -> System.out.println("///*-8565"));

        jp[3].setLayout(null);
        JSlider js = new JSlider();
        JLabel jlab = new JLabel("Value: 50");
        js.setMaximum(100);
        js.setMinimum(0);
        js.setValue(50);
        jp[3].add(jlab);
        jp[3].add(js);
        js.addChangeListener(e -> jlab.setText("Value: " + js.getValue()));

        jlab.setBounds(10, 10, 100, 20);
        js.setBounds(20, 40, 300, 100);
        js.setBackground(new Color(160, 255, 160));


        JMenuBar mainMenu = new JMenuBar();
        JMenu mFile = new JMenu("File");
        JMenu mEdit = new JMenu("Edit");
        JMenu mAbout = new JMenu("About");
        JMenuItem miFileNew = new JMenuItem("New");
        JMenuItem miFileExit = new JMenuItem("Exit");

        setJMenuBar(mainMenu);

        mainMenu.add(mFile);
        mainMenu.add(mEdit);
        mainMenu.add(mAbout);

        mFile.add(miFileNew);
        mFile.addSeparator();
        mFile.add(miFileExit);

        miFileExit.addActionListener(e -> System.exit(0));

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("BYE BYE!");
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Click");
            }
        });

        setVisible(true);
    }
}
