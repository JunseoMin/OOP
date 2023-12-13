class NonGen{
    Object ob;

    NonGen(Object o){
        ob = o;
    }

    Object getOb(){
        return ob;
    }

    void showType(){
        System.out.println("type of object is "+ob.getClass().getName());
    }
}


public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iob;

        iob = new NonGen(88);
        iob.showType();

        int v = (Integer)iob.getOb();

        NonGen strOb = new NonGen("Obj Str");
        String str = (String) strOb.getOb();

        System.out.println("val: "+str);
        iob = strOb;

        v = (Integer) iob.getOb();  // runtime error! 제네릭을 사용해야 하는 이유!
    }
}
