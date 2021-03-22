package LinkList.SinglyLinklistImplementation;

public class SinglyLinkListCaller {
    public static void main(String[] args){
        MylinkList<Integer> myll= new MylinkList<>();
//        myll.add(3);
//        myll.add(32);
//        myll.add(33);
//        myll.add(35);
//        myll.add(38);
        for(int i=0;i<9;i++){
            myll.add(i);
        }
        myll.addToHead(233);
        myll.print();
    }
}
