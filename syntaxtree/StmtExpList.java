package syntaxtree;

import java.util.Vector;

public class StmtExpList {
    private Vector<StmtExp> list;

    public StmtExpList() {
        list = new Vector<StmtExp>();
    }

    public void addElement(StmtExp n) {
        list.addElement(n);
    }

    public StmtExp elementAt(int i)  {
        return (StmtExp)list.elementAt(i);
    }

    public int size() {
        return list.size();
    }
}
