class twoD{
    int x,y;

    twoD(int a, int b){
        x = a;
        y = b;

    }
}

class threeD extends twoD{
    int z;
    threeD(int a,int b,int c){
        super(a,b);
        z = c;
    }
}

class fourD extends threeD{
    int w;
    fourD(int a, int b, int c, int d){
        super(a,b,c);
        w=d;
    }
}

class Coords<T extends twoD>{
    T[] coords;

    Coords(T[] o){coords = o;}
}

public class BoundedWildCard {
    static void showXY(Coords<?> c){// 어떤 타입이든 XY가 존재하면 가능
        for (int i = 0; i <c.coords.length ; i++) { //length는 안만들어도 있음(array의 길이)
            System.out.println(c.coords[i].x + " " +c.coords[i].y);
        }
    }
    static void showXYZ(Coords<? extends threeD> c){    // twoD는 z 요소가 없으므로 threeD로 한정해줌
        for (int i = 0; i < c.coords.length ; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y +" " + c.coords[i].z);
        }
    }

    static void showXYZW(Coords<? extends fourD> c){    // 하안선을 정해주는 느낌 extends하는 애 포함 자식클래스
        for (int i = 0; i < c.coords.length ; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y +" " + c.coords[i].z+" " + c.coords[i].w);
        }
    }


    public static void main(String[] args) {
        fourD[] fd ={
                new fourD(1,2,3,4),
                new fourD(1,2,3,4),
                new fourD(1,2,3,4),
                new fourD(1,2,3,4),
        };
        Coords locf = new Coords<fourD>(fd);

        showXYZW(locf);
    }

}
