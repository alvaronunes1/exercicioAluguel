import javafx.scene.control.Labeled;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Aluguel {



    public static void main(String[] args) {




        JFrame janela = new JFrame("Aluguel de Carros");
        janela.setSize(500, 600);
        janela.setVisible(true);
        JPanel painel = new JPanel();

        janela.getContentPane().add(painel);

        JLabel dadosCliente = new JLabel("Dados do cliente: ");

        JLabel nom = new JLabel("Nome: ");

        JLabel cpf = new JLabel("CPF: ");

        JLabel tel = new JLabel("Tel: ");

        JLabel dadosCarro = new JLabel("Dados do Carro");

        JLabel nomCarro = new JLabel("Nome: ");

        JLabel placa = new JLabel("Placa: ");

        JLabel ano = new JLabel("Ano: ");

        JLabel dtaLocacao = new JLabel("Data de Locação: ");

        JLabel dtaEntrega = new JLabel("Data de Entrega: ");

        //DEFINE OS ADD DO PAINEL

        painel.add(dadosCliente);
        painel.add(nom);
        painel.add(cpf);
        painel.add(tel);
        painel.add(dadosCarro);
        painel.add(nomCarro);
        painel.add(placa);
        painel.add(ano);
        painel.add(dtaLocacao);
        painel.add(dtaEntrega);


        //DEFINE POSICAO
        dadosCliente.setBounds(50, 80, 120, 50);
        nom.setBounds(50, 110, 100,50);
        cpf.setBounds(50, 130, 100,50);
        tel.setBounds(50, 150, 100,50);
        dadosCarro.setBounds(50, 180, 100, 50);
        nomCarro.setBounds(50, 210,100,50);
        placa.setBounds(50,230,100,50);
        ano.setBounds(50,250,100,50);
        dtaLocacao.setBounds(50,270,120,50);
        dtaEntrega.setBounds(50,290,120,50);


        //DEFINE AS MASCARAS
        MaskFormatter mascaraCpf = null;
        MaskFormatter mascaraTel = null;
        MaskFormatter mascaraPlaca = null;
        MaskFormatter mascaraAno = null;
        MaskFormatter mascaraDtaLocacao = null;
        MaskFormatter mascaraDtaEntrega = null;

        try {

            mascaraCpf = new MaskFormatter("#########-##");
            mascaraTel = new MaskFormatter("(##)####-####");
            mascaraPlaca = new MaskFormatter("UUU-####");
            mascaraAno = new MaskFormatter("####");
            mascaraDtaLocacao = new MaskFormatter("##/##/####");
            mascaraDtaEntrega = new MaskFormatter("##/##/####");
            mascaraCpf.setPlaceholderCharacter('_');
            mascaraTel.setPlaceholderCharacter('_');
            mascaraPlaca.setPlaceholderCharacter('_');
            mascaraAno.setPlaceholderCharacter('_');
            mascaraDtaLocacao.setPlaceholderCharacter('_');
            mascaraDtaEntrega.setPlaceholderCharacter('_');

        }  catch (ParseException excp){
            System.out.println("Erro na formatação: " +excp.getMessage());
            System.exit(-1);
        }

        //seta as máscaras nos objetos JFormattedTextField
        JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);
        JFormattedTextField jFormattedTextTel = new JFormattedTextField(mascaraTel);
        JFormattedTextField jFormattedTextPlaca = new JFormattedTextField(mascaraPlaca);
        JFormattedTextField jFormattedTextAno = new JFormattedTextField(mascaraAno);
        JFormattedTextField jFormattedTextDtaLocacao = new JFormattedTextField(mascaraDtaLocacao);
        JFormattedTextField jFormattedTextDtaEntrega = new JFormattedTextField(mascaraDtaEntrega);


    //DEFINE OS ADD

        painel.add(jFormattedTextCpf);
        painel.add(jFormattedTextTel);
        painel.add(jFormattedTextPlaca);
        painel.add(jFormattedTextAno);
        painel.add(jFormattedTextDtaLocacao);
        painel.add(jFormattedTextDtaEntrega);

        jFormattedTextCpf.setBounds(255,135,130,20);
        jFormattedTextTel.setBounds(255,155,130,20);
        jFormattedTextPlaca.setBounds(255,238,130,20);
        jFormattedTextAno.setBounds(255,258,130,20);
        jFormattedTextDtaLocacao.setBounds(255,278,130,20);
        jFormattedTextDtaEntrega.setBounds(255,298,130,20);

        JButton botao = new JButton("Salvar");

        painel.add(botao);

        botao.setBounds(220, 420, 130, 20);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Dados Salvos com sucesso!");
            }
        });









    }
}
