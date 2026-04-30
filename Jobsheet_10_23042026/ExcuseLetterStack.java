package Jobsheet_10_23042026;

public class ExcuseLetterStack {
    ExcuseLetter19[] ES;
    int size;
    int top;

    ExcuseLetterStack (int sizE) {
        this.size = sizE;
        top = -1;
        ES = new ExcuseLetter19[sizE];
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

    void push (ExcuseLetter19 EL) {
        if (!isFull()) {
            top++;
            ES[top] = EL;
        } else {
            System.out.println("Stack is already full!!");
        }
    }

    ExcuseLetter19 pop () {
        if (!isEmpty()) {
            ExcuseLetter19 EL = ES[top];
            top--;
            return EL;
        } else {
            System.out.println("There is no data in stack!!");
            return null;
        }
    }

    ExcuseLetter19 peek () {
        if (!isEmpty()) {
            return ES[top];
        } else {
            System.out.println("There is no data in stack!!");
            return null;
        }
    }

    void print () {
        for (int i = 0; i <= top; i++) {
            System.out.println(ES[i].id+"\t"+ES[i].name+"\t"+ES[i].className);
        }
        System.out.println("");
    }

    public void searchByName(String search) {
        if (isEmpty()) {
            System.out.println("The stack is empty. No data to search.");
            return;
        }

        boolean isFound = false;
        System.out.println("--- Search Results for '" + search + "' ---");
        for (int i = top; i >= 0; i--) {
            if (ES[i].name.equalsIgnoreCase(search)) {
                System.out.print("Found at Stack Level " + i + " -> ");
                ES[i].print();
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("No excuse letter found for the name: " + search);
        }
    }
}
