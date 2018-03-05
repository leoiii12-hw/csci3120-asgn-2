package syntaxtree;

import visitor.TypeVisitor;
import visitor.Visitor;

public class ArrayAssignStmtExp extends StmtExp {
    public Identifier i;
    public Exp e1,e2;

    public ArrayAssignStmtExp(Identifier ai, Exp ae1, Exp ae2) {
        i=ai; e1=ae1; e2=ae2;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public Type accept(TypeVisitor v) {
        return v.visit(this);
    }

}
