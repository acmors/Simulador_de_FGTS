package view.gui;

import auth.SistemaAutenticacao;
import model.Usuario;
import service.ContaService;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    public LoginFrame() {
        setTitle("Login FGTS");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza na tela

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel cpfLabel = new JLabel("CPF:");
        JTextField cpfField = new JTextField(15);

        JLabel senhaLabel = new JLabel("Senha:");
        JPasswordField senhaField = new JPasswordField(15);

        JButton loginBtn = new JButton("Entrar");

        gbc.insets = new Insets(5, 5, 5, 5); // Espaçamento entre os componentes
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(cpfLabel, gbc);

        gbc.gridx = 1;
        panel.add(cpfField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(senhaLabel, gbc);

        gbc.gridx = 1;
        panel.add(senhaField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(loginBtn, gbc);
        getRootPane().setDefaultButton(loginBtn);

        loginBtn.addActionListener(e -> {
            String cpf = cpfField.getText();
            String senha = new String(senhaField.getPassword());
            Usuario user = SistemaAutenticacao.login(cpf, senha);

            if (user != null) {
                ContaService cs = new ContaService();
                double saldo = cs.visualizarSaldo(user);
                String saldoFormatado = String.format("R$ %.2f", saldo);
                JOptionPane.showMessageDialog(this, "Bem-vindo, " + user.getNome() + "\nSaldo: " + saldoFormatado);

            } else {
                JOptionPane.showMessageDialog(this, "Login inválido");
            }
        });

        add(panel);
        setVisible(true);
    }
}