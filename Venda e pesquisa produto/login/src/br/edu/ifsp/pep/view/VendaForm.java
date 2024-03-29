package br.edu.ifsp.pep.view;

import br.edu.ifsp.pep.dao.ProdutoDAO;
import br.edu.ifsp.pep.dao.VendaDAO;
import br.edu.ifsp.pep.model.ItensVenda;
import br.edu.ifsp.pep.model.Produto;
import br.edu.ifsp.pep.model.Venda;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class VendaForm extends javax.swing.JDialog {

    private final List<ItensVenda> itensVenda = new ArrayList<>();
    private final Venda venda = new Venda(PrincipalForm.getPessoaLogada());
    private Produto produtoSelecionado;

    /**
     * Creates new form VendaForm
     */
    public VendaForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        setLocationRelativeTo(null);

//        carregarComboProdutos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        sQuantidade = new javax.swing.JSpinner();
        bFinalizar = new javax.swing.JButton();
        bRemover = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        tfProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lTitulo.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        lTitulo.setForeground(new java.awt.Color(0, 0, 102));
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("Venda");

        jLabel1.setText("Produto");

        bAdicionar.setBackground(new java.awt.Color(0, 0, 102));
        bAdicionar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        bAdicionar.setText("Adicionar");
        bAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdicionarActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quantidade", "Preço", "Preço Parcial"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        jLabel2.setText("Quantidade");

        sQuantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        bFinalizar.setBackground(new java.awt.Color(0, 51, 51));
        bFinalizar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        bFinalizar.setText("Finalizar");
        bFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFinalizarActionPerformed(evt);
            }
        });

        bRemover.setBackground(new java.awt.Color(0, 0, 102));
        bRemover.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bRemover.setForeground(new java.awt.Color(255, 255, 255));
        bRemover.setText("Remover Produto");
        bRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoverActionPerformed(evt);
            }
        });

        bCancelar.setBackground(new java.awt.Color(102, 0, 0));
        bCancelar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bCancelar.setForeground(new java.awt.Color(255, 255, 255));
        bCancelar.setText("Cancelar Venda");

        tfProduto.setEnabled(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/pep/images/search1.png"))); // NOI18N
        jLabel3.setText("Imagem");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bRemover)
                        .addGap(18, 18, 18)
                        .addComponent(bCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(bFinalizar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(199, 199, 199)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bAdicionar)
                                        .addGap(25, 25, 25))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(328, 328, 328))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdicionarActionPerformed

        if (this.produtoSelecionado == null) {
            JOptionPane.showMessageDialog(null,
                    "Escolha um Produto.", "Alerta",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        Integer quantidade = Integer.valueOf(sQuantidade.getValue().toString());

        ItensVenda itemVenda = pesquisarItemVenda(produtoSelecionado);
        try {
            atualizaItemVenda(itemVenda, produtoSelecionado, quantidade);
            atualizarTabela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    ex.getMessage(), "Alerta",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bAdicionarActionPerformed

    private void bFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFinalizarActionPerformed

        venda.setItens(itensVenda);

        try {
            new VendaDAO().inserir(venda);
            JOptionPane.showMessageDialog(null, "Venda Registrada.");
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_bFinalizarActionPerformed

    private void bRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoverActionPerformed

        int selectedRow = tabela.getSelectedRow();
        itensVenda.remove(selectedRow);

        this.atualizarTabela();


    }//GEN-LAST:event_bRemoverActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        ProdutoPesquisaForm produtoPesquisaForm = new ProdutoPesquisaForm(null, true);
        produtoPesquisaForm.setVisible(true);

        this.produtoSelecionado = produtoPesquisaForm.getProdutoSelecionado();
        if (this.produtoSelecionado != null)
            tfProduto.setText(this.produtoSelecionado.getNome());
        else
            tfProduto.setText("");
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VendaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VendaForm dialog = new VendaForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdicionar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bFinalizar;
    private javax.swing.JButton bRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JSpinner sQuantidade;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField tfProduto;
    // End of variables declaration//GEN-END:variables

//    private void carregarComboProdutos() {
//
//        ProdutoDAO produtoDAO = new ProdutoDAO();
//        DefaultComboBoxModel model = (DefaultComboBoxModel) cbProduto.getModel();
//        List<Produto> produtos = produtoDAO.buscarTodos();
//        model.addAll(produtos);
//
//    }

    private void atualizarTabela() {

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setNumRows(0);
        for (ItensVenda iv : itensVenda) {

//            double precoParcial = iv.getQuantidade() * iv.getPreco().doubleValue();
            model.addRow(new Object[]{iv.getProduto().getNome(),
                iv.getQuantidade(),
                iv.getPreco(),
                iv.getQuantidade() * iv.getPreco().doubleValue()
            });
        }
    }

    private ItensVenda pesquisarItemVenda(Produto produto) {
        for (ItensVenda iv : itensVenda) {
            if (iv.getProduto().equals(produto)) {
                return iv;
            }
        }
        return null;
    }

    private void atualizaItemVenda(ItensVenda itemVenda, Produto produto, Integer quantidade) throws Exception {
        if (itemVenda == null) {
            if (quantidade > produto.getQuantidade()) {
                throw new Exception("Quantidade Insuficiente em estoque.");
            }
            itemVenda = new ItensVenda(venda, produto, quantidade);
            this.itensVenda.add(itemVenda);
        } else {
            if (quantidade + itemVenda.getQuantidade() > produto.getQuantidade()) {
                throw new Exception("Quantidade Insuficiente em estoque.");
            }
            itemVenda.setQuantidade(quantidade + itemVenda.getQuantidade());
        }

    }
}
