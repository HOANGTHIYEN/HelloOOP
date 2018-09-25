
public class ps {

    public int tu;
    public int mau;
    public ps(){
        tu=1;
        mau=1;
    }
    public void setTu(int tu){
        this.tu = tu;
    }
    public int getTu(){
        return tu;
    }
    public void setMau(int mau){
        this.mau = mau;
    }
    public int getMau(){
        return tu;
    }
    public ps(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
    }
    ps nhanPS(ps p){
        ps n = new ps();
        n.tu = p.tu*this.tu;
        n.mau = p.mau*this.mau;
        return n;
    }
    ps chiaPS(ps p){
        ps c = new ps();
        c.tu = p.tu*this.mau;
        c.mau = p.mau*this.tu;
        return c;
    }
    ps congPS(ps p){
        ps co = new ps();
        co.tu = p.tu *this.mau + p.mau*this.tu;
        co.mau = p.mau*this.mau;
        return co;
    }
    ps truPS(ps p){
        ps t = new ps();
        t.tu = p.tu *this.mau - p.mau*this.tu;
        t.mau = p.mau*this.mau;
        return t;
    }
     public boolean equals( Object obj) {
            if(obj instanceof ps){    
            ps p=(ps)obj;
		if ( this.getTu() * p.getMau() == this.getMau() * p.getTu()) return true;}
                return false;
	}
}
