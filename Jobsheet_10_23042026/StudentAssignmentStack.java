package Jobsheet_10_23042026;

public class StudentAssignmentStack {
    StudentA19[] stack;
    int size;
    int top;

    StudentAssignmentStack (int sizE) {
        this.size = sizE;
        top = -1;
        stack = new StudentA19[sizE];
    }

    boolean isFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push (StudentA19 std) {
        if (!isFull()) {
            top++;
            stack[top] = std;
        } else {
            System.out.println("Stack is already full!!");
        }
    }

    StudentA19 pop () {
        if (!isEmpty()) {
            StudentA19 std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("There is no data in stack!!");
            return null;
        }
    }

    StudentA19 peek () {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no data in stack!!");
            return null;
        }
    }

    StudentA19 peekBottom () {
        if (!isEmpty()) {
            return stack[0];
        } else {
            return null;
        }
    }

    int count () {
        return top +1;
    }

    void print () {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nim+"\t"+stack[i].name+"\t"+stack[i].className);
        }
        System.out.println("");
    }

    String convertToBinary (int grade) {
        ConversionStack19 stack = new ConversionStack19();
        while (grade != 0) {
            int mod = grade % 2;
            stack.push(mod);
            grade = grade / 2;
        }
        String binary = "";
        while (!stack.isEmpty()) {
            binary += stack.pop();
        }
        return binary;
    }
}
