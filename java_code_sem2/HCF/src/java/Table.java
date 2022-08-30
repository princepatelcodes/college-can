/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Lakshman Raj
 */
@ManagedBean
@RequestScoped
public class Table {
    private String n1;
    private String n2;
    private int gcd;

    public int getGcd() {
        int m1=Integer.parseInt(n1);
        int m2=Integer.parseInt(n2);
        for(int i=1; i <= m1 && i <= m2; i++)
        {
            if(m1%i==0 && m2%i==0)
                gcd = i;
        }
        return gcd;
    }

    public void setGcd(int gcd) {
        this.gcd = gcd;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }
    
    public Table() {
    }
    
}
