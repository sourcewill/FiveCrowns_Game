/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelo.JogadorDAO;

/**
 *
 * @author willr
 */
public class FrmEditarJogador extends javax.swing.JFrame {

    /**
     * Creates new form FrmEditarJogador
     * @param id
     * @param nome
     * @param pontos
     */
    public FrmEditarJogador(Integer id, String nome, Integer pontos) {
        initComponents();
        //this.setLocationRelativeTo(null);
        this.txtId.setText(id.toString());
        this.txtNome.setText(nome);
        this.txtPontos.setText(pontos.toString());
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagens/icone-1.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFechar = new javax.swing.JLabel();
        lblCancelar = new javax.swing.JLabel();
        lblSalvar = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtPontos = new javax.swing.JTextField();
        lblFundo = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Five Crowns - Editar");
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao-fechar.fw.png"))); // NOI18N
        lblFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblFecharMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblFecharMouseReleased(evt);
            }
        });
        getContentPane().add(lblFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        lblCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao-cancelar.fw.png"))); // NOI18N
        lblCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCancelarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblCancelarMouseReleased(evt);
            }
        });
        getContentPane().add(lblCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 170, 70));

        lblSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao-salvar.fw.png"))); // NOI18N
        lblSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalvarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSalvarMouseReleased(evt);
            }
        });
        getContentPane().add(lblSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 170, 70));

        txtNome.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        txtNome.setForeground(new java.awt.Color(81, 27, 98));
        txtNome.setBorder(null);
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 320, 40));

        txtPontos.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        txtPontos.setForeground(new java.awt.Color(81, 27, 98));
        txtPontos.setBorder(null);
        getContentPane().add(txtPontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 320, 40));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo-editar.fw.png"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtId.setEditable(false);
        txtId.setBorder(null);
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharMouseEntered
        lblFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao-fechar2.fw.png")));
    }//GEN-LAST:event_lblFecharMouseEntered

    private void lblFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharMouseExited
        lblFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao-fechar.fw.png")));
    }//GEN-LAST:event_lblFecharMouseExited

    private void lblFecharMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharMouseReleased
        dispose();
    }//GEN-LAST:event_lblFecharMouseReleased

    private void lblCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseEntered
        lblCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao-cancelar2.fw.png")));
    }//GEN-LAST:event_lblCancelarMouseEntered

    private void lblCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseExited
        lblCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao-cancelar.fw.png")));
    }//GEN-LAST:event_lblCancelarMouseExited

    private void lblCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseReleased
        dispose();
    }//GEN-LAST:event_lblCancelarMouseReleased

    private void lblSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalvarMouseEntered
        lblSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao-salvar2.fw.png")));
    }//GEN-LAST:event_lblSalvarMouseEntered

    private void lblSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalvarMouseExited
        lblSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao-salvar.fw.png")));
    }//GEN-LAST:event_lblSalvarMouseExited

    private void lblSalvarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalvarMouseReleased
        Integer id = Integer.parseInt(txtId.getText());
        String nome = txtNome.getText();
        Integer pontos;
        try{
        pontos = Integer.parseInt(txtPontos.getText());
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite números no campo de pontos!", "Erro", 0);
            return;
        }
        JogadorDAO jDao = new JogadorDAO();
        jDao.alterar(id, nome, pontos);
        JOptionPane.showMessageDialog(null, "Jogador editado com sucesso!", "Sucesso", 1);
        dispose();
    }//GEN-LAST:event_lblSalvarMouseReleased

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblFechar;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblSalvar;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPontos;
    // End of variables declaration//GEN-END:variables
}
