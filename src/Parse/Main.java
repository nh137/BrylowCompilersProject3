
public class Main {
	 public static void main(String[] args)
	  {
	    Absyn.Goal g = null;
	    try
	      {
	        java.io.FileReader reader = new java.io.FileReader(args[0]);
	        g = new Parser(reader).Goal();
	      }
	    catch (java.io.IOException e)
	      {
	        System.err.println(e.toString());
	      }
	    catch (ParseException p)
	      {
	        System.out.println(p.toString());
	        System.exit(-1);
	      }
//
//	    // Print Visitor
//	    System.out.println("Input String:");
//	    Visit.PrintVisitor pv = new Visit.PrintVisitor();
//	    pv.visit(g);
//	    System.out.println();
//	    System.out.println();
//
//	    System.out.println("Abstract Syntax Tree:");
//	    Visit.AbsynPrintVisitor apv = new Visit.AbsynPrintVisitor();
//	    apv.visit(g);
//	    System.out.println();
//	    System.out.println();
//
//	    System.out.println("Interpreter:");
//	    Visit.Interpreter interp = new Visit.Interpreter();
//	    System.out.println(interp.visit(g));
	  }
}
