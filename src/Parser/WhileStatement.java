package Parser;

public class WhileStatement extends Statement
{
	private TestExpression testExpression;
	private Statement trueStatement;
	
	public WhileStatement(TestExpression testExpression, Statement trueStatement)
	{
		super("Question Statement");
		this.testExpression = testExpression;
		this.trueStatement = trueStatement;

	}

	public String toString()
	{
		return super.toString() + "\n\t" + this.testExpression.toString() +
				"\n\t\t" + this.trueStatement.toString() ;		
	}

	public TestExpression getTestExpression() {
		return testExpression;
	}

	public Statement getTrueStatement() {
		return trueStatement;
	}


	
}

