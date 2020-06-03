package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class MultiplyOperator extends Operator {
    @Override
    public int priority(){
        return 3;
    }
    @Override
    public Operand execute(Operand operandOne, Operand operandTwo){
        Operand answer = new Operand(operandOne.getValue() * operandTwo.getValue());
        return answer;
    }
}
