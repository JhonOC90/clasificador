/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;



/**
 *
 * @author Jonatan Ortiz
 */
public class entrenador extends javax.swing.JFrame {
int totale;
int totali;
int totalf;
ArrayList<String> dir_esp = new ArrayList<String>();

    
    

    /**
     * Creates new form entrenador
     */
    public entrenador() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public int gettotalpe(){
        return totale;
    }
    
    public int gettotalpi(){
        return totali;
    }
    
    public int gettotalpf(){
        return totalf;
    }
    
    public ArrayList<String> getespanol(){
        return dir_esp;
    }
    
    //public static void main (String[] args){
      //  int totale;
        //totale = 0;
    //}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idioma = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        frase = new javax.swing.JTextField();
        regresar = new javax.swing.JButton();
        guardafrase = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Entrenamiento");

        idioma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno", "Español", "Ingles", "Frances" }));
        idioma.setToolTipText("");
        idioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idiomaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Escriba un texto");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Seleccione el idioma del texto:");

        frase.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        frase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fraseActionPerformed(evt);
            }
        });

        regresar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        guardafrase.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guardafrase.setText("Guardar");
        guardafrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardafraseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(frase))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(guardafrase, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(idioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(guardafrase)
                .addGap(18, 18, 18)
                .addComponent(regresar)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        menu main = new menu();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed
    
    private void guardafraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardafraseActionPerformed
        String separar = frase.getText();
        String[] fragmentos = separar.split(" ");
        
        String opcion = (String) idioma.getSelectedItem (); 
            
        if (!"Seleccione uno".equals (opcion)){
            if ("Español".equals(opcion)){
            int num_esp = 0;
            for (String fragmento : fragmentos) {
                if (fragmento.length()>2){
                   
                    if (fragmento != fragmento){
                        System.out.println(1);
                    }else{
                        dir_esp.add(fragmento);
                        num_esp++;
                    }
                    
                }
            }
            System.out.println(dir_esp);
            JOptionPane.showMessageDialog(null, "Se guardaron " + num_esp + " palabras en español" );
            totale = totale + num_esp;
            JOptionPane.showMessageDialog(null, "Exiten " + totale +" palabras guardadas en Idioma español" );
            frase.setText(null);
            }
            if ("Ingles".equals(opcion)){
                int num_ing = 0;
                for (int i=0; fragmentos.length > 2; i++){
                    String[] dir_ing;
                    num_ing++;
            }
        }
            if ("Frances".equals(opcion)){
                int num_fra = 0;
                for (int i=1; fragmentos.length > 2; i++){
                    String[] dir_fra;
                    num_fra++;
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Por favor seleccione un idioma");
        }
              
        
    }//GEN-LAST:event_guardafraseActionPerformed

    private void idiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idiomaActionPerformed

    private void fraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fraseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fraseActionPerformed

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
            java.util.logging.Logger.getLogger(entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new entrenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField frase;
    private javax.swing.JButton guardafrase;
    private javax.swing.JComboBox<String> idioma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
