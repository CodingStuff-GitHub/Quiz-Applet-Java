package com.java.GQuiz;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletQuiz extends Applet implements ActionListener {
    private TextField nameField;
    private RandomQuestionGenerator randomQuestionGenerator = new RandomQuestionGenerator();
    private Button okButton2;
    private Button okButton3;
    private Button okButton5;
    private Button okButton4;
    private Button okButton6;

    private int correct_answer = 0;
    private String correct_answer_text = "7";

    public void init() {
        setLayout(new FlowLayout());
        okButton2 = new Button("Option A");
        okButton3 = new Button("Option B");
        okButton4 = new Button("Option C");
        okButton5 = new Button("Option D");
        okButton6 = new Button("Next Question/Skip");
        nameField = new TextField("How many days in a week ?     A)7       B)8       C)9      D)10");
        // always says where the component should be placed when adding
        // Options are center,East,West,North and South
        add(okButton2, "North");
        add(okButton3, "West");
        add(okButton4, "East");
        add(okButton5, "South");
        add(okButton6, "South");

        okButton2.addActionListener(this);
        okButton3.addActionListener(this);
        okButton4.addActionListener(this);
        okButton5.addActionListener(this);
        okButton6.addActionListener(this);
    }

    public void paint(Graphics g) {
        g.drawString(nameField.getText(), 20, 100);
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == okButton6) {
            int x = RandomNumberGenerator.Random();
            nameField.setText(randomQuestionGenerator.getQuestion(x));
            correct_answer = randomQuestionGenerator.getCorrectAnswer(x);
            correct_answer_text = randomQuestionGenerator.getAnswer(x);
            repaint();
        }
        if (evt.getSource() == okButton2) {
            if (correct_answer == 0)
                nameField.setText("Correct Answer");
            else
                nameField.setText("Wrong Answer.Correct Answer is " + correct_answer_text);
            repaint();
        }
        if (evt.getSource() == okButton3) {
            if (correct_answer == 1)
                nameField.setText("Correct Answer");
            else
                nameField.setText("Wrong Answer.Correct Answer is " + correct_answer_text);
            repaint();
        }
        if (evt.getSource() == okButton4) {
            if (correct_answer == 2)
                nameField.setText("Correct Answer");
            else
                nameField.setText("Wrong Answer.Correct Answer is " + correct_answer_text);
            repaint();
        }
        if (evt.getSource() == okButton5) {
            if (correct_answer == 3)
                nameField.setText("Correct Answer");
            else
                nameField.setText("Wrong Answer.Correct Answer is " + correct_answer_text);
            repaint();
        }
    }
}
