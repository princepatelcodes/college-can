import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean
@RequestScoped
public class Fact {
    private String n;
    private int f = 1;
    
    public int getF() {
        int m = Integer.parseInt(n);
        for(int i=m;i>0;i--)
            f = f * i;
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }
    
    public Fact() {
    }
    
}
