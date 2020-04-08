import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
importar javax.swing.JFrame;
importar javax.swing.JMenu;
importar javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
importar javax.swing.WindowConstants;

classe pública Exercicio01 estende JFrame {

    public Exercicio01() {
        JMenuBar barraMenu = novo JMenuBar();
        JMenuItem opCliente, fechar;
        setTitle(" Menu Cadastro ");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 100);
        JMenu exers = new JMenu(" Cadastrar ");
        opCliente = exers.add(" Veículos ");
        exers.addSeparator();
        fechar = exers.add(" Fechar ");
        barraMenu.adicionar(exers);

        opCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                novo Veiculo();
            }
        });
        fechar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (JOptionPane.showConfirmDialog(null, " Fechar aplicação? ", " Fechar ", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    Sistema.saída(0);
                }
            }
        });
        setJMenuBar(barraMenu);
        setVisible(true);
    }

    public static void main(String[] args) {
        Exercício01 umaJanela = novo Exercício01();
        umaJanela.setBounds(50, 100, 400, 150);
        umaJanela.setResizable(false);
        umaJanela.setLocationRelativeTo(null);
        umaJanela.setVisible(true);
    };
}