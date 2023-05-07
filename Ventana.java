import com.formdev.flatlaf.themes.FlatMacLightLaf;

/**
 *
 * @author tres
 */
public class Ventana extends javax.swing.JFrame {

        /**
         * Creates new form Ventana
         */
        public Ventana() {
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        public void initComponents() {

                FlatMacLightLaf.setup();

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jComboBox1 = new javax.swing.JComboBox<>();
                jComboBox2 = new javax.swing.JComboBox<>();
                jLabel2 = new javax.swing.JLabel();
                translateButton = new javax.swing.JButton();
                changeColorButton = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                changeFontSize = new javax.swing.JSlider();
                interchangeButton = new javax.swing.JButton();
                fontSizeLabel = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                firstTextArea = new javax.swing.JTextArea();
                FirstLabel = new javax.swing.JLabel();
                jScrollPane2 = new javax.swing.JScrollPane();
                secondTextArea = new javax.swing.JTextArea();
                jLabel5 = new javax.swing.JLabel();
                SecondLabel = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Parámetros"));
                jPanel1.setToolTipText("");

                jLabel1.setText("Idioma origen");

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Seleccionar", "Español", "Inglés", "Francés" }));

                jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Seleccionar", "Español", "Inglés", "Francés" }));

                jLabel2.setText("Idioma destino");

                translateButton.setText("Traducir");
                translateButton.setActionCommand("translateActionCommand");
                translateButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                translateButtonMouseClicked(evt);
                        }
                });
                translateButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                translateButtonActionPerformed(evt);
                        }
                });

                changeColorButton.setText("Cambiar color");
                changeColorButton.setActionCommand("changeColorActionCommand");
                changeColorButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                changeColorButtonMouseClicked(evt);
                        }
                });
                changeColorButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                changeColorButtonActionPerformed(evt);
                        }
                });

                jLabel3.setText("Cambiar tamaño de letra");

                changeFontSize.addChangeListener(new javax.swing.event.ChangeListener() {
                        public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                changeFontSizeStateChanged(evt);
                        }
                });
                changeFontSize.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
                        public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                                changeFontSizeMouseWheelMoved(evt);
                        }
                });

                interchangeButton.setText("Intercambiar");
                interchangeButton.setActionCommand("interchangeActionCommand");
                interchangeButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                interchangeButtonMouseClicked(evt);
                        }
                });
                interchangeButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                interchangeButtonActionPerformed(evt);
                        }
                });

                fontSizeLabel.setText("0px");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(changeColorButton,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(translateButton,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jComboBox2, 0,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel1)
                                                                                .addComponent(jComboBox1, 0,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(interchangeButton,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(changeFontSize,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(fontSizeLabel)))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(23, 23, 23)
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jComboBox1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jComboBox2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(translateButton)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(interchangeButton)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                95, Short.MAX_VALUE)
                                                                .addComponent(changeColorButton)
                                                                .addGap(52, 52, 52)
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(changeFontSize,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(fontSizeLabel))
                                                                .addGap(96, 96, 96)));

                jLabel4.setText("Idioma de origen");

                firstTextArea.setColumns(20);
                firstTextArea.setRows(5);
                firstTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                firstTextAreaMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(firstTextArea);

                FirstLabel.setText("Seleccionar");

                secondTextArea.setColumns(20);
                secondTextArea.setRows(5);
                secondTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                secondTextAreaMouseClicked(evt);
                        }
                });

                jScrollPane2.setViewportView(secondTextArea);

                jLabel5.setText("Idioma de destino");

                SecondLabel.setText("Seleccionar");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(15, 15, 15)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(45, 45, 45)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jScrollPane2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                476,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jLabel5)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(SecondLabel))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel4)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(FirstLabel))
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                476,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(60, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                false)
                                                                                .addComponent(jPanel1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel4)
                                                                                                                .addComponent(FirstLabel))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jScrollPane1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                209,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel5)
                                                                                                                .addComponent(SecondLabel))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jScrollPane2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                226,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(20, Short.MAX_VALUE)));

                pack();
        }// </editor-fold>

        public void firstTextAreaMouseClicked(java.awt.event.MouseEvent evt) {
                // TODO add your handling code here:
        }

        public void secondTextAreaMouseClicked(java.awt.event.MouseEvent evt) {
                // TODO add your handling code here:
        }

        public void interchangeButtonActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        public void interchangeButtonMouseClicked(java.awt.event.MouseEvent evt) {
                // TODO add your handling code here:
        }

        public void changeFontSizeMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                // TODO add your handling code here:
        }

        public void changeFontSizeStateChanged(javax.swing.event.ChangeEvent evt) {
                // TODO add your handling code here:
        }

        public void changeColorButtonActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        public void changeColorButtonMouseClicked(java.awt.event.MouseEvent evt) {
                // TODO add your handling code here:
        }

        public void translateButtonActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        public void translateButtonMouseClicked(java.awt.event.MouseEvent evt) {
                // TODO add your handling code here:
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Ventana().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify
        public javax.swing.JLabel FirstLabel;
        public javax.swing.JLabel SecondLabel;
        public javax.swing.JButton changeColorButton;
        public javax.swing.JSlider changeFontSize;
        public javax.swing.JTextArea firstTextArea;
        public javax.swing.JLabel fontSizeLabel;
        public javax.swing.JButton interchangeButton;
        public javax.swing.JComboBox<String> jComboBox1;
        public javax.swing.JComboBox<String> jComboBox2;
        public javax.swing.JLabel jLabel1;
        public javax.swing.JLabel jLabel2;
        public javax.swing.JLabel jLabel3;
        public javax.swing.JLabel jLabel4;
        public javax.swing.JLabel jLabel5;
        public javax.swing.JPanel jPanel1;
        public javax.swing.JScrollPane jScrollPane1;
        public javax.swing.JScrollPane jScrollPane2;
        public javax.swing.JTextArea secondTextArea;
        public javax.swing.JButton translateButton;
        // End of variables declaration
}