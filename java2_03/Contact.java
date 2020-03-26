package java2_03;

 class Contact {
    public String name;
    public String sdt;
    protected Contact(String sdt, String name){
        this.sdt = sdt;
        this.name = name;
    }
    public String toString(){
        return "" + name + "---->" + sdt ;
    }


 }
