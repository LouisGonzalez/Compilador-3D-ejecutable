/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import operacionesInterfaz.NuevaHoja;

/**
 *
 * @author luisGonzalez
 */
public class Principal extends javax.swing.JFrame {

    private NuevaHoja nueva = new NuevaHoja();
    private ArrayList<String> textos = new ArrayList<>();
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbed = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        opAbrir = new javax.swing.JMenu();
        opNuevo = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        opAbrir.setText("Archivo");

        opNuevo.setText("Nuevo");
        opNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opNuevoActionPerformed(evt);
            }
        });
        opAbrir.add(opNuevo);

        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        opAbrir.add(jMenuItem2);

        jMenuItem3.setText("Guardar");
        opAbrir.add(jMenuItem3);

        jMenuItem4.setText("Guardar Como");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        opAbrir.add(jMenuItem4);

        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        opAbrir.add(menuSalir);

        jMenuBar1.add(opAbrir);

        jMenu2.setText("Generar Codigo");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ejecutar");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbed, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbed, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuSalirActionPerformed

    private void opNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opNuevoActionPerformed
        PanelPrincipal nuevo = new PanelPrincipal("", "", textos, tabbed.getTabCount());
        tabbed.addTab("Sin nombre", nuevo);
        tabbed.setTabComponentAt(tabbed.getTabCount()-1, nueva.crearCabecera("Sin nombre", tabbed));
    }//GEN-LAST:event_opNuevoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        File archivoNuevo;
        JFileChooser chooser = new JFileChooser();
        String seleccion = "Seleccione un archivo";
        chooser.setCurrentDirectory(new File("."));
        chooser.setDialogTitle(seleccion);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if(chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            System.out.println("getCurrentDirectory(): "+chooser.getCurrentDirectory());
            System.out.println("getSelectedFile(): "+chooser.getSelectedFile());
            archivoNuevo = new File(chooser.getSelectedFile().getAbsolutePath());
            FileReader reader = null;
            BufferedReader buffer = null;
            String texto = "";
            nueva.crearHoja(archivoNuevo, reader, buffer, texto, tabbed, textos);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         GuardarArchivo guardar = new GuardarArchivo(null, true, textos.get(tabbed.getSelectedIndex()), "mlg");
         guardar.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenu opAbrir;
    private javax.swing.JMenuItem opNuevo;
    private javax.swing.JTabbedPane tabbed;
    // End of variables declaration//GEN-END:variables
}
