package pl.waw.sgh.bank.ui;

import pl.waw.sgh.bank.Bank;
import pl.waw.sgh.bank.Customer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CustomerUI {
    private JTextField idTextField;
    private JTextField firstNameTextField;
    private JTextField lastNameTextField;
    private JTextField emailTextField;
    private JButton prevButton;
    private JButton deleteButton;
    private JButton saveButton;
    private JButton newButton;
    private JButton nextButton;
    private JPanel customerMainPanel;
    private JTable accTable;

    private AccountsTableModel accountsTableModel;

    private Bank bank = new Bank();

    private JPopupMenu contextMenu = new JPopupMenu("Operations on Account");

    private Customer curCust;

    public CustomerUI() {
        $$$setupUI$$$();
        newButton.addActionListener(new ActionListener() {              //this newbutton clears fields and sets a new id
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstNameTextField.setText("");
                lastNameTextField.setText("");
                emailTextField.setText("");
                idTextField.setText(new Integer(bank.getLastCustID() - 1).toString());
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fn = firstNameTextField.getText();
                String ln = lastNameTextField.getText();
                String em = emailTextField.getText();
                if (!fn.equals("") & !ln.equals("") & !em.equals("")) {
                    bank.createCustomer(fn, ln, em);
                    JOptionPane.showMessageDialog(null, bank);
                }
                if (fn.equals("") & ln.equals("") & em.equals("")) {
                    JOptionPane.showMessageDialog(customerMainPanel, "Missing data.");
                }
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer custId = Integer.parseInt(idTextField.getText());
                JOptionPane.showConfirmDialog(customerMainPanel, "Are you sure you want to delete customer: " + bank.findCustomerById(custId) + "?");
                bank.deleteCustomerAndHisHersAccounts(custId);
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!idTextField.getText().equals("")) {
                    Integer custId = Integer.parseInt(idTextField.getText());
                    int tempId;
                    if (custId < bank.getCustList().size() - 1) {
                        tempId = custId + 1;
                    } else {
                        tempId = 0;
                    }
                    displayCustomer(tempId);
                } else {
                    JOptionPane.showMessageDialog(customerMainPanel, bank.getCustList().get(0));
                    idTextField.setText("1");
                }
            }
        });
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customer tempCust = (bank.getCustList().get(bank.getCustList().size() - 1));
                if (!idTextField.getText().equals("")) {
                    Integer custId = Integer.parseInt(idTextField.getText());
                    int tempId;
                    if (!custId.equals(0)) {
                        tempId = custId - 1;
                    } else {
                        tempId = (tempCust.getCustomerID());
                    }
                    displayCustomer(tempId);
                    //JOptionPane.showMessageDialog(customerMainPanel, bank.findCustomerById(tempId));
                    //idTextField.setText(Integer.toString(tempId));
                } else {
                    JOptionPane.showMessageDialog(customerMainPanel, bank.getCustList().get(tempCust.getCustomerID()));
                    idTextField.setText(Integer.toString(tempCust.getCustomerID()));
                }
            }
        });

        // deleteButton.addActionListener();
        // prevButton
        // nextButton
    }

    public void displayCustomer(Integer custId) {
        Customer cust = bank.findCustomerById(custId);
        //JOptionPane.showMessageDialog(customerMainPanel, bank.findCustomerById(tempId));
        idTextField.setText(Integer.toString(custId));
        firstNameTextField.setText(cust.getFirstName());
        lastNameTextField.setText(cust.getLastName());
        emailTextField.setText(cust.getEmail());
    }

    public static void main(String[] args) {
        JFrame customerFrame = new JFrame("Bank");
        CustomerUI customerUI = new CustomerUI();
        customerFrame.add(customerUI.customerMainPanel);
        customerFrame.pack();
        customerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        customerFrame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        Customer cl = bank.createCustomer("John","Smith", "email");
        bank.createAccount(cl, false);
        System.out.println(bank);
        accountsTableModel = new AccountsTableModel(bank.getAccList());
        accTable = new JTable(accountsTableModel);

        JMenuItem newDebitAccount = new JMenuItem("New Debit Account");
        JMenuItem newSavingsAccount = new JMenuItem("New Savings Account");
        JMenuItem deleteAccount = new JMenuItem("Delete Account");
        contextMenu.add(newDebitAccount);
        contextMenu.add(newSavingsAccount);
        contextMenu.add(deleteAccount);
        accTable.addMouseListener(new AccountsTableMouseListener());

    }

    private class AccountsTableMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            // Is this a right click
            System.out.println(e);
            if (e.isPopupTrigger()) {
                // Show Context Menu
                contextMenu.show(e.getComponent(),e.getX(),e.getY());
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // Is this a right click
            System.out.println(e);
            if (e.isPopupTrigger()) {
                // Show Context Menu
                contextMenu.show(e.getComponent(),e.getX(),e.getY());
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }




    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        customerMainPanel = new JPanel();
        customerMainPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(4, 2, new Insets(0, 0, 0, 0), -1, -1));
        customerMainPanel.add(panel1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("ID");
        panel1.add(label1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        idTextField = new JTextField();
        panel1.add(idTextField, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(353, 24), null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("First Name");
        panel1.add(label2, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        firstNameTextField = new JTextField();
        panel1.add(firstNameTextField, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(353, 24), null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("Last Name");
        panel1.add(label3, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lastNameTextField = new JTextField();
        panel1.add(lastNameTextField, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(353, 24), null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("Email");
        panel1.add(label4, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        emailTextField = new JTextField();
        panel1.add(emailTextField, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        customerMainPanel.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 5, new Insets(0, 0, 0, 0), -1, -1));
        customerMainPanel.add(panel2, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        prevButton = new JButton();
        prevButton.setText("<");
        panel2.add(prevButton, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        saveButton = new JButton();
        saveButton.setText("Save");
        panel2.add(saveButton, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        newButton = new JButton();
        newButton.setText("New");
        newButton.setToolTipText("Add New Customer");
        panel2.add(newButton, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        nextButton = new JButton();
        nextButton.setText(">");
        panel2.add(nextButton, new com.intellij.uiDesigner.core.GridConstraints(0, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        deleteButton = new JButton();
        deleteButton.setText("Delete");
        panel2.add(deleteButton, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return customerMainPanel;
    }
}
