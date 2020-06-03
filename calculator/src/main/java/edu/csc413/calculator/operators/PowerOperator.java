package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class PowerOperator extends Operator {
    @Override
    public int priority(){
        return 4;
    }
    @Override
    public Operand execute(Operand operandOne, Operand operandTwo){
        Operand answer = new Operand(power(operandOne.getValue(),operandTwo.getValue()));
        return answer;
    }
    public int power(int a, int b){
        int answer = a;
        for( int i = 2; i <= b; i++){
            answer = answer * a;
        }
        return answer;
    }
}
