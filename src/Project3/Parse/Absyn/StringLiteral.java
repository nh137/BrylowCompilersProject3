package Absyn;

public class StringLiteral extends Expr{

	public String value;
	public StringLiteral(String value){
		this.value= value;
	}
	
	public String toString()
	  {   return "";   }
	
	public void accept(Visit.Visitor v)      {          v.visit(this);   }
}
