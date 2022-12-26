public class LoopAndArray {
    public static void main(String[] args) {
        System.out.println("---------------\nMethod for each:");
        String [] arrayName = new String[] {"Java", "C++", "Python", "Pascal", "C", "Javascript"};
        for (String nameInit : arrayName) {
            System.out.println(nameInit);
        }
        System.out.println("----------------\nMethod ForI:");
        for (int i = 0; i < arrayName.length ; i++) {
            System.out.println(arrayName[i]);
        }
    }
}
