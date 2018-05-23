package pl.waw.sgh.bank.ui;

import pl.waw.sgh.bank.Account;

import javax.swing.table.DefaultTableModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class AccountsTableModel extends DefaultTableModel {


    private static String[] cols = { "ID", "Type", "Currency", "Balance"};

    private List<Account> accountList = new ArrayList<>();

    public AccountsTableModel(List<Account> accList) {
        super(cols, 0);
        addRows(accList);
    }

    public void removeAllRows() {
        dataVector.clear();
        accountList.clear();
        fireTableDataChanged();
    }

    public void addRows(List<Account> accList) {
        for (Account acc : accList) {
            addRow(acc);
        }
    }

    public void addRow(Account acc) {
        accountList.add(acc);
        addRow(getVectorFromAccount(acc));
        fireTableDataChanged();
    }

    public Vector getVectorFromAccount(Account acc) {
        Vector vc = new Vector();
        vc.add(acc.getAccountID());
        vc.add(acc.getClass().getSimpleName().replace("Account",""));
        vc.add(acc.getCurrency());
        vc.add(acc.getBalance());
        return vc;
    }


    @Override
    public Class getColumnClass(int colIndex) {
        switch (colIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return BigDecimal.class;
            default:
                return Object.class;
        }
    }






}
