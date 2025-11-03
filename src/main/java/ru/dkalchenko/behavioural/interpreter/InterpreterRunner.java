package ru.dkalchenko.behavioural.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJavaDeveloper = getJavaExpression();
        Expression isSpringDeveloper = getJavaSpringExpression();
        System.out.println("Does developer know Java Core: " + isJavaDeveloper.interpret("java core"));
        System.out.println("Does developer know Spring: " + isSpringDeveloper.interpret("java spring"));
    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("java");
        Expression javaCore = new TerminalExpression("java core");
        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaSpringExpression() {
        Expression java = new TerminalExpression("java");
        Expression spring = new TerminalExpression("spring");
        return new AndExpression(java, spring);
    }
}
