import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class App extends Ventana implements ConfigurableApp {

    private static Traductor traductor = new Traductor();

    private JColorChooser colorChooser = new JColorChooser();
    private int lastTextAreaFocus = 0;

    public static void main(String[] args) {

        traductor.addIdioma(new Idioma("Español"));
        traductor.addIdioma(new Idioma("Inglés"));
        traductor.addIdioma(new Idioma("Francés"));

        for (String text : ListaPalabras.getEnglishTexts()) {
            try {
                traductor.addWord(text, "Inglés", 0);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        for (String text : ListaPalabras.getSpanishTexts()) {
            try {
                traductor.addWord(text, "Español", 0);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        for (String text : ListaPalabras.getFrenchTexts()) {
            try {
                traductor.addWord(text, "Francés", 0);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        App app = new App();
        app.setTitle("Traductor");
        app.setVisible(true);

        try {
            app.firstTextArea.setFont(new java.awt.Font("sansserif", 0, 50));
            app.secondTextArea.setFont(new java.awt.Font("sansserif", 0, 50));
            app.fontSizeLabel.setText("50px");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    @Override
    public void translateButtonMouseClicked(java.awt.event.MouseEvent evt) {

        String from = (String) jComboBox1.getSelectedItem();
        String to = (String) jComboBox2.getSelectedItem();

        try {
            FirstLabel.setText(from);
            SecondLabel.setText(to);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        if (from == "Seleccionar" || to == "Seleccionar") {
            JOptionPane.showMessageDialog(this, "Selecciona un idioma de origen y uno de destino");
            return;
        }

        if (from.equals(to)) {
            secondTextArea.setText(firstTextArea.getText());
            return;
        }

        System.out.println(from + " -> " + to);

        String text = firstTextArea.getText();
        String translated = traductor.translate(from, to, text);

        if (translated == null) {
            JOptionPane.showMessageDialog(this, "No se encontró texto");
            return;
        }

        try {
            secondTextArea.setText(translated);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void interchangeButtonMouseClicked(java.awt.event.MouseEvent evt) {
        String from = (String) jComboBox1.getSelectedItem();
        String to = (String) jComboBox2.getSelectedItem();

        if (from == "Seleccionar" || to == "Seleccionar") {
            JOptionPane.showMessageDialog(this, "Selecciona un idioma de origen y uno de destino");
            return;
        }

        try {
            jComboBox1.setSelectedItem(to);
            jComboBox2.setSelectedItem(from);

            FirstLabel.setText(to);
            SecondLabel.setText(from);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void changeColorButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("Cambiar color");

        try {
            colorChooser.setVisible(true);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        int result = JOptionPane.showConfirmDialog(this, colorChooser, "Selecciona un color",
                JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {

            if (lastTextAreaFocus == 0) {
                return;
            }

            if (lastTextAreaFocus == 1) {
                try {
                    firstTextArea.setForeground(colorChooser.getColor());
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                return;
            }

            if (lastTextAreaFocus == 2) {
                try {
                    secondTextArea.setForeground(colorChooser.getColor());
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                return;
            }

        }

    }

    @Override
    public void changeFontSizeStateChanged(javax.swing.event.ChangeEvent evt) {
        int size = (int) changeFontSize.getValue();

        if (size < 10) {
            size = 10;
        }

        if (lastTextAreaFocus == 0) {
            return;
        }

        if (lastTextAreaFocus == 1) {
            try {
                firstTextArea.setFont(new java.awt.Font("sansserif", 0, size));
                fontSizeLabel.setText(String.valueOf(size) + "px");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            return;
        }

        if (lastTextAreaFocus == 2) {
            try {
                secondTextArea.setFont(new java.awt.Font("sansserif", 0, size));
                fontSizeLabel.setText(String.valueOf(size) + "px");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            return;
        }

    }

    @Override
    public void firstTextAreaMouseClicked(java.awt.event.MouseEvent evt) {

        lastTextAreaFocus = 1;
    }

    @Override
    public void secondTextAreaMouseClicked(java.awt.event.MouseEvent evt) {

        lastTextAreaFocus = 2;

    }

}
