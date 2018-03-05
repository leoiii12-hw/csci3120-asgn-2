package syntaxtree;

import visitor.TypeVisitor;
import visitor.Visitor;

public class AssignStmtExp extends StmtExp {
    public Identifier i;
    public Exp e;

    public AssignStmtExp(Identifier ai, Exp ae) {
        i=ai;
        e=ae;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public Type accept(TypeVisitor v) {
        return v.visit(this);
    }
}
