package Jobsheet_14_05062026;

public class BinaryTreeArray19 {
    Student19[] data;
    int idxLast;
    
    public BinaryTreeArray19() {
        data = new Student19[10];
        idxLast = -1;
    }
    
    void populateData(Student19[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
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
}
