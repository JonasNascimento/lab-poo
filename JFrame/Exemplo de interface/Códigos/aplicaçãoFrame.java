package br.edu.ifpb;

import javax.swing.*;

public class aplicaçãoFrame extends JFrame{
    aplicaçãoFrame(){
        super("Aplicação");
        init();

        setVisible(true);
    }
    private void init(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280,720);
        setResizable(false);

        setLocationRelativeTo(null);
    }
}
