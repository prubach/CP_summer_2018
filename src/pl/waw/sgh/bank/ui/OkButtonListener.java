package pl.waw.sgh.bank.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OkButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "Ok got it!");
    }
}
