public class DeliveryDetailsPrinter {
    private Sorter sorter;

    public DeliveryDetailsPrinter(Sorter sorter){
        this.sorter = sorter;
    }

    public void sortPrinter(){
        sorter.sortDetails();   // detail한 구현을 interface 통해 구현 가능
        //print functions
    }
    public static void main(String[] args) {
    }
}
