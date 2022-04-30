package br.edu.ifpb;

import javax.management.JMException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class loginFrame extends JFrame{
	loginFrame(){
        super("Tela de Login");
        init();
        criarMenu();
        criarComponentes();


        setVisible(true);
    }

    private void init(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,200);
        setResizable(false);

        setLocationRelativeTo(null);
    }

    private void criarMenu(){
	    JMenuBar menuBar = new JMenuBar();
	    setJMenuBar(menuBar);

	    JMenu ajudaMenu = new JMenu("Ajuda");
	    menuBar.add(ajudaMenu);

	    JMenu sobreMenu = new JMenu("Sobre");
        menuBar.add(sobreMenu);

	    JMenuItem consultarManual_ajuda = new JMenuItem("Consultar Manual");
	    ajudaMenu.add(consultarManual_ajuda);

        JMenuItem contato_ajuda = new JMenuItem("Contato");
        contato_ajuda.addActionListener(new contatoAction());
        ajudaMenu.add(contato_ajuda);

    }

    private void criarComponentes(){
        setLayout(new BorderLayout());

        JPanel painelTitulos = new JPanel();
        JPanel painelLogin = new JPanel();
        JPanel painelBotoes = new JPanel();

        JLabel tituloText = new JLabel("Login");
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

        add(painelLogin, BorderLayout.CENTER);

        //-------------------------//2o

        JButton entrarBotao = new JButton("Entrar");
        entrarBotao.addActionListener(new loginAction());
        painelBotoes.add(entrarBotao);

        JButton cadastrarBotao = new JButton("Cadastrar-se");
        cadastrarBotao.addActionListener(new cadastroAction());
        painelBotoes.add(cadastrarBotao);

        JButton fecharBotao = new JButton("Fechar");
        fecharBotao.addActionListener(new fecharAction());
        painelBotoes.add(fecharBotao);

        add(painelBotoes, BorderLayout.SOUTH);

	}

	private class fecharAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private class cadastroAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            cadastroFrame cadastroFrame = new cadastroFrame();
        }
    }

    private class loginAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showInternalMessageDialog(null, "Login feito com sucesso");
            aplicaçãoFrame app = new aplicaçãoFrame();
            loginFrame.this.dispose();
        }
    }

    private class contatoAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showInternalMessageDialog(null, "                 Jonas, Jorge\n jonashnascimento@gmail.com");
        }
    }

}