import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class Main extends JFrame {

    private JPanel contentPane;
    private JTextField txtDensity;
    private JTextField txtHeight;
    private JTextField txtPressure;
    private JButton btnCalculate;
    private JButton btnClear;

    // Фізична константа: прискорення вільного падіння (м/с^2)
    private final double G = 9.81;     

    public Main() {
        // Налаштування головного вікна програми
        setTitle("Лабораторна робота - Варіант 18 (2)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 420, 250);
        setResizable(false);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null); // Абсолютне позиціювання
        setContentPane(contentPane);

        // --- Створення підписів та текстових полів ---
        JLabel lblDensity = new JLabel("Густина ρ (кг/м³):");
        lblDensity.setBounds(30, 30, 150, 20);
        contentPane.add(lblDensity);

        txtDensity = new JTextField();
        txtDensity.setBounds(180, 30, 180, 25);
        contentPane.add(txtDensity);

        JLabel lblHeight = new JLabel("Висота стовпа h (м):");
        lblHeight.setBounds(30, 65, 150, 20);
        contentPane.add(lblHeight);

        txtHeight = new JTextField();
        txtHeight.setBounds(180, 65, 180, 25);
        contentPane.add(txtHeight);

        JLabel lblPressure = new JLabel("Тиск p (Па):");
        lblPressure.setBounds(30, 100, 150, 20);
        contentPane.add(lblPressure);

        txtPressure = new JTextField();
        txtPressure.setBounds(180, 100, 180, 25);
        contentPane.add(txtPressure);

        // --- Створення кнопок ---
        btnCalculate = new JButton("Обчислити");
        btnCalculate.setBounds(40, 150, 140, 35);
        contentPane.add(btnCalculate);

        btnClear = new JButton("Очистити");
        btnClear.setBounds(200, 150, 140, 35);
        contentPane.add(btnClear);

        // --- Слухач для текстових полів (Додаткове завдання) ---
        DocumentListener docListener = new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { checkLock(); }
            public void removeUpdate(DocumentEvent e) { checkLock(); }
            public void changedUpdate(DocumentEvent e) { checkLock(); }
        };
        
        txtDensity.getDocument().addDocumentListener(docListener);
        txtHeight.getDocument().addDocumentListener(docListener);
        txtPressure.getDocument().addDocumentListener(docListener);

        // --- Обробник натискання кнопки "Обчислити" ---
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });

        // --- Обробник натискання кнопки "Очистити" ---
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtDensity.setText("");
                txtHeight.setText("");
                txtPressure.setText("");
                
                txtDensity.setEditable(true);
                txtHeight.setEditable(true);
                txtPressure.setEditable(true);
            }
        });

        setVisible(true); // Відображення форми
    }

    /**
     * Метод блокування поля: якщо 2 поля заповнені, 3-тє стає недоступним для вводу
     */
    private void checkLock() {
        boolean hasD = !txtDensity.getText().trim().isEmpty();
        boolean hasH = !txtHeight.getText().trim().isEmpty();
        boolean hasP = !txtPressure.getText().trim().isEmpty();

        int filled = (hasD ? 1 : 0) + (hasH ? 1 : 0) + (hasP ? 1 : 0);

        if (filled == 2) {
            if (!hasD) txtDensity.setEditable(false);
            if (!hasH) txtHeight.setEditable(false);
            if (!hasP) txtPressure.setEditable(false);
        } else if (filled < 2) {
            txtDensity.setEditable(true);
            txtHeight.setEditable(true);
            txtPressure.setEditable(true);
        }
    }

    /**
     * Метод виконання розрахунків в залежності від заблокованого поля
     */
    private void calculate() {
        try {
            // Заміна ком на крапки для уникнення помилок формату
            String dStr = txtDensity.getText().replace(',', '.').trim();
            String hStr = txtHeight.getText().replace(',', '.').trim();
            String pStr = txtPressure.getText().replace(',', '.').trim();

            if (!txtPressure.isEditable() || (dStr.length() > 0 && hStr.length() > 0 && pStr.isEmpty())) {
                // Знаходимо Тиск: p = rho * g * h
                double d = Double.parseDouble(dStr);
                double h = Double.parseDouble(hStr);
                double p = d * G * h;
                txtPressure.setText(String.format(Locale.US, "%.2f", p));
            } 
            else if (!txtDensity.isEditable() || (pStr.length() > 0 && hStr.length() > 0 && dStr.isEmpty())) {
                // Знаходимо Густину: rho = p / (g * h)
                double p = Double.parseDouble(pStr);
                double h = Double.parseDouble(hStr);
                double d = p / (G * h);
                txtDensity.setText(String.format(Locale.US, "%.2f", d));
            }
            else if (!txtHeight.isEditable() || (pStr.length() > 0 && dStr.length() > 0 && hStr.isEmpty())) {
                // Знаходимо Висоту: h = p / (rho * g)
                double p = Double.parseDouble(pStr);
                double d = Double.parseDouble(dStr);
                double h = p / (G * d);
                txtHeight.setText(String.format(Locale.US, "%.2f", h));
            } else {
                JOptionPane.showMessageDialog(this, "Будь ласка, заповніть рівно 2 поля для розрахунку!");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Помилка! Вводьте лише числа.");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}