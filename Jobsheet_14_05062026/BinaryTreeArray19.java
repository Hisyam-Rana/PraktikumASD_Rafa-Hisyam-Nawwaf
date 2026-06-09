package Jobsheet_14_05062026;

public class BinaryTreeArray19 {
    Student19[] data;
    int idxLast;
    
    public BinaryTreeArray19() {
        data = new Student19[15];
        idxLast = -1;
    }
    
    void populateData(Student19[] inputData, int idxLast) {
        this.idxLast = idxLast;
        for (int i = 0; i <= idxLast; i++) {
            if (i < this.data.length) {
                this.data[i] = inputData[i];
            }
        }
    }
    
    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                traverseInOrder(2* idxStart +1);
                data[idxStart].print();
                traverseInOrder(2* idxStart +1);
            }
        }
    }
    
    public void add(Student19 student) {
        if (idxLast < data.length - 1) {
            idxLast++;
            data[idxLast] = student;
        } else {
            System.out.println("Tree Array is full! Cannot add more data.");
        }
    }
    
    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                data[idxStart].print();
                traversePreOrder(2* idxStart +1);
                traversePreOrder(2* idxStart +2);
            }
        }
    }
}
