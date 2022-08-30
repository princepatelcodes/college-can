
public class fibo {
    private String n;
    private String c;
    
    public String getC() {
        int a=1,b=1,d;
        c = String.valueOf(a) +" "+ String.valueOf(b);
        int m = Integer.parseInt(n);
        for(int i=0;i<m-2;i++){
            d=a+b;
            a=b;
            b=d;
            c = c +" "+ String.valueOf(d);
        }
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public fibo() {
        
    }
    
}
