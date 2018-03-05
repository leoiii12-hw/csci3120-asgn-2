package syntaxtree;

import visitor.TypeVisitor;
import visitor.Visitor;

public class VarDeclAssignStmtExp extends StmtExp {
    public Type t;
    public Identifier i;
    public Exp e;

    public VarDeclAssignStmtExp(Type at,Identifier ai, Exp ae) {
        t=at;
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
