
package calculadora;

public class Calculadora_uno extends javax.swing.JFrame {
    
 Metodos metodox=new Metodos();

    public Calculadora_uno() {
        initComponents();
        
        this.setLocationRelativeTo(null);
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new javax.swing.JTextField();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_mas = new javax.swing.JButton();
        btn_menos = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_seno = new javax.swing.JButton();
        btn_coseno = new javax.swing.JButton();
        btn_tangente = new javax.swing.JButton();
        btn_raiz = new javax.swing.JButton();
        btn_cotangente = new javax.swing.JButton();
        btn_secante = new javax.swing.JButton();
        btn_cosecante = new javax.swing.JButton();
        btnalcuadrado = new javax.swing.JButton();
        btn_alapotencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_1.setText("1");
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_1MouseClicked(evt);
            }
        });

        btn_2.setText("2");
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_2MouseClicked(evt);
            }
        });

        btn_3.setText("3");
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_3MouseClicked(evt);
            }
        });

        btn_4.setText("4");
        btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_4MouseClicked(evt);
            }
        });

        btn_5.setText("5");
        btn_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_5MouseClicked(evt);
            }
        });

        btn_6.setText("6");
        btn_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_6MouseClicked(evt);
            }
        });

        btn_7.setText("7");
        btn_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_7MouseClicked(evt);
            }
        });
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_8.setText("8");
        btn_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_8MouseClicked(evt);
            }
        });

        btn_9.setText("9");
        btn_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_9MouseClicked(evt);
            }
        });
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_0.setText("0");
        btn_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_0MouseClicked(evt);
            }
        });

        btn_punto.setText(".");
        btn_punto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_puntoMouseClicked(evt);
            }
        });

        btn_igual.setText("=");
        btn_igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_igualMouseClicked(evt);
            }
        });

        btn_mas.setText("+");
        btn_mas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_masMouseClicked(evt);
            }
        });

        btn_menos.setText("-");
        btn_menos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_menosMouseClicked(evt);
            }
        });

        btn_multiplicacion.setText("*");
        btn_multiplicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_multiplicacionMouseClicked(evt);
            }
        });

        btn_division.setText("/");
        btn_division.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_divisionMouseClicked(evt);
            }
        });

        btn_seno.setText("sin");
        btn_seno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_senoMouseClicked(evt);
            }
        });

        btn_coseno.setText("cos");
        btn_coseno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cosenoMouseClicked(evt);
            }
        });

        btn_tangente.setText("tan");
        btn_tangente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tangenteMouseClicked(evt);
            }
        });

        btn_raiz.setText("raiz");
        btn_raiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_raizMouseClicked(evt);
            }
        });

        btn_cotangente.setText("cot");
        btn_cotangente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cotangenteMouseClicked(evt);
            }
        });

        btn_secante.setText("sec");
        btn_secante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_secanteMouseClicked(evt);
            }
        });

        btn_cosecante.setText("cosc");
        btn_cosecante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cosecanteMouseClicked(evt);
            }
        });

        btnalcuadrado.setText("^2");
        btnalcuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnalcuadradoMouseClicked(evt);
            }
        });
        btnalcuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalcuadradoActionPerformed(evt);
            }
        });

        btn_alapotencia.setText("x^y");
        btn_alapotencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_alapotenciaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_mas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_seno, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cotangente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnalcuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_multiplicacion))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_menos)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_coseno)
                                    .addComponent(btn_tangente)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_punto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_igual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_division)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_raiz)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_cosecante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_secante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)
                        .addComponent(btn_alapotencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_1)
                    .addComponent(btn_2)
                    .addComponent(btn_3)
                    .addComponent(btn_mas)
                    .addComponent(btn_seno)
                    .addComponent(btn_cotangente)
                    .addComponent(btnalcuadrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_4)
                    .addComponent(btn_5)
                    .addComponent(btn_6)
                    .addComponent(btn_menos)
                    .addComponent(btn_coseno)
                    .addComponent(btn_secante)
                    .addComponent(btn_alapotencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_7)
                    .addComponent(btn_8)
                    .addComponent(btn_9)
                    .addComponent(btn_multiplicacion)
                    .addComponent(btn_tangente)
                    .addComponent(btn_cosecante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_0)
                    .addComponent(btn_punto)
                    .addComponent(btn_igual)
                    .addComponent(btn_division)
                    .addComponent(btn_raiz))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseClicked

        txt.setText(metodox.concatenamiento("1"));
    }//GEN-LAST:event_btn_1MouseClicked

    private void btn_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseClicked
 txt.setText(metodox.concatenamiento("2"));          
    }//GEN-LAST:event_btn_2MouseClicked

    private void btn_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseClicked
        txt.setText(metodox.concatenamiento("3"));
    }//GEN-LAST:event_btn_3MouseClicked

    private void btn_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseClicked
 txt.setText(metodox.concatenamiento("4"));    }//GEN-LAST:event_btn_4MouseClicked

    private void btn_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MouseClicked
        txt.setText(metodox.concatenamiento("5"));
    }//GEN-LAST:event_btn_5MouseClicked

    private void btn_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseClicked
        txt.setText(metodox.concatenamiento("6"));// TODO add your handling code here:
    }//GEN-LAST:event_btn_6MouseClicked

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MouseClicked
      txt.setText(metodox.concatenamiento("7")); // TODO add your handling code here:
    }//GEN-LAST:event_btn_7MouseClicked

    private void btn_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_8MouseClicked
        txt.setText(metodox.concatenamiento("8")); // TODO add your handling code here:
    }//GEN-LAST:event_btn_8MouseClicked

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_9MouseClicked
       txt.setText(metodox.concatenamiento("9")); // TODO add your handling code here:
    }//GEN-LAST:event_btn_9MouseClicked

    private void btn_0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_0MouseClicked
     txt.setText(metodox.concatenamiento("0"));  // TODO add your handling code here:
    }//GEN-LAST:event_btn_0MouseClicked

    private void btn_puntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_puntoMouseClicked
     txt.setText(metodox.concatenamiento(".")); // TODO add your handling code here:
    }//GEN-LAST:event_btn_puntoMouseClicked

    private void btn_igualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_igualMouseClicked
          txt.setText(""+metodox.resultado(txt.getText()));      
    }//GEN-LAST:event_btn_igualMouseClicked

    private void btn_masMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_masMouseClicked
       metodox.suma(txt.getText());
    }//GEN-LAST:event_btn_masMouseClicked

    private void btn_menosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menosMouseClicked
    metodox.resta(txt.getText());
    }//GEN-LAST:event_btn_menosMouseClicked

    private void btn_multiplicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_multiplicacionMouseClicked
     metodox.multiplicacion(txt.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_btn_multiplicacionMouseClicked

    private void btn_divisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_divisionMouseClicked
     metodox.division(txt.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_btn_divisionMouseClicked

    private void btn_senoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_senoMouseClicked
     metodox.seno(txt.getText());
    }//GEN-LAST:event_btn_senoMouseClicked

    private void btn_cosenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cosenoMouseClicked
     metodox.coseno(txt.getText());  // TODO add your handling code here:
    }//GEN-LAST:event_btn_cosenoMouseClicked

    private void btn_tangenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tangenteMouseClicked
      metodox.tangente(txt.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_btn_tangenteMouseClicked

    private void btn_raizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_raizMouseClicked
       metodox.raiz(txt.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_btn_raizMouseClicked

    private void btn_cotangenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cotangenteMouseClicked
       metodox.cotangente(txt.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_btn_cotangenteMouseClicked

    private void btn_secanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_secanteMouseClicked
      metodox.secante(txt.getText()); 
    }//GEN-LAST:event_btn_secanteMouseClicked

    private void btn_cosecanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cosecanteMouseClicked
      metodox.cosecante(txt.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_btn_cosecanteMouseClicked

    private void btnalcuadradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnalcuadradoMouseClicked
metodox.alcuadrado(txt.getText());
       
    }//GEN-LAST:event_btnalcuadradoMouseClicked

    private void btn_alapotenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_alapotenciaMouseClicked
metodox.alapotencia(txt.getText());
       
    }//GEN-LAST:event_btn_alapotenciaMouseClicked

    private void btnalcuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalcuadradoActionPerformed
       metodox.alcuadrado(txt.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_btnalcuadradoActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora_uno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_alapotencia;
    private javax.swing.JButton btn_cosecante;
    private javax.swing.JButton btn_coseno;
    private javax.swing.JButton btn_cotangente;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_mas;
    private javax.swing.JButton btn_menos;
    private javax.swing.JButton btn_multiplicacion;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_raiz;
    private javax.swing.JButton btn_secante;
    private javax.swing.JButton btn_seno;
    private javax.swing.JButton btn_tangente;
    private javax.swing.JButton btnalapotencia;
    private javax.swing.JButton btnalapotencia1;
    private javax.swing.JButton btnalapotencia10;
    private javax.swing.JButton btnalapotencia11;
    private javax.swing.JButton btnalapotencia12;
    private javax.swing.JButton btnalapotencia13;
    private javax.swing.JButton btnalapotencia14;
    private javax.swing.JButton btnalapotencia2;
    private javax.swing.JButton btnalapotencia3;
    private javax.swing.JButton btnalapotencia4;
    private javax.swing.JButton btnalapotencia5;
    private javax.swing.JButton btnalapotencia6;
    private javax.swing.JButton btnalapotencia7;
    private javax.swing.JButton btnalapotencia8;
    private javax.swing.JButton btnalapotencia9;
    private javax.swing.JButton btnalcuadrado;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
