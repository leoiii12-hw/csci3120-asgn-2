Java source files obtained from
http://www.cambridge.org/resources/052182060X/

minijava.jj obtained from
http://www.cambridge.org/resources/052182060X/lecturers/default.htm


a.  Description of the files you added or modified (with respect to the files in
chap4.zip)
.
├── Asgn2.jj (Added)
├── Main.java (Modified)
├── Makefile (Modified)
├── README.txt (Modified)
├── input
│   ├── BinarySearch.java
│   ├── BinaryTree.java
│   ├── BubbleSort.java
│   ├── Factorial.java (Modified)
│   ├── LinearSearch.java
│   ├── LinkedList.java
│   ├── QuickSort.java
│   └── TreeVisitor.java
├── minijava.jj (Modified)
├── syntaxtree
│   ├── And.java
│   ├── ArrayAssign.java
│   ├── ArrayAssignStmtExp.java (Added)
│   ├── ArrayLength.java
│   ├── ArrayLookup.java
│   ├── Assign.java
│   ├── AssignStmtExp.java (Added)
│   ├── Block.java
│   ├── BooleanType.java
│   ├── Call.java
│   ├── ClassDecl.java
│   ├── ClassDeclExtends.java
│   ├── ClassDeclList.java
│   ├── ClassDeclSimple.java
│   ├── Divide.java (Added)
│   ├── Exp.java
│   ├── ExpList.java
│   ├── False.java
│   ├── For.java (Added)
│   ├── Formal.java
│   ├── FormalList.java
│   ├── Identifier.java
│   ├── IdentifierExp.java
│   ├── IdentifierType.java
│   ├── If.java
│   ├── IntArrayType.java
│   ├── IntegerLiteral.java
│   ├── IntegerType.java
│   ├── LessThan.java
│   ├── MainClass.java
│   ├── MethodDecl.java
│   ├── MethodDeclList.java
│   ├── Minus.java
│   ├── NewArray.java
│   ├── NewObject.java
│   ├── Not.java
│   ├── Or.java (Added)
│   ├── Plus.java
│   ├── Power.java (Added)
│   ├── Print.java
│   ├── Program.java
│   ├── Statement.java
│   ├── StatementList.java
│   ├── StmtExp.java (Added)
│   ├── StmtExpList.java (Added)
│   ├── This.java
│   ├── Times.java
│   ├── True.java
│   ├── Type.java
│   ├── UnaryMinus.java (Added)
│   ├── VarDecl.java
│   ├── VarDeclAssignStmtExp.java (Added)
│   ├── VarDeclList.java
│   └── While.java
└── visitor
    ├── DepthFirstVisitor.java
    ├── PrettyPrintVisitor.java
    ├── Task2Visitor.java (Added)
    ├── Task3Visitor.java (Added)
    ├── TypeDepthFirstVisitor.java
    ├── TypeVisitor.java (Modified)
    └── Visitor.java (Modified)

b.  Instructions to run your program.
make && make test1

c.  The assumptions you make, if any.
No

d.  Acknowledgement of third party code, files, and library (besides those included in chap4.zip) you used in your solution.
Adopted error_skipto on https://www.cs.purdue.edu/homes/hosking/javacc/doc/errorrecovery.html

e.  Any additional information that could help us understand your implementation.
Implemented error_skipbefore
