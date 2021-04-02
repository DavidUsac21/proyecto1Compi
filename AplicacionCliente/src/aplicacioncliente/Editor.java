/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncliente;

import java.awt.Desktop;
import java.awt.Dimension;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UTFDataFormatException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;

/**
 *
 * @author david
 */
public class Editor extends javax.swing.JFrame {

    /**
     * Creates new form Editor
     */
    private NumeroLinea numeroLinea;

    public Editor() {
        initComponents();
        numeroLinea = new NumeroLinea(areaTexto);
        jScrollPane1.setRowHeaderView(numeroLinea);
        super.setVisible(true);
        areaTexto.addCaretListener((CaretEvent e) -> {
            int pos = e.getDot();

            try {

                int row = areaTexto.getLineOfOffset(pos) + 1;

                int col = pos - areaTexto.getLineStartOffset(row - 1) + 1;

                areaInfo.setText("Línea:  " + row + " Columna:  " + col);

            } catch (BadLocationException exc) {

                System.out.println(exc);

            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogoRespuestas = new javax.swing.JDialog();
        areaInfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        usuarioLogeado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        dialogoRespuestas.setMinimumSize(new java.awt.Dimension(1250, 579));

        javax.swing.GroupLayout dialogoRespuestasLayout = new javax.swing.GroupLayout(dialogoRespuestas.getContentPane());
        dialogoRespuestas.getContentPane().setLayout(dialogoRespuestasLayout);
        dialogoRespuestasLayout.setHorizontalGroup(
            dialogoRespuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1250, Short.MAX_VALUE)
        );
        dialogoRespuestasLayout.setVerticalGroup(
            dialogoRespuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaInfo.setText("Linea: 0 Columna: 0");

        areaTexto.setColumns(20);
        areaTexto.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        areaTexto.setRows(5);
        jScrollPane1.setViewportView(areaTexto);

        jButton1.setText("Enviar Solicitud(es)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        usuarioLogeado.setText("Sin usuario logeado");

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Abrir Archivo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Guardar Archivo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Importar Formulario");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuario");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Info");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Cerrar sesion");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        jMenuItem6.setText("Manual para el usuario");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Manual para el tecnico");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuarioLogeado)
                .addGap(18, 18, 18)
                .addComponent(areaInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1509, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(areaInfo)
                        .addComponent(usuarioLogeado)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Usuario usuario;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!areaTexto.getText().isEmpty()) {
            mandarInstruccionesServidor("instrucciones");
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar algo para analizar en el servidor");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    TablaResultados d = new TablaResultados();
    private void mandarInstruccionesServidor(String tipo) {
        final String host = "192.168.1.14";
        final int puerto = 5000;
        DataInputStream input;
        DataOutputStream output;

        try {
            Socket socket = new Socket(host, puerto);

            input = new DataInputStream(socket.getInputStream());
            output = new DataOutputStream(socket.getOutputStream());
            switch (tipo) {
                case "instrucciones":
                    if (!areaTexto.getText().isEmpty()) {
                        String mensaje, usuarioEntrada, fechaCreacion, fechaModificacion, respuesta;
                        output.writeUTF("instrucciones");                        
                        output.writeUTF(areaTexto.getText());
                        if (usuario != null) {
                            output.writeUTF(usuario.getUsuario());
                        } else {
                            output.writeUTF("");
                        }

                        respuesta = input.readUTF();
                        usuarioEntrada = input.readUTF();
                        if (!usuarioEntrada.isEmpty()) {
                            if (usuarioEntrada.equals("eliminado")) {
                                usuario = null;
                                usuarioLogeado.setText("Sin usuairo logeado");
                            } else {
                                fechaCreacion = input.readUTF();
                                fechaModificacion = input.readUTF();
                                usuario = new Usuario(usuarioEntrada, fechaCreacion, fechaModificacion);
                                usuarioLogeado.setText("Usuario Loguedo: " + usuario.getUsuario());
                            }

                        }
                        if(!respuesta.isEmpty()){
                            dialogoRespuestas.setTitle("Respuestas servidor");
                            d.borrarDatos();
                            String[] cabecera1 = {"Tipo", "Proceso", "Detalles"};
                            d.setDatos(dialogoRespuestas, cabecera1);
                            AnalizadorRespuestas.analizar(respuesta, d.getTablaR(), this,false);
                            dialogoRespuestas.add(d, 0);
                            dialogoRespuestas.setVisible(true);
                        }else{
                            JOptionPane.showMessageDialog(this, "No se procesaron datos en el servidor");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Tiene que llenar algo en el area de texto!");
                    }
                    break;
                case "importar":
                    output.writeUTF(tipo);
                    output.writeUTF(importarTexto[0]);
                    output.writeUTF(importarTexto[1]);
                    output.writeUTF(usuario.getUsuario());
                    String respuestas = input.readUTF();
                    if(!respuestas.isEmpty()){
                        dialogoRespuestas.setTitle("Datos de importacion");
                        d.borrarDatos();
                        String[] cabecera1 = {"Tipo", "Proceso", "Detalles"};
                        d.setDatos(dialogoRespuestas, cabecera1);
                        AnalizadorRespuestas.analizar(respuestas, d.getTablaR(),this,true);
                        dialogoRespuestas.add(d, 0);
                        dialogoRespuestas.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(this, "Fallo la importacion de formulario");
                    }
                    break;
            }
            socket.close();

        } catch (java.net.ConnectException ex) {
            JOptionPane.showMessageDialog(this, "Posible error al conectar con servidor, se tiene que levantar el servidor");
            System.out.println(ex);
        }catch(UTFDataFormatException w){
            JOptionPane.showMessageDialog(this, "Problema de enviar informacion, es muy grande la entrada de texto, reduzca la entrada");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Posible error al conectar con servidor, se tiene que levantar el servidor");
        }
    }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        areaTexto.setText(manejadorArchivos.ManejadorArchivo.recuperarArchivo1(this));
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        manejadorArchivos.ManejadorArchivo.escribirArchivo(areaTexto, "txt", this);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if (usuario != null) {
            dialogoRespuestas.setTitle("Datos usuario");
            d.borrarDatos();
            String[] cabecera = {"", ""};
            d.setDatos(dialogoRespuestas, cabecera);
            String dato1[] = {"Usuario", usuario.getUsuario()};
            String dato2[] = {"Fecha creacion", usuario.getFechaCreacion()};
            String dato3[] = {"Fecha modificacion", usuario.getFechaModificacion()};
            d.agregarDatos(dato1);
            d.agregarDatos(dato2);
            d.agregarDatos(dato3);
            dialogoRespuestas.add(d, 0);
            dialogoRespuestas.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No hay usuario logeado");
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        usuario = null;
        usuarioLogeado.setText("Sin usuairo logeado");
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    String importarTexto[] = null;
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        importarTexto = manejadorArchivos.ManejadorArchivo.recuperarArchivo(this);
        if (importarTexto != null && usuario != null) {
            mandarInstruccionesServidor("importar");
        } else {
            JOptionPane.showMessageDialog(this, "No contiene informacion el archivo o no esta logueado algun usuario aun");
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    public void abrirarchivo(String archivo) {

        try {

            File objetofile = new File(archivo);
            Desktop.getDesktop().open(objetofile);

        } catch (IOException ex) {

            System.out.println(ex);

        }

    }
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        abrirarchivo("./ManualUsuario.pdf");
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        abrirarchivo("./manualTecnico.pdf");
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaInfo;
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JDialog dialogoRespuestas;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel usuarioLogeado;
    // End of variables declaration//GEN-END:variables
}
