import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class Aluguel {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Aluguel de Carros");
        janela.setSize(600, 400);
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


        //DEFINE POSICAO
        dadosCliente.setBounds(10, 30, 120, 60);
        nom.setBounds(30, 60, 100,40);
        cpf.setBounds(35, 80, 100,40);
        tel.setBounds(40, 100, 100,40);
        dadosCarro.setBounds(10, 140, 100, 40);
        nomCarro.setBounds(30, 160,100,40);
        placa.setBounds(35,180,100,40);
        ano.setBounds(40,200,100,40);
        dtaLocacao.setBounds(45,220,150,40);
        dtaEntrega.setBounds(50,240,100,40);

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
        }











    }
}
