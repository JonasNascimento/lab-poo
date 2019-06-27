package br.edu.ifpb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cadastroFrame extends JFrame{
    cadastroFrame(){
        super("Tela de Cadastro");
        init();
        criarComponentes();

        setVisible(true);
    }
    private void init(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(450,300);
        setResizable(false);

        setLocationRelativeTo(null);
    }

    private void criarComponentes(){
        setLayout(new BorderLayout());

        JPanel painelTitulos = new JPanel();
        JPanel painelLogin = new JPanel();
        JPanel painelBotoes = new JPanel();

        JLabel tituloText = new JLabel("Cadastrar-se");
        tituloText.setFont(new Font("Verdana",Font.PLAIN,20));
        painelTitulos.add(tituloText);

        add(painelTitulos,BorderLayout.NORTH);

        //--------------------

        JLabel nomeText = new JLabel("Nome");
        painelLogin.add(nomeText);

        JTextField nomeField = new JTextField(40);
        painelLogin.add(nomeField);


        JLabel senhaText = new JLabel("Senha");
        painelLogin.add(senhaText);

        JPasswordField senhaField = new JPasswordField(40);
        painelLogin.add(senhaField);

        JLabel reSenhaText = new JLabel("Confirmar Senha");
        painelLogin.add(reSenhaText);

        JPasswordField reSenhaField = new JPasswordField(40);
        painelLogin.add(reSenhaField);

        add(painelLogin, BorderLayout.CENTER);

        //-------------------------//2o
        JButton cadastrarBotao = new JButton("Cadastrar-se");
        painelBotoes.add(cadastrarBotao);

        JButton fecharBotao = new JButton("Fechar");
        fecharBotao.addActionListener(new fecharAction());
        painelBotoes.add(fecharBotao);

        add(painelBotoes, BorderLayout.SOUTH);


    }


    private class fecharAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            cadastroFrame.this.dispose();
        }
    }



}
