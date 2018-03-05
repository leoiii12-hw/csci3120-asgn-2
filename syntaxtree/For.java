package syntaxtree;

import visitor.Visitor;
import visitor.TypeVisitor;

public class For extends Statement {
  public StmtExpList sel1;
  public Exp e;
  public StmtExpList sel2;
  public Statement s;

  public For(StmtExpList asel1, Exp ae, StmtExpList asel2, Statement as) {
    sel1=asel1;
    e=ae;
    sel2=asel2;
    s=as;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

  public Type accept(TypeVisitor v) {
    return v.visit(this);
  }
}
