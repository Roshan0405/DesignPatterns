package dp.prototype;

public class IntelligentStudent extends Student{
    int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent() {
    }

    public IntelligentStudent(IntelligentStudent is) {
        this.iq = is.iq;
    }
}
