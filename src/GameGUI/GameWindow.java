package GameGUI;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    JPanel panelStart = new JPanel();
    JPanel panelCategories = new JPanel();
    JPanel panelQuestions = new JPanel();
    JLabel label = new JLabel("Quiz Game");
    public JButton startButton = new JButton();
    JButton category1 = new JButton();
    JButton category2 = new JButton();
    JButton answer1 = new JButton();
    JButton answer2 = new JButton();
    JButton answer3 = new JButton();
    JButton answer4 = new JButton();

    public GameWindow() {
        setTitle("Quiz Game");
        panelStart.setLayout(new GridBagLayout());

        startWindow();

        setSize(400, 700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    public void startWindow() {
        StartWindow startWindow = new StartWindow(panelStart, startButton, 0, 1,
                "Starta nytt spel", label);
        startWindow.changePanel(panelStart);
        panelStart = startWindow.changePanelContent();
        add(panelStart);

        startButton.addActionListener(e -> {
            panelStart.setVisible(false);
            categoryWindow();
        });
    }

    public void categoryWindow() {
        CategoryWindow categoryWindow = new CategoryWindow(panelCategories, category1,
                category2, 0, 0, "Kategori 1", "Kategori 2");
        categoryWindow.changePanel(panelCategories);
        panelCategories = categoryWindow.changePanelContent();
        add(panelCategories);

        category1.addActionListener(e -> {
            panelCategories.setVisible(false);
            questionsWindow();
        });
        category2.addActionListener(e -> {
            panelCategories.setVisible(false);
            questionsWindow();
        });
    }

    public void questionsWindow() {
        QuestionsWindow questionsWindow = new QuestionsWindow(panelQuestions, answer1,
                answer2, answer3, answer4, 0, 0,
                "Svar 1", "Svar 2", "Svar 3", "Svar 4");
        questionsWindow.changePanel(panelQuestions);
        panelQuestions = questionsWindow.changePanelContent();
        add(panelQuestions);

        answer1.addActionListener(e -> {
            System.out.println("Du valde svar 1");
        });
        answer2.addActionListener(e -> {
            System.out.println("Du valde svar 2");
        });
        answer3.addActionListener(e -> {
            System.out.println("Du valde svar 3");
        });
        answer4.addActionListener(e -> {
            System.out.println("Du valde svar 4");
        });

    }

}
