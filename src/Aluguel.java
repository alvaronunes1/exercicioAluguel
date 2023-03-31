import javafx.scene.control.Labeled;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Aluguel implements ActionListener {
    private JButton botao;

    public void janela2() {
        botao.addActionListener(this);

    }


    public static void main(String[] args) {




        JFrame janela = new JFrame("Aluguel de Carros");
        JButton botao = new JButton("Salvar");
        janela.setSize(400, 600);
        janela.setVisible(true);



        JPanel painel = new JPanel();
        janela.getContentPane().add(painel);
        janela.getContentPane().add(botao);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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


        //DEFINE POSICAO
        dadosCliente.setBounds(10, 30, 120, 40);
        nom.setBounds(30, 60, 100,40);
        cpf.setBounds(35, 80, 100,40);
        tel.setBounds(40, 100, 100,40);
        dadosCarro.setBounds(10, 140, 100, 40);
        nomCarro.setBounds(35, 160,100,40);
        placa.setBounds(40,180,100,40);
        ano.setBounds(45,200,100,40);
        dtaLocacao.setBounds(50,220,150,40);
        dtaEntrega.setBounds(55,240,100,40);


        //DEFINE AS MASCARAS
        MaskFormatter mascaraCpf = null;
        MaskFormatter mascaraTel = null;
        MaskFormatter mascaraPlaca = null;
        MaskFormatter mascaraAno = null;
        MaskFormatter mascaraDtaLocacao = null;
        MaskFormatter mascaraDtaEntrega = null;

        try{
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
        }
        catch (ParseException excp){
            System.out.println("Erro na formatação: ");
            System.exit(-1);
        }

        //seta as máscaras nos objetos JFormattedTextField
        JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);
        JFormattedTextField jFormattedTextTel = new JFormattedTextField(mascaraTel);
        JFormattedTextField jFormattedTextPlaca = new JFormattedTextField(mascaraPlaca);
        JFormattedTextField jFormattedTextAno = new JFormattedTextField(mascaraAno);
        JFormattedTextField jFormattedTextDtaLocacao = new JFormattedTextField(mascaraDtaLocacao);
        JFormattedTextField jFormattedTextDtaEntrega = new JFormattedTextField(mascaraDtaEntrega);
        jFormattedTextCpf.setBounds(135,80,100,40);
        jFormattedTextTel.setBounds(140,100,100,40);
        jFormattedTextPlaca.setBounds(140,180,100,40);
        jFormattedTextAno.setBounds(145,200,100,40);
        jFormattedTextDtaLocacao.setBounds(150,220,100,40);
        jFormattedTextDtaEntrega.setBounds(155,240,100,40);


    //DEFINE OS ADD
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
        painel.add(jFormattedTextCpf);
        painel.add(jFormattedTextTel);
        painel.add(jFormattedTextPlaca);
        painel.add(jFormattedTextAno);
        painel.add(jFormattedTextDtaLocacao);
        painel.add(jFormattedTextDtaEntrega);
        janela.add(botao);
        botao.setBounds(200,300,150,80);








    }

    @Override
    public void actionPerformed(ActionEvent e) {
        botao.setText("Aluguel realizado com sucesso!");

    }
}
