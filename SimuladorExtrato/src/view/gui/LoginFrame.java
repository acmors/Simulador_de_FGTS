package view.gui;

import auth.SistemaAutenticacao;
import database.DataBase;
import model.Movimentacao;
import model.Usuario;
import service.ContaService;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.List;

public class LoginFrame extends JFrame {

    public LoginFrame() {
        setTitle("Login FGTS");
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.CENTER;

        JLabel cpfLabel = new JLabel("CPF:");
        JTextField cpfField = new JTextField(15);
        JLabel senhaLabel = new JLabel("Senha:");
        JPasswordField senhaField = new JPasswordField(15);
        JButton loginBtn = new JButton("Entrar");

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(cpfLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(cpfField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(senhaLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(senhaField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(loginBtn, gbc);


        loginBtn.addActionListener(e -> login(cpfField, senhaField));
        senhaField.addActionListener(e -> loginBtn.doClick());


        add(panel);
        setVisible(true);
    }

    private void login(JTextField cpfField, JPasswordField senhaField) {
        String cpf = cpfField.getText();
        String senha = new String(senhaField.getPassword());
        Usuario user = SistemaAutenticacao.login(cpf, senha);

        if (user != null) {
            ContaService cs = new ContaService();
            double saldo = DataBase.calcularSaldo(user.getContaFGTS());


            JOptionPane.showMessageDialog(this, "Bem-vindo, " + user.getNome() +
                    "\nSaldo: R$" + String.format("%.2f", saldo));


            List<Movimentacao> movs = cs.listarMovimentacoes(user);
            StringBuilder extrato = new StringBuilder("Extrato:\n\n");
            for (Movimentacao m : movs) {
                extrato.append(m.getData())
                        .append(" - ")
                        .append(m.getTipo())
                        .append(" - R$")
                        .append(String.format("%.2f", m.getValor()))
                        .append("\n");
            }
            JOptionPane.showMessageDialog(this, extrato.toString());

        } else {
            JOptionPane.showMessageDialog(this, "Login inválido");
        }
    }
}
