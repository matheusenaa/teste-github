package teste;

import java.util.Date;

import Entidades.Ordenados;
import Formulario.Pedidos;

import javax.swing.JOptionPane;

public class program {

    public static void main(String[] args) {

       Pedidos pedido = new Pedidos (1080, new Date(), Ordenados.AGUARDANDO_PAGAMENTO);

        JOptionPane.showMessageDialog(null, pedido);
        
        Ordenados os1 = Ordenados.ENTREGUE;
        
        Ordenados os2 = Ordenados.valueOf("ENTREGUE");
        
       JOptionPane.showMessageDialog(null, os1);
       JOptionPane.showMessageDialog(null, os2);
    }

}
